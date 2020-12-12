package com.market.product.service8001.po;

import lombok.Data;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;

import java.util.Date;

/**
 * @author :  zhulongkun20@gmail.com
 * @create :  12-12-2020 12:36:43
 * @description :  商品库存实体类
 * @since :  v1.0
 */
@Data
public class ProductInventoryPo {

    /**
     * 主键id
     */
    private String id;

    /**
     * 商品id
     */
    private String productId;

    /**
     * 商品名称
     */
    @Length(max = 255, message = "商品名称不能超过255个字符")
    private String productName;

    /**
     * 商品库存数量
     */
    @Range(min = 0, message = "商品数量不能小于0")
    private Integer count;

    /**
     * 备注
     */
    @Length(max = 255, message = "商品备注不能超过255个字符")
    private String remark;

    /**
     * 是否有效
     */
    @Range(min = 0, max = 1, message = "有效性标识只能为0或1")
    private Integer validation;

    /**
     * 创建者
     */
    private String createBy;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新者
     */
    private String updateBy;

    /**
     * 更新时间
     */
    private Date updateTime;

}
