package com.battle.framework.modules.sys.dao;

import com.battle.framework.modules.sys.domain.SysMenu;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 菜单管理
 * Created by Soldier.Cheung on 2017/07/20
 */
@Mapper
public interface SysMenuDao extends BaseDao<SysMenu> {
	
	/**
	 * 根据父菜单，查询子菜单
	 * @param parentId 父菜单ID
	 */
	List<SysMenu> queryListParentId(Long parentId);
	
	/**
	 * 获取不包含按钮的菜单列表
	 */
	List<SysMenu> queryNotButtonList();
	
	/**
	 * 查询用户的权限列表
	 */
	List<SysMenu> queryUserList(Long userId);
}
