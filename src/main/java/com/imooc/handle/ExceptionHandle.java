package com.imooc.handle;

import com.imooc.domain.Result;
import com.imooc.exception.GirlException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 统一异常处理，对于springboot只有RuntimeExcption产生的时候才会回滚操作
 */
//里面可以定义异常发生时候调用的方法
@ControllerAdvice
public class ExceptionHandle {

    //因为需要返回数据，如果不加@ResponseBody则表示返回的是模板
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Result handle(Exception e){
        Result result = new Result();
        result.setCode(200);
        result.setMsg("未知错误");
        return result;
    }

    @ExceptionHandler(value = GirlException.class)
    @ResponseBody
    public Result girlHandle(){
        Result result = new Result();
        result.setCode(202);
        result.setMsg("girl 错误");
        return result;
    }
}
