package com.qianfeng.smarthome.service;

import com.qianfeng.smarthome.common.JsonBean;
import com.qianfeng.smarthome.entity.Good;
import com.baomidou.mybatisplus.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 张修会
 * @since 2019-04-27
 */
public interface GoodService extends IService<Good> {
    public List<Good> findAll();

    public Good selectDetails(Integer gid);
	
}
