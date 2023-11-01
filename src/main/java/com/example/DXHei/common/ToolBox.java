package com.example.DXHei.common;

import org.springframework.util.DigestUtils;
import org.springframework.util.StringUtils;

import java.text.SimpleDateFormat;
import java.util.Date;

import static com.example.DXHei.common.ErrorCode.PARAMETER_ERROR;

/**
 * @author XPR
 * @since 2023/11/1 14:46
 */
public class ToolBox {
    private static final String salt = "123456";

    public static String md5(String str) {
        if (StringUtils.isEmpty(str)) {
            throw new BusinessException(PARAMETER_ERROR, "参数不合法");
        }
        return DigestUtils.md5DigestAsHex((str + salt).getBytes());
    }

    public static String format(Date date, String pattern) {
        return new SimpleDateFormat(pattern).format(date);
    }
}
