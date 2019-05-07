package com.qianfeng.smarthome.service;

import com.qianfeng.smarthome.common.JsonBean;
import com.qianfeng.smarthome.entity.Maintainservice;
import com.baomidou.mybatisplus.service.IService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 张修会
 * @since 2019-04-27
 */
@Service
public interface MaintainserviceService extends IService<Maintainservice> {

    public JsonBean findAll();

    public JsonBean selectTrouble();

}
