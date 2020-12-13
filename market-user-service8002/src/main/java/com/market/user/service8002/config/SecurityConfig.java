package com.market.user.service8002.config;

import com.market.user.service8002.dao.RoleDao;
import com.market.user.service8002.dao.UserDao;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import javax.annotation.Resource;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Resource
    private UserDao userDao;

    @Resource
    private RoleDao roleDao;

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
                .withUser("admin").password("admin").roles("ADMIN")
                .and()
                .withUser("user").password("user").roles("CASHIER");
    }


//    @Override
//    protected UserDetailsService userDetailsService() {
//        return super.userDetailsService();
//    }
}
