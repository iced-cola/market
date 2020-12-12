package com.market.product.service8001.dao;

import com.market.product.service8001.po.ProductCategoryPo;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class ProductCategoryDaoTest {

    @Resource
    private ProductCategoryDao categoryDao;

    @Test
    public void insert() {
        ProductCategoryPo categoryPo = new ProductCategoryPo();
        categoryPo.setCategoryId("2020121200001");
        categoryPo.setCategoryName("测试分类");
        categoryPo.setCategoryType("小分类");
        categoryPo.setParentCategory("");
        categoryPo.setCategoryDesc("测试一下分类");
        int result = categoryDao.insert(categoryPo);
        Assert.assertEquals(result, 1);
    }

    @Test
    public void queryByCategoryId() {
        String id = "2020121200001";
        ProductCategoryPo categoryPo = categoryDao.queryByCategoryId(id);
        assertNotNull(categoryPo);
        log.info("result: \n{}", categoryPo);
    }
}
