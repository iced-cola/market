package com.market.user.service8002.dao;

import com.market.user.service8002.po.UserPo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author :  zhulongkun20@gmail.com
 * @create :  12-13-2020 14:02:54
 * @description :  用户数据访问dao
 * @since :  v1.0
 */
@Mapper
public interface UserDao {

    int insert(UserPo userPo);

    UserPo queryByUserId(@Param("userId") String userId);

}
