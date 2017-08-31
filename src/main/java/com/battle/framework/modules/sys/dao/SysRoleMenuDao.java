package com.battle.framework.modules.sys.dao;

import com.battle.framework.modules.sys.domain.SysRoleMenu;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 角色与菜单对应关系
 *
 * Created by Soldier.Cheung on 2017/07/20
 */
@Mapper
public interface SysRoleMenuDao extends BaseDao<SysRoleMenu> {
	
	/**
	 * 根据角色ID，获取菜单ID列表
	 */
	List<Long> queryMenuIdList(Long roleId);
}
