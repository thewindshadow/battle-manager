package com.battle.framework.modules.sys.service;

import com.battle.framework.modules.sys.domain.SysRole;

import java.util.List;
import java.util.Map;


/**
 * 角色
 * Created by Soldier.Cheung on 2017/07/20
 */
public interface SysRoleService {
	
	SysRole queryObject(Long roleId);
	
	List<SysRole> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	void save(SysRole role);
	
	void update(SysRole role);
	
	void deleteBatch(Long[] roleIds);
	
	/**
	 * 查询用户创建的角色ID列表
	 */
	List<Long> queryRoleIdList(Long createUserId);
}
