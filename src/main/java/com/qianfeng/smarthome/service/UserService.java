package com.qianfeng.smarthome.service;

import com.qianfeng.smarthome.entity.User;
import com.baomidou.mybatisplus.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 张修会
 * @since 2019-04-27
 * @author 郑鹏飞
 * @since 2019年4月29日16:50:55 增加登录
 */
public interface UserService extends IService<User> {
	public User login(String name, String password);
}
