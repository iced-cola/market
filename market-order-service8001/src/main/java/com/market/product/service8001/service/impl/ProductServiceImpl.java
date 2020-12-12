package com.market.product.service8001.service.impl;

import com.market.product.service8001.dao.ProductInventoryDao;
import com.market.product.service8001.exception.ProductException;
import com.market.product.service8001.po.ProductInventoryPo;
import com.market.product.service8001.service.ProductService;
import com.market.product.service8001.util.Result;
import com.market.product.service8001.util.ResultEnum;
import lombok.extern.slf4j.Slf4j;

import javax.annotation.Resource;

/**
 * @author :  zhulongkun20@gmail.com
 * @create :  12-12-2020 14:37:11
 * @description :  商品管理业务实现类
 * @since :  v1.0
 */
@Slf4j
public class ProductServiceImpl implements ProductService {

    @Resource
    private ProductInventoryDao inventoryDao;

    public Result<Integer> increaseStock(ProductInventoryPo inventoryPo) throws ProductException {
        // 商品数量不能小于等于0
        if (inventoryPo == null || inventoryPo.getProductId() == null
                || inventoryPo.getCount() <= 0) {
            log.error("【增加库存】请求参数错误，请求参数：{}", inventoryPo);
            throw new ProductException(ResultEnum.PARAM_ERROR);
        }
        int result = inventoryDao.updateStock(inventoryPo.getProductId(), inventoryPo.getCount());
        return ResultUtil.success(ResultEnum.SUCCESS, result);
    }

    public Result<Integer> decreaseStock(ProductInventoryPo inventoryPo) {
        return null;
    }
}
