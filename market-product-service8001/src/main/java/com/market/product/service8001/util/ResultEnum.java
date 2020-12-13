package com.market.product.service8001.util;

/**
 * @author :  zhulongkun20@gmail.com
 * @create :  12-12-2020 14:20:31
 * @description :  请求结果
 * @since :  v1.0
 */
public enum ResultEnum {

    /**
     * 请求成功
     */
    SUCCESS(0, "请求成功"),

    /**
     * 请求失败
     */
    FAILED(-1, "请求失败"),

    /**
     * 请求参数错误
     */
    PARAM_ERROR(10, "请求参数错误"),

    /**
     * 无法完成请求
     */
    OPERATE_FAILED(70, "无法完成请求");

    private Integer code;

    private String message;

    ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
