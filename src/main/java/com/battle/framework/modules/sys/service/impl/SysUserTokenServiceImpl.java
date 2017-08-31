package com.battle.framework.modules.sys.service.impl;

import com.battle.framework.common.oauth2.TokenGenerator;
import com.battle.framework.common.utils.R;
import com.battle.framework.modules.sys.dao.SysUserTokenDao;
import com.battle.framework.modules.sys.domain.SysUserToken;
import com.battle.framework.modules.sys.service.SysUserTokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;


@Service("sysUserTokenService")
public class SysUserTokenServiceImpl implements SysUserTokenService {
	@Autowired
	private SysUserTokenDao sysUserTokenDao;
	//12小时后过期
	private final static int EXPIRE = 3600 * 12;

	@Override
	public SysUserToken queryByUserId(Long userId) {
		return sysUserTokenDao.queryByUserId(userId);
	}

	@Override
	public void save(SysUserToken token){
		sysUserTokenDao.save(token);
	}
	
	@Override
	public void update(SysUserToken token){
		sysUserTokenDao.update(token);
	}

	@Override
	public R createToken(long userId) {
		//生成一个token
		String token = TokenGenerator.generateValue();

		//当前时间
		Date now = new Date();
		//过期时间
		Date expireTime = new Date(now.getTime() + EXPIRE * 1000);

		//判断是否生成过token
		SysUserToken tokenEntity = queryByUserId(userId);
		if(tokenEntity == null){
			tokenEntity = new SysUserToken();
			tokenEntity.setUserId(userId);
			tokenEntity.setToken(token);
			tokenEntity.setUpdateTime(now);
			tokenEntity.setExpireTime(expireTime);

			//保存token
			save(tokenEntity);
		}else{
			tokenEntity.setToken(token);
			tokenEntity.setUpdateTime(now);
			tokenEntity.setExpireTime(expireTime);

			//更新token
			update(tokenEntity);
		}

		R r = R.ok().put("token", token).put("expire", EXPIRE);

		return r;
	}

	@Override
	public void logout(long userId) {
		//生成一个token
		String token = TokenGenerator.generateValue();

		//修改token
		SysUserToken tokenEntity = new SysUserToken();
		tokenEntity.setUserId(userId);
		tokenEntity.setToken(token);
		update(tokenEntity);
	}
}
