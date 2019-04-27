package com.qianfeng.smarthome.service.impl;

import com.qianfeng.smarthome.entity.Order;
import com.qianfeng.smarthome.mapper.OrderMapper;
import com.qianfeng.smarthome.service.OrderService;
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
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements OrderService {
	
}
