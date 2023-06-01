package com.itheima.controller;

import com.itheima.exception.BusinessException;
import com.itheima.exception.SystemException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ProjectExceptionAdvice {

    @ExceptionHandler(SystemException.class)
    public Result doSystemException(SystemException e) {
        System.out.println("异常" + e);
        // 记录日志
        // 发消息给运维
        // 发邮件给开发人员
        return new Result(e.getCode(), e, e.getMessage());
    }

    @ExceptionHandler(BusinessException.class)
    public Result doBusinessException(BusinessException e) {
        System.out.println("异常" + e);
        // 记录日志
        // 发消息给运维
        // 发邮件给开发人员
        return new Result(e.getCode(), e, e.getMessage());
    }


    @ExceptionHandler(Exception.class)
    public Result doException(Exception e) {
        System.out.println("异常" + e);
        // 记录日志
        // 发消息给运维
        // 发邮件给开发人员
        return new Result(Code.SAVE_OK, e, "系统错误！");
    }
}
