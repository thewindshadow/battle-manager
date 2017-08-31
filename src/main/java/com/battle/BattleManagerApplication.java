package com.battle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * 默认情况下是自带的嵌入式容器，如果需要构建war文件并进行部署时
 * 修改启动类，继承 SpringBootServletInitializer 并重写 configure 方法
 * 打成war包放到tomcat中启动必须要这个类才行
 */
@SpringBootApplication
public class BattleManagerApplication extends SpringBootServletInitializer{

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(BattleManagerApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(BattleManagerApplication.class, args);
	}
}
