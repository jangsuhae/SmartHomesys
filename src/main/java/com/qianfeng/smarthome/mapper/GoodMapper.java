package com.qianfeng.smarthome.mapper;

import com.qianfeng.smarthome.entity.Good;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.qianfeng.smarthome.vo.VMenu;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

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

public interface GoodMapper extends BaseMapper<Good> {
   @Select("select * from t_good")
    public List<Good> list();

   public Good selectDetails(Integer gid) ;

   public List<VMenu> findAllGoods();

}