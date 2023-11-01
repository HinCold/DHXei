package com.example.DXHei.adevice;

import com.example.DXHei.common.BusinessException;
import com.example.DXHei.common.ErrorCode;
import com.example.DXHei.common.RespondModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.NoHandlerFoundException;

import java.util.HashMap;
import java.util.Map;

/**
 * @author XPR
 * @since 2023/11/1 15:12
 */
@ControllerAdvice
public class ExceptionAdvice implements ErrorCode {
    private final Logger logger = LoggerFactory.getLogger(Exception.class);

    @ExceptionHandler
    @ResponseBody
    public RespondModel handleException(Exception e) {
        Map<Object, Object> data = new HashMap<>();
        if (e instanceof BusinessException) {
            data.put("code", ((BusinessException) e).getCode());
            data.put("message", ((BusinessException) e).getMessage());
        } else if (e instanceof NoHandlerFoundException){
            data.put("code", UNDEFIDE_ERROR);
            data.put("data", "该资源不存在");

        } else {
            data.put("code", UNDEFIDE_ERROR);
            data.put("message", "位置错误!");
            logger.error("发生未知错误", e);
        }
        return new RespondModel(RespondModel.STATUS_FAILURE, data);
    }
}
