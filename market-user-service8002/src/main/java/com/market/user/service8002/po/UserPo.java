package com.market.user.service8002.po;

import lombok.Data;

import java.util.Date;

/**
 * @author :  zhulongkun20@gmail.com
 * @create :  12-13-2020 13:48:56
 * @description :  系统用户实体类
 * @since :  v1.0
 */
@Data
public class UserPo {

    private String id;

    private String userId;

    private String password;

    private String role;

    private String remark;

    private Integer deleteFlag;

    private String createBy;

    private Date createTime;

    private String updateBy;

    private Date updateTime;

}
