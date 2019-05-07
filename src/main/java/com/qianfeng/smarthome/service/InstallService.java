package com.qianfeng.smarthome.service;

import com.qianfeng.smarthome.common.JsonBean;
import com.qianfeng.smarthome.entity.Install;
import com.baomidou.mybatisplus.service.IService;
import org.springframework.beans.factory.annotation.Autowired;
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
public interface InstallService extends IService<Install> {

    public JsonBean findAll();

    public JsonBean selectStaus();

    public void add(Install i);

}
