package com.qianfeng.smarthome.service.impl;

import com.qianfeng.smarthome.common.JsonBean;
import com.qianfeng.smarthome.entity.Good;
import com.qianfeng.smarthome.entity.Install;
import com.qianfeng.smarthome.entity.Orderstatus;
import com.qianfeng.smarthome.mapper.InstallMapper;
import com.qianfeng.smarthome.service.InstallService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.qianfeng.smarthome.utils.JsonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 张修会
 * @since 2019-04-27
 */
@Service
public class InstallServiceImpl extends ServiceImpl<InstallMapper, Install> implements InstallService {

    @Autowired(required = false)
    private InstallMapper installMapper;
    @Override
    public JsonBean findAll() {
        List<Good> list = installMapper.findAll();


        return JsonUtils.createJsonBean(1,list);
    }

    @Override
    public JsonBean selectStaus() {

        List<Orderstatus> list = installMapper.selectStatus();
        return JsonUtils.createJsonBean(1,list);
    }

    @Override
    public void add(Install i) {
        installMapper.add(i);
    }
}
