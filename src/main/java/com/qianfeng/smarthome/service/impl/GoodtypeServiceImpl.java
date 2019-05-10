package com.qianfeng.smarthome.service.impl;

import com.qianfeng.smarthome.entity.Goodtype;
import com.qianfeng.smarthome.mapper.GoodtypeMapper;
import com.qianfeng.smarthome.service.GoodtypeService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.qianfeng.smarthome.vo.VMenu;
import org.springframework.beans.factory.annotation.Autowire;
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
public class GoodtypeServiceImpl extends ServiceImpl<GoodtypeMapper, Goodtype> implements GoodtypeService {
	@Autowired
	private GoodtypeMapper goodtypeMapper;
	@Override
	public List<VMenu> findAllType() {
		List<VMenu> list = goodtypeMapper.findAllType();
		return list;
	}
}
