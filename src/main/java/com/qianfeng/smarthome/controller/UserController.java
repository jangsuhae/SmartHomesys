package com.qianfeng.smarthome.controller;



import com.baomidou.mybatisplus.mapper.Wrapper;
import com.qianfeng.smarthome.common.JsonBean;
import com.qianfeng.smarthome.entity.User;
import com.qianfeng.smarthome.service.UserService;
import com.qianfeng.smarthome.utils.JsonUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Api(value = "注册服务",tags = "注册有关操作")
public class UserController {
	@Autowired
	private UserService userService;

	@CrossOrigin//实现跨域
	@PostMapping("user/register.do")
	@ApiOperation(value = "注册接口" ,notes = "注册用户")
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
	@CrossOrigin//实现跨域
	@GetMapping("user/findByName.do")
	@ApiOperation(value = "检查用户名是否已注册" ,notes = "检查用户名是否已注册")
	public JsonBean findByUserName(String uname){

		User user = userService.findByName(uname);
		return JsonUtils.createJsonBean(1,user);
	}
}
