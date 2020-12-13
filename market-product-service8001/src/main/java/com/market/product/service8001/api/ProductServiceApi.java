package com.market.product.service8001.api;

import com.market.product.service8001.service.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.annotation.security.RolesAllowed;

/**
 * @author :  zhulongkun20@gmail.com
 * @create :  12-12-2020 12:31:42
 * @description :  商品管理Api
 * @since :  v1.0
 */
@RestController
@RequestMapping(value = "/product/api/v1")
public class ProductServiceApi {

//    @Resource
//    private ProductService productService;

    @RolesAllowed(value = {"ROLE_ADMIN", "ROLE_USER"})
    @GetMapping(value = "/product/{productId}")
    public void queryProduct(@PathVariable String productId) {
    }

}
