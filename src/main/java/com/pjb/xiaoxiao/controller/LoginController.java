package com.pjb.xiaoxiao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

/**
 * @program: xiaoxiao
 * @description: 控制层
 * @author: xiao gou
 * @create: 2021-10-17 14:45
 */
@Controller
public class LoginController {

    /**
     * 登录页面
     * @return
     */
    @RequestMapping("/toLoginPage")
    public String toLoginPage(){
        // 跳转至登录页面
        return "login.html";
    }

    @RequestMapping("/toIndexPage")
    public String toIndexPage(){
        // 跳转至登录页面
        return "index.html";
    }

    /**
     * 登录
     * @param model
     * @param request
     * @param userName
     * @param password
     * @return
     */
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(Model model, HttpServletRequest request, String userName, String password){

        // 验证登录信息
        if (userName.equals("pan_junbiao的博客") && password.equals("123")) {
            //验证成功 记录session信息
            request.getSession().setAttribute("userName",userName);
            // 重定向到首页
            return "redirect:toIndexPage";
        }
        else {
            model.addAttribute("errorMsg","账号或密码错误！");
        }

        // 跳转到登录页面
        return toLoginPage();
    }


    /**
     * 登出
     * @param request
     * @return
     */
    @RequestMapping(value = "/logout")
    public String logout(HttpServletRequest request){
        // 销毁session对象
        request.getSession().invalidate();

        // 重定向到登录页面
        return "redirect:toLoginPage";
    }
}
