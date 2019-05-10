package com.qianfeng.smarthome.controller;

import com.qianfeng.smarthome.common.JsonBean;
import com.qianfeng.smarthome.entity.Goodtype;
import com.qianfeng.smarthome.service.impl.GoodtypeServiceImpl;
import com.qianfeng.smarthome.utils.JsonUtils;
import com.qianfeng.smarthome.vo.VMenu;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Api(value = "产品种类服务", tags = "产品种类有关操作")
public class GoodTypeController {
	@Autowired
	private GoodtypeServiceImpl goodtypeService;

	@CrossOrigin//实现跨域
	@ApiOperation(value = "查询所有产品种类接口", notes = "查询所有产品种类接口")
	@GetMapping("goodType/list.do")
	public JsonBean findAllType(){
		List<VMenu> list = goodtypeService.findAllType();
		return  JsonUtils.createJsonBean(1,list);
	}

	@CrossOrigin//实现跨域
	@ApiOperation(value = "添加产品种类接口", notes = "添加产品种类接口")
	@GetMapping("goodType/add.do")
	public JsonBean addGoodType(Goodtype goodtype){
		goodtypeService.insert(goodtype);
		return  JsonUtils.createJsonBean(1,null);
	}
}
