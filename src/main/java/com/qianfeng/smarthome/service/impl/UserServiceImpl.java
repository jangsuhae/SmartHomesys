package com.qianfeng.smarthome.service.impl;

import com.qianfeng.smarthome.entity.User;
import com.qianfeng.smarthome.mapper.UserMapper;
import com.qianfeng.smarthome.service.UserService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 张修会
 * @since 2019-04-27
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
	
}
