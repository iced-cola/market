package com.market.product.service8001.util;

import lombok.Data;

/**
 * @author :  zhulongkun20@gmail.com
 * @create :  12-12-2020 14:19:08
 * @description :  通用返回实体
 * @since :  v1.0
 */
@Data
public class Result<T> {

    private Integer code;

    private String message;

    private T data;

}
