package com.qianfeng.smarthome.controller;

import com.qianfeng.smarthome.common.CommonInfo;
import com.qianfeng.smarthome.common.JsonBean;
import com.qianfeng.smarthome.entity.User;
import com.qianfeng.smarthome.service.UserService;
import com.qianfeng.smarthome.utils.JsonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

/**
 * @author 郑鹏飞
 * @date 2019年4月29日17:07:04 登录
 */
@Controller
@ResponseBody
public class LoginController {
    @Autowired
    private UserService userService;

    @RequestMapping("login.do")
    public JsonBean login(String uname, String password, HttpSession session) {
        User user = userService.login(uname, password);

        session.setAttribute(CommonInfo.LOGIN_USER, user);

        return JsonUtils.createJsonBean(1, null);
    }
}
