package com.battle.framework.modules.sys.dao;

import com.battle.framework.modules.sys.domain.SysLog;
import org.apache.ibatis.annotations.Mapper;

/**
 * 系统日志
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2017-03-08 10:40:56
 */
@Mapper
public interface SysLogDao extends BaseDao<SysLog> {
	
}
