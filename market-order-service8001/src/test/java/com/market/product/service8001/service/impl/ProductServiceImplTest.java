package com.market.product.service8001.service.impl;

import com.market.product.service8001.exception.ProductException;
import com.market.product.service8001.po.ProductInventoryPo;
import com.market.product.service8001.service.ProductService;
import com.market.product.service8001.util.Result;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class ProductServiceImplTest {

    @Resource
    private ProductService productService;

    @Test
    public void increaseStock() {
        ProductInventoryPo inventoryPo = new ProductInventoryPo();
        inventoryPo.setProductId("P2020121200001");
        // 将该商品库存数量增加5
        inventoryPo.setCount(5);
        try {
            Result<Object> result = productService.increaseStock(inventoryPo);
        } catch (ProductException e) {
            log.error(e.getMessage());
        }
    }

    @Test
    public void decreaseStock() {
    }
}