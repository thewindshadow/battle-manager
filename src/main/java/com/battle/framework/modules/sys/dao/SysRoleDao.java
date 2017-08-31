package com.battle.framework.modules.sys.dao;

import com.battle.framework.modules.sys.domain.SysRole;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 角色管理
 * Created by Soldier.Cheung on 2017/07/20
 */
@Mapper
public interface SysRoleDao extends BaseDao<SysRole> {
	
	/**
	 * 查询用户创建的角色ID列表
	 */
	List<Long> queryRoleIdList(Long createUserId);
}
