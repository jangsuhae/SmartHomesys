package com.qianfeng.smarthome.service;

import com.qianfeng.smarthome.common.JsonBean;
import com.qianfeng.smarthome.entity.Good;
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
public interface GoodService extends IService<Good> {
    public List<Good> numShort(Integer typeid);

    public List<Good> priceShort(Integer typeid);

    public List<Good> selectFindName(String gname);

    public Good selectDetails(Integer gid);

    public List<VMenu> findAllGoods();
	
}
