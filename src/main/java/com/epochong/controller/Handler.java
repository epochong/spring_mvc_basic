package com.epochong.controller;


import com.epochong.vo.UserInfo;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

/**
 * @author epochong
 * @date 2019/8/9 17:35
 * @email epochong@163.com
 * @blog epochong.github.io
 * @describe
 */
public class Handler implements Controller {
    @Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        List<UserInfo> userInfos = new ArrayList <>();
        UserInfo userInfo = new UserInfo();
        userInfo.setUserId(1);
        userInfo.setUserName("wangchong");

        UserInfo userInfo1 = new UserInfo();
        userInfo1.setUserId(1);
        userInfo1.setUserName("epochong");

        UserInfo userInfo2 = new UserInfo();
        userInfo2.setUserId(2);
        userInfo2.setUserName("github");

        userInfos.add(userInfo);
        userInfos.add(userInfo1);
        userInfos.add(userInfo2);

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("userInfos",userInfos);
        modelAndView.setViewName("showList");

        return modelAndView;
    }
}
