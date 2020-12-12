package com.market.product.service8001.dao;

import com.market.product.service8001.po.ProductInventoryPo;
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
public class ProductInventoryDaoTest {

    @Resource
    private ProductInventoryDao inventoryDao;

    @Test
    public void insert() {
        ProductInventoryPo inventoryPo = new ProductInventoryPo();
        inventoryPo.setProductId("P2020121200001");
        inventoryPo.setProductName("商品名称1");
        inventoryPo.setCount(1000);
        inventoryPo.setRemark("畅销产品1");
        int result = inventoryDao.insert(inventoryPo);
        assertEquals(result, 1);
    }

    @Test
    public void queryByProductId() {
        ProductInventoryPo inventoryPo = inventoryDao.queryByProductId("P2020121200001");
        assertNotNull(inventoryPo);
        log.info("result: \n{}", inventoryPo);
    }
}
