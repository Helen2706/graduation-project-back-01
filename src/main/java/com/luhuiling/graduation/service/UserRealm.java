package com.luhuiling.graduation.service;

import com.luhuiling.graduation.po.UserDO;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

public class UserRealm extends AuthorizingRealm {
    @Autowired
    UserService userService;

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        return null;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        String username = (String)token.getPrincipal();

        UserDO userDO = userService.getByName(username);

        if(userDO == null){
            throw new UnknownAccountException();//没找到账号
        }
        if(1 == userDO.getLocked()){
            throw new LockedAccountException();//账号被锁定
        }
        SimpleAuthenticationInfo auth = new SimpleAuthenticationInfo(userDO,userDO.getPassword(),getName());
        return auth;
    }
}
