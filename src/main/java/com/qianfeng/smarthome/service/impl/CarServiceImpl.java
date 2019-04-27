package com.qianfeng.smarthome.service.impl;

import com.qianfeng.smarthome.entity.Car;
import com.qianfeng.smarthome.mapper.CarMapper;
import com.qianfeng.smarthome.service.CarService;
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
public class CarServiceImpl extends ServiceImpl<CarMapper, Car> implements CarService {
	
}
