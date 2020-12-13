package com.market.product.service8001.po;

import lombok.Data;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;

import java.util.Date;

/**
 * @author :  zhulongkun20@gmail.com
 * @create :  12-11-2020 22:37:04
 * @description :  商品信息实体类
 * @since :  v1.0
 */
@Data
public class ProductInfoPo {

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
     * 商品描述
     */
    @Length(max = 255, message = "商品名称不能超过255个字符")
    private String productDesc;

    /**
     * 商品分类
     */
    private String category;

    /**
     * 商品采购批次
     */
    private String order;

    /**
     * 商品价格
     */
    @Range(min = 0, message = "商品价格不能小于0")
    private double price;

    /**
     * 是否上架
     */
    private Integer onSale;

    /**
     * 删除标志
     */
    private Integer deleteFlag;

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
