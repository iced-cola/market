package com.market.product.service8001.dao;

import com.market.product.service8001.po.ProductInfoPo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author :  zhulongkun20@gmail.com
 * @create :  12-11-2020 22:57:13
 * @description :  商品信息dao
 * @since :  v1.0
 */
@Mapper
public interface ProductInfoDao {

    int insert(ProductInfoPo productInfoPo);

    ProductInfoPo queryByProductId(@Param("productId") String productId);

}
