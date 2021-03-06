package com.market.user.service8002.util;

/**
 * @author :  zhulongkun20@gmail.com
 * @create :  12-12-2020 14:57:11
 * @description :  返回结果处理
 * @since :  v1.0
 */
public class ResultUtil {

    public static Result<Object> success(Integer code, String message) {
        Result<Object> result = new Result<>();
        result.setCode(code);
        result.setMessage(message);
        result.setData(null);
        return result;
    }

    public static Result<Object> success(Integer code, String message, Object data) {
        Result<Object> result = new Result<>();
        result.setCode(code);
        result.setMessage(message);
        result.setData(data);
        return result;
    }

    public static Result<Object> success(Object data) {
        Result<Object> result = new Result<>();
        result.setCode(ResultEnum.SUCCESS.getCode());
        result.setMessage(ResultEnum.SUCCESS.getMessage());
        result.setData(data);
        return result;
    }

    public static Result<Object> failed(ResultEnum resultEnum) {
        Result<Object> result = new Result<>();
        result.setCode(resultEnum.getCode());
        result.setMessage(resultEnum.getMessage());
        result.setData(null);
        return result;
    }

    public static Result<Object> failed(String message) {
        Result<Object> result = new Result<>();
        result.setCode(ResultEnum.FAILED.getCode());
        result.setMessage(message);
        result.setData(null);
        return result;
    }
}
