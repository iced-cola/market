package com.market.user.service8002.service;

import com.market.user.service8002.po.UserPo;
import com.market.user.service8002.util.Result;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    /**
     * 列出所有用户
     *
     * @return 所有有效用户的集合
     */
    List<UserPo> queryUsers();

    /**
     * 用户登录实体
     *
     * @param userPo 用户信息
     * @return 鉴权结果
     */
    Result<Object> doLogin(UserPo userPo);

}
