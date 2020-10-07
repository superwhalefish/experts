package com.shzp.config;


import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


/**
 * 全局异常处理类
 */
@ControllerAdvice
public class GlobalExceptionHandler{
	    
	 /**
     * 拦截Exception类的异常
     *
     * @param e
     * @return
     */
    @ExceptionHandler(value=Exception.class)
    public Object exceptionHandler(Exception e) {
        e.printStackTrace();
        return "error";
    }

 
   
}