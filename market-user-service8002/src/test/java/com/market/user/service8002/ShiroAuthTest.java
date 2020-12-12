package com.market.user.service8002;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.mgt.DefaultSecurityManager;
import org.apache.shiro.realm.SimpleAccountRealm;
import org.apache.shiro.subject.Subject;
import org.junit.Before;
import org.junit.Test;

public class ShiroAuthTest {

    SimpleAccountRealm simpleAccountRealm = new SimpleAccountRealm();

    @Before
    public void addUser() {
        simpleAccountRealm.addAccount("user1", "pass1");
    }

    @Test
    public void authTest() {
        DefaultSecurityManager securityManager = new DefaultSecurityManager();
        securityManager.setRealm(simpleAccountRealm);

        SecurityUtils.setSecurityManager(securityManager);
        // 获取当前主体
        Subject subject = SecurityUtils.getSubject();

        UsernamePasswordToken usernamePasswordToken = new UsernamePasswordToken("user1",
                "pass1");
        subject.login(usernamePasswordToken);

        System.out.println("isAuthenticated: " + subject.isAuthenticated());

        subject.logout();

        System.out.println("isAuthenticated: " + subject.isAuthenticated());
    }
}
