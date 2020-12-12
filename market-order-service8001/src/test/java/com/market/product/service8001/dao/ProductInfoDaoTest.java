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
        productInfoPo.setProductId("111");
        productInfoPo.setProductName("name1");
        productInfoPo.setProductDesc("desc1");
        productInfoPo.setOrder("order1");
        productInfoPo.setPrice(10.00);
        productInfoPo.setOnSale(0);
        productInfoPo.setDeleteFlag(0);
        productInfoPo.setCreateBy("user1");
        productInfoPo.setUpdateBy("user1");
        int insert = productInfoDao.insert(productInfoPo);
        assertEquals(insert, 1);
    }

    @Test
    public void queryByProductId() {
        String id = "13605fd43bcb11eb962018597644f2f1";
        ProductInfoPo productInfoPo = productInfoDao.queryByProductId(id);
        log.info("result: \n{}", productInfoPo);
    }
}
