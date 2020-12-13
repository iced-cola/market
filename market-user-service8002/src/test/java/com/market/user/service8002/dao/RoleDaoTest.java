package com.market.user.service8002.dao;

import com.market.user.service8002.po.RolePo;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class RoleDaoTest {

    @Resource
    private RoleDao roleDao;

    @Test
    public void queryByRoleCode() {
        String roleCode = "ROLE_ADMIN";
        RolePo rolePo = roleDao.queryByRoleCode(roleCode);
        assertNotNull(rolePo);
        log.info("result: \n{}", rolePo);
    }
}
