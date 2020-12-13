package com.market.product.service8001.dao;

import com.market.product.service8001.po.ProductInfoPo;
import lombok.extern.slf4j.Slf4j;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import static org.junit.Assert.assertEquals;

@SpringBootTest
@RunWith(SpringRunner.class)
@Slf4j
public class ProductInfoDaoTest {

    @Resource
    private ProductInfoDao productInfoDao;

    @Before
    public void setUp() throws Exception {
        log.info("测试开始...");
    }

    @Test
    public void insert() {
        ProductInfoPo productInfoPo = new ProductInfoPo();
        productInfoPo.setProductId("2020121200001");
        productInfoPo.setProductName("商品描述1");
        productInfoPo.setProductDesc("商品描述1");
        productInfoPo.setOrder("2020年12月第2批次");
        productInfoPo.setPrice(10.00);
        int insert = productInfoDao.insert(productInfoPo);
        assertEquals(insert, 1);
    }

    @Test
    public void queryByProductId() {
        String productId = "2020121200001";
        ProductInfoPo productInfoPo = productInfoDao.queryByProductId(productId);
        log.info("result: \n{}", productInfoPo);
    }
}
