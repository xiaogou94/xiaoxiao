package com.pjb.xiaoxiao.config;

import com.pjb.xiaoxiao.interceptor.LoginInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @program: xiaoxiao
 * @description: 拦截器
 * @author: xiao gou
 * @create: 2021-10-17 14:44
 */
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

    /**
     * 拦截器配置
     * @param registry
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
      // 注册Interceptor拦截器
       InterceptorRegistration registration = registry.addInterceptor(new LoginInterceptor());
       registration.addPathPatterns("/**"); //所有路径都被拦截
       registration.excludePathPatterns( //添加不拦截路径
                "/toLoginPage", //登录页面
                "/login",       //登录请求
                "/**/*.html",   //html静态资源
                "/**/*.js",     //js静态资源
                "/**/*.css"     //css静态资源
        );
    }

    /**
     * 控制器配置
     * @param registry
     */
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/toIndexPage").setViewName("/index");
        registry.addViewController("/").setViewName("/login");
    }
}
