package com.market.user.service8002.dao;

import com.market.user.service8002.po.RolePo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author :  zhulongkun20@gmail.com
 * @create :  12-13-2020 14:24:20
 * @description :  角色dao
 * @since :  v1.0
 */
@Mapper
public interface RoleDao {

    int insert(RolePo rolePo);

    RolePo queryByRoleCode(@Param("roleCode") String roleCode);

}
