package com.wsl.mycat.error;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import javax.servlet.http.HttpServletRequest;

@Slf4j
@ControllerAdvice
public class ErrorHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(ApplicationErrorException.class)
    @ResponseBody
    ResponseMessage handleApplicationErrorException(HttpServletRequest request, Throwable ex) {
        ApplicationErrorException appError = (ApplicationErrorException) ex;
//        log.error(String.format("[Exception Application] --> [Code: %d] | [Message: %s]",
//                appError.getErrorCode(), appError.getMessage()));
        log.error(String.format("[Exception Application] --> [Code: %d] | [Message: %s]",
                appError.getErrorCode(), appError.getMessage()), ex);
        return new ResponseMessage.Fail((ApplicationErrorException) ex);
    }

    @ExceptionHandler(Throwable.class)
    @ResponseBody
    ResponseMessage handleThrowableException(HttpServletRequest request, Throwable ex) {
        log.error(String.format("[Exception] --> %s", ex.toString()));
        log.error(ex.getMessage(), ex);
        return new ResponseMessage.Fail(new ApplicationErrorException(ErrorCode.GeneralError));
    }

}