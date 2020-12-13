package com.market.product.service8001.exception;

import com.market.product.service8001.util.ResultEnum;

/**
 * @author :  zhulongkun20@gmail.com
 * @create :  12-12-2020 14:30:35
 * @description :  异常实体类
 * @since :  v1.0
 */
public class ProductException extends Exception {

    private Integer code;

    private String message;

    public ProductException(Integer code, String message) {
        super(message);
        this.code = code;
    }

    public ProductException(ResultEnum resultEnum) {
        this.code = resultEnum.getCode();
        this.message = resultEnum.getMessage();
    }
}
