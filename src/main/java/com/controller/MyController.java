package com.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/**
 * @ClassName MyController
 * @Author YQQ
 * @Date 2019/7/3 15:35
 * @Version
 **/
public class MyController implements Controller {
    @Override
    public ModelAndView handleRequest(javax.servlet.http.HttpServletRequest httpServletRequest, javax.servlet.http.HttpServletResponse httpServletResponse) throws Exception {
        ModelAndView mv = new ModelAndView();

        //传入数据
        mv.addObject("message","Hello World!");
        //选择下一页面
        mv.setViewName("hello");
        //返回模型页面
        return mv;
    }
}
