package com.qianfeng.smarthome.controller;

import com.qianfeng.smarthome.common.JsonBean;
import com.qianfeng.smarthome.entity.User;
import com.qianfeng.smarthome.service.UserService;
import com.qianfeng.smarthome.utils.JsonUtils;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	@Autowired
	private UserService userService;
	@RequestMapping("user/register.do")
	public JsonBean registerUser(User user){
		try {
			if (user.getUid()==null){
				user.setUid(0);
			}
			userService.register(user);
			return JsonUtils.createJsonBean(1,null);
		} catch (Exception e) {
			e.printStackTrace();
			return JsonUtils.createJsonBean(0,e.getMessage());
		}
	}
}
