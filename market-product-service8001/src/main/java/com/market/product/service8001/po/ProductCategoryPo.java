package com.market.product.service8001.po;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

import java.util.Date;

/**
 * @author :  zhulongkun20@gmail.com
 * @create :  12-12-2020 12:00:44
 * @description :  商品分类实体类
 * @since :  v1.0
 */
@Data
public class ProductCategoryPo {

    /**
     * 主键id
     */
    private String id;

    /**
     * 分类id
     */
    private String categoryId;

    /**
     * 分类名称
     */
    private String categoryName;

    /**
     * 大中小区分
     */
    private String categoryType;

    /**
     * 分类描述
     */
    @Length(max = 64, message = "分类名称不能超过64个字符")
    private String categoryDesc;

    /**
     * 父级分类
     */
    private String parentCategory;

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
