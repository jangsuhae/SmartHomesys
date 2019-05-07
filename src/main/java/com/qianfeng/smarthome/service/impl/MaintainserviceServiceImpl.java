package com.qianfeng.smarthome.service.impl;

import com.qianfeng.smarthome.common.JsonBean;
import com.qianfeng.smarthome.entity.Good;
import com.qianfeng.smarthome.entity.Maintainservice;
import com.qianfeng.smarthome.entity.Orderstatus;
import com.qianfeng.smarthome.entity.Trouble;
import com.qianfeng.smarthome.mapper.MaintainserviceMapper;
import com.qianfeng.smarthome.service.MaintainserviceService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.qianfeng.smarthome.utils.JsonUtils;
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
public class MaintainserviceServiceImpl extends ServiceImpl<MaintainserviceMapper, Maintainservice> implements MaintainserviceService {

    @Autowired(required = false)
    private MaintainserviceMapper maintainserviceMapper;

    @Override
    public JsonBean findAll() {
        List<Good> list = maintainserviceMapper.findAll();


        return JsonUtils.createJsonBean(1,list);
    }

    @Override
    public JsonBean selectTrouble() {

        List<Trouble> list = maintainserviceMapper.selectTrouble();
        return JsonUtils.createJsonBean(1,list);
    }
}
