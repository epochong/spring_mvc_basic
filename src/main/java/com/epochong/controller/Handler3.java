package com.epochong.controller;

import com.epochong.vo.UserInfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

/**
 * @author epochong
 * @date 2019/8/9 15:31
 * @email epochong@163.com
 * @blog epochong.github.io
 * @describe
 * 不继承任何类，不识闲任何借口
 * 适配器+映射器（注解）
 *
 * Controller：通过xml扫描识别，控制器
 * RequestMapping：映射器
 *
 *
 */


@Controller
public class Handler3 {

    @RequestMapping("/queryUserInfo")
    public ModelAndView queryUserInfo() {
        List<UserInfo> userInfos = new ArrayList <>();

        UserInfo userInfo1 = new UserInfo();
        userInfo1.setUserId(1);
        userInfo1.setUserName("epochong");

        UserInfo userInfo2 = new UserInfo();
        userInfo2.setUserName("sisi");
        userInfo2.setUserId(2);

        UserInfo userInfo = new UserInfo();
        userInfo.setUserId(3);
        userInfo.setUserName("haha");

        userInfos.add(userInfo);
        userInfos.add(userInfo1);
        userInfos.add(userInfo2);
        ModelAndView modelAndView = new ModelAndView();
        //转向
        modelAndView.addObject("userInfos",userInfos);
        //通过前缀和后缀拼接
        modelAndView.setViewName("showList");
        return modelAndView;
    }

}
