package com.battle.framework.common.shiro;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Bing.Z on 2017/7/26.
 */
public class MyShiroRealm extends AuthorizingRealm{

    private static final Logger LOGGER = LoggerFactory.getLogger(MyShiroRealm.class);

    /**
     * 权限认证，为当前Subject授予角色和权限
     * @param principals
     * @return
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        LOGGER.info("==========执行shiro权限认证");
        String loginName = (String) super.getAvailablePrincipal(principals);
        LOGGER.info("===="+loginName);


        return null;
    }

    /**
     * 获取用户的权限信息
     * @param token
     * @return
     * @throws AuthenticationException
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        LOGGER.info("====获取用户权限信息====");

        return null;

    }
}
