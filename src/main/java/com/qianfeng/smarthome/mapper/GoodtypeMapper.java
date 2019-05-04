package com.qianfeng.smarthome.mapper;

import com.qianfeng.smarthome.entity.Goodtype;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.qianfeng.smarthome.vo.VMenu;
import jdk.nashorn.internal.runtime.FindProperty;

/**
 * <p>
  *  Mapper 接口
 * </p>
 *
 * @author 张修会
 * @since 2019-04-27
 */
public interface GoodtypeMapper extends BaseMapper<Goodtype> {
	public VMenu findAllType();

}