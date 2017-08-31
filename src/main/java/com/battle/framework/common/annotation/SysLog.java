package com.battle.framework.common.annotation;

import java.lang.annotation.*;

/**
 * 系统日志注解
 * Created by Soldier.Cheung 2017/07/21
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface SysLog {

	String value() default "";
}
