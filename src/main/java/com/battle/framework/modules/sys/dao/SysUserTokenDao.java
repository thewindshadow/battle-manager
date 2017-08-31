package com.battle.framework.modules.sys.dao;

import com.battle.framework.modules.sys.domain.SysUserToken;
import org.apache.ibatis.annotations.Mapper;

/**
 * 系统用户Token
 *
 */
@Mapper
public interface SysUserTokenDao extends BaseDao<SysUserToken> {
    
    SysUserToken queryByUserId(Long userId);

    SysUserToken queryByToken(String token);
	
}
