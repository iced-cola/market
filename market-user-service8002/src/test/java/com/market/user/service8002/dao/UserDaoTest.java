package com.market.user.service8002.dao;

import com.market.user.service8002.po.UserPo;
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
public class UserDaoTest {

    @Resource
    private UserDao userDao;

    @Test
    public void queryByUserId() {
        String userId = "系统管理员";
        UserPo userPo = userDao.queryByUserId(userId);
        assertNotNull(userPo);
        log.info("result: \n{}", userPo);
    }
}
