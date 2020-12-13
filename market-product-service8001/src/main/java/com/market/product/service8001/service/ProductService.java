package com.market.product.service8001.service;

import com.market.product.service8001.exception.ProductException;
import com.market.product.service8001.po.ProductInfoPo;
import com.market.product.service8001.po.ProductInventoryPo;
import com.market.product.service8001.util.Result;
import org.springframework.stereotype.Service;

/**
 * @author :  zhulongkun20@gmail.com
 * @create :  12-11-2020 23:56:30
 * @description :  商品管理业务类
 * @since :  v1.0
 */
@Service
public interface ProductService {

    /**
     * 增加新商品
     *
     * @param productInfoPo 商品
     * @return 处理结果
     */
    Result<Object> addProduct(ProductInfoPo productInfoPo);

    /**
     * 删除商品
     *
     * @param productInfoPo 商品信息
     * @return 处理结果
     */
    Result<Object> delProduct(ProductInfoPo productInfoPo);

    /**
     * 上架|下架商品
     *
     * @param productInfoPo 商品信息（按商品id|商品名称|商品分类|商品采购批次）
     * @return 处理结果
     */
    Result<Object> updateOnSaleStatus(ProductInfoPo productInfoPo);

    /**
     * 增加商品库存
     *
     * @param inventoryPo 库存实体
     * @return 更新结果
     */
    Result<Object> increaseStock(ProductInventoryPo inventoryPo) throws ProductException;

    /**
     * 扣除商品库存
     *
     * @param inventoryPo 库存实体
     * @return 更新结果
     */
    Result<Object> decreaseStock(ProductInventoryPo inventoryPo) throws ProductException;

}
