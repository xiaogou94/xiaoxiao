/*
package com.pjb.xiaoxiao.controller;

import lombok.AllArgsConstructor;
import org.springframework.core.MethodParameter;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.ModelAndViewContainer;

*/
/**
 * @program: xiaoxiao
 * @description: 自定义方法参数解析器
 * @author: xiao gou
 * @create: 2021-11-13 10:26
 *//*

@AllArgsConstructor
@Component
public class RsaVerifyArgumentResolver implements HandlerMethodArgumentResolver {

    private final SecurityService securityService;

    @Override
    public boolean supportsParameter(MethodParameter parameter) {
        return parameter.hasParameterAnnotation(RsaVerify.class);
    }

    @Override
    public Object resolveArgument(MethodParameter parameter, ModelAndViewContainer mavContainer, NativeWebRequest webRequest, WebDataBinderFactory binderFactory) throws Exception {
        return null;
    }


    @Override
    public Object resolveArgument(MethodParameter parameter, ModelAndViewContainer mavContainer, NativeWebRequest webRequest, WebDataBinderFactory binderFactory) throws Exception {
        RsaVerify parameterAnnotation = parameter.getParameterAnnotation(RsaVerify.class);
        if (!parameterAnnotation.verifySign()) {
            return mavContainer.getModel();
        }

        //对参数进行处理并验签的逻辑
        ......

        //返回处理后的实体类参数
        return ObjectMapperFactory
                .getDateTimeObjectMapper("yyyyMMddHHmmss")
                .readValue(StringUtil.queryParamsToJson(sb.toString()), parameter.getParameterType());
    }

    @Override
    public boolean supportsParameter(MethodParameter parameter) {
        return false;
    }
}

*/
