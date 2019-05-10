package com.qianfeng.smarthome.service.impl;

import com.qianfeng.smarthome.common.JsonBean;
import com.qianfeng.smarthome.entity.Good;
import com.qianfeng.smarthome.entity.Love;
import com.qianfeng.smarthome.mapper.GoodMapper;
import com.qianfeng.smarthome.service.GoodService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.qianfeng.smarthome.utils.JsonUtils;
import com.qianfeng.smarthome.vo.VMenu;
import com.qianfeng.smarthome.vo.VMenu2;
import com.qianfeng.smarthome.vo.VMenu3;
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
public class GoodServiceImpl extends ServiceImpl<GoodMapper, Good> implements GoodService {
    @Autowired(required = false)
    private  GoodMapper goodMapper;
    @Override
    public List<Good> numShort(Integer typeid) {
        List<Good> list = goodMapper.list(typeid);
        return list;

    }
    @Override
    public List<Good> priceShort(Integer typeid) {
        List<Good> list = goodMapper.priceList(typeid);

        return list;

    }

    @Override
    public List<Good> selectFindName(String gname) {
        /*System.out.println(gname);*/
        List<Good> list = goodMapper.listFind(gname);
        return list;
    }

    @Override
    public Good selectDetails(Integer gid) {
        Good details = goodMapper.selectDetails(gid);
        return details;
    }

    @Override
    public List<VMenu> findAllGoods() {
        List<VMenu> list = goodMapper.findAllGoods();
        return list;
    }

    @Override
    public void addLove(Integer loveGid) {

 goodMapper.addLove(loveGid);
    }

    @Override
    public void loveDel(Integer id) {
        goodMapper.delLove(id);
    }

    /*查找所有二级商品目录及对应商品*/
    @Override
    public List<VMenu2> findAllGoods2() {
        List<VMenu2> list = goodMapper.findAllGoods2();
        return list;
    }
    /*查找所有一,二级商品目录及对应商品*/
    @Override
    public List<VMenu3> findAllGoods3() {
        List<VMenu3> list = goodMapper.findAllGoods3();
        return list;
    }

}
