package com.qianfeng.smarthome.service;

import com.qianfeng.smarthome.entity.Order;
import com.baomidou.mybatisplus.service.IService;
import com.qianfeng.smarthome.vo.VOrder;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 张修会
 * @since 2019-04-27
 */

public interface OrderService extends IService<Order> {


    public List<VOrder> list(int id);
}
