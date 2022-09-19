package com.pjb.xiaoxiao.annotation;

import java.lang.annotation.*;

/**
 *
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.PARAMETER})
public @interface RsaVerify {

    /**
     * 是否启用验签功能 默认验签
     */
    boolean verifySign() default true;
}
