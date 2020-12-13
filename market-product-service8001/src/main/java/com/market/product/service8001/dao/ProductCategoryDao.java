package com.market.product.service8001.dao;

import com.market.product.service8001.po.ProductCategoryPo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author :  zhulongkun20@gmail.com
 * @create :  12-12-2020 11:59:17
 * @description :  商品分类管理dao
 * @since :  v1.0
 */
@Mapper
public interface ProductCategoryDao {

    int insert(ProductCategoryPo productCategoryPo);

    ProductCategoryPo queryByCategoryId(@Param("categoryId") String categoryId);

}
