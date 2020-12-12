package com.market.product.service8001.service;

import com.market.product.service8001.exception.ProductException;
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
