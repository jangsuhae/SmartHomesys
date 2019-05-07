package com.qianfeng.smarthome.mapper;

import com.qianfeng.smarthome.entity.Order;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.qianfeng.smarthome.vo.VOrder;
import org.apache.catalina.LifecycleState;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * <p>
  *  Mapper 接口
 * </p>
 *
 * @author 张修会
 * @since 2019-04-27
 */

@Mapper
public interface OrderMapper extends BaseMapper<Order> {

    public List<VOrder> selectAll(Integer id);

}