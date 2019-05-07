package com.qianfeng.smarthome.mapper;

import com.qianfeng.smarthome.entity.Good;
import com.qianfeng.smarthome.entity.Maintainservice;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.qianfeng.smarthome.entity.Orderstatus;
import com.qianfeng.smarthome.entity.Trouble;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * <p>
  *  Mapper 接口
 * </p>
 *
 * @author 张修会
 * @since 2019-04-27
 */
public interface MaintainserviceMapper extends BaseMapper<Maintainservice> {

    // 安装产品名称
    @Select("SELECT g.gname  FROM t_good g\n" +
            "INNER join t_order o on o.gid = g.gid")
    public List<Good> findAll();

    // 故障类型
    @Select("SELECT * FROM t_trouble ")
    public List<Trouble> selectTrouble();

}