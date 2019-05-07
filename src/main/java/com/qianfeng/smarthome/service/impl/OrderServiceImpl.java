package com.qianfeng.smarthome.service.impl;

import com.qianfeng.smarthome.entity.Order;
import com.qianfeng.smarthome.mapper.OrderMapper;
import com.qianfeng.smarthome.service.OrderService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.qianfeng.smarthome.vo.VOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

    @Autowired
    private OrderMapper orderMapper;
    @Override
    public List<VOrder> list(int id) {

        List<VOrder> list = orderMapper.selectAll(id);
        return list;
    }
}
