package com.qianfeng.smarthome.mapper;

import com.qianfeng.smarthome.entity.Good;
import com.qianfeng.smarthome.entity.Install;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.qianfeng.smarthome.entity.Orderstatus;
import org.apache.ibatis.annotations.Insert;

import org.apache.ibatis.annotations.Mapper;
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

@Mapper
public interface InstallMapper extends BaseMapper<Install> {

    // 安装产品名称
    @Select("SELECT g.gname  FROM t_good g\n" +
            "INNER join t_order o on o.gid = g.gid")
    public List<Good> findAll();

    // 物流状态
    @Select("SELECT * FROM t_orderstatus ")
    public List<Orderstatus> selectStatus();

    @Insert("INSERT INTO t_install(pid,status,address,desc,createTime) VALUES (?,?,?,?,?)")
    public void add(Install i);
}