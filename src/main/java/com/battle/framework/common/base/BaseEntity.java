package com.battle.framework.common.base;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Bing.Z on 2017/7/20.
 */
public abstract class BaseEntity implements Serializable {
    protected Long createBy;	// 创建者
    protected Date createDate;	// 创建日期
    protected Long updateBy;	// 更新者
    protected Date updateDate;	// 更新日期

}
