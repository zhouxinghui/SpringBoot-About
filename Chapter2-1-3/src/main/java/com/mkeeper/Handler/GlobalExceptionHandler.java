package com.mkeeper.Handler;

import com.mkeeper.common.R;
import com.mkeeper.exception.BusinessException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;


@ControllerAdvice
public class GlobalExceptionHandler {

    @ResponseBody
    @ExceptionHandler(value = BusinessException.class)
    public R businessExceptionHandler(BusinessException exception) {
        return R.isFail(exception);
    }

    @ResponseBody
    @ExceptionHandler(value = Exception.class)
    public R exceptionHandler(Exception exception) {
        return R.isFail(exception);
    }
}