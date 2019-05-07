package com.qianfeng.smarthome.mapper;

import com.qianfeng.smarthome.entity.User;
import com.baomidou.mybatisplus.mapper.BaseMapper;

/**
 * <p>
  *  Mapper 接口
 * </p>
 *
 * @author 张修会
 * @since 2019-04-27
 * @author 郑鹏飞
 * @since 2019年4月29日16:41:54 添加登录
 */
public interface UserMapper extends BaseMapper<User> {

    public User findByName(String name);
    public void register(User user);
}