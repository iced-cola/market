package com.market.product.service8001.dao;

import com.market.product.service8001.po.ProductInventoryPo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author :  zhulongkun20@gmail.com
 * @create :  12-12-2020 12:36:16
 * @description :  商品库存dao
 * @since :  v1.0
 */
@Mapper
public interface ProductInventoryDao {

    int insert(ProductInventoryPo inventoryPo);

    /**
     * 按商品id取商品信息
     *
     * @param productId 商品id
     * @return 商品信息
     */
    ProductInventoryPo queryByProductId(@Param("productId") String productId);

    /**
     * 增加商品库存
     *
     * @param productId 商品id
     * @param count     增加数量
     * @return 更新结果
     */
    int updateStock(@Param("productId") String productId,
                    @Param("count") Integer count);

}
