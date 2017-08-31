package com.battle.user;

import com.battle.framework.modules.sys.domain.SysUser;
import com.battle.framework.modules.sys.service.SysUserService;
import com.google.common.collect.Maps;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Map;

/**
 * Created by Bing.Z on 2017/7/20.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class test {
    private static  final Logger logger = Logger.getLogger(test.class);
    @Autowired
    private SysUserService sysUserService;

    @Test
    public void test(){
        Map map = Maps.newHashMap();
        SysUser sysUser = new SysUser();
        sysUser.setUsername("王五");
        sysUser.setEmail("123@163.com");
        sysUser.setPassword("123");
        sysUser.setCreateBy(new Long(11));
        sysUserService.save(sysUser);
        List<SysUser> list = sysUserService.queryList(map);

        logger.info(list.get(0).getMobile());
    }

}
