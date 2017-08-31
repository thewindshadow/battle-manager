package com.battle.framework.modules.sys.dao;

import com.battle.framework.modules.sys.domain.SysUserRole;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 用户与角色对应关系
 * Created by Soldier.Cheung on 2017/07/2046
 */
@Mapper
public interface SysUserRoleDao extends BaseDao<SysUserRole> {
	
	/**
	 * 根据用户ID，获取角色ID列表
	 */
	List<Long> queryRoleIdList(Long userId);
}
