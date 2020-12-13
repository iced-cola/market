package com.market.user.service8002.po;

import lombok.Data;

import java.util.Date;

/**
 * @author :  zhulongkun20@gmail.com
 * @create :  12-13-2020 14:22:41
 * @description :  系统用户角色实体类
 * @since :  v1.0
 */
@Data
public class RolePo {

    private String id;

    private String roleCode;

    private String roleName;

    private String remark;

    private Integer deleteFlag;

    private String createBy;

    private Date createTime;

    private String updateBy;

    private Date updateTime;

}
