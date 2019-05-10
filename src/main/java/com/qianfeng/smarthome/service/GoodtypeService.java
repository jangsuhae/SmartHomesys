package com.qianfeng.smarthome.service;

import com.qianfeng.smarthome.entity.Goodtype;
import com.baomidou.mybatisplus.service.IService;
import com.qianfeng.smarthome.vo.VMenu;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 张修会
 * @since 2019-04-27
 */
public interface GoodtypeService extends IService<Goodtype> {
	public List<VMenu> findAllType();
}
