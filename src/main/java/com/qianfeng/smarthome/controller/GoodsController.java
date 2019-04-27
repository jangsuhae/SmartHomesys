package com.qianfeng.smarthome.controller;

import com.qianfeng.smarthome.common.JsonBean;
import com.qianfeng.smarthome.entity.Good;
import com.qianfeng.smarthome.service.GoodService;
import com.qianfeng.smarthome.utils.JsonUtils;
import org.apache.ibatis.javassist.bytecode.stackmap.BasicBlock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GoodsController {
	@Autowired
	private GoodService goodService;

	@RequestMapping("good/add.do")
	public JsonBean savaGood(Good good){
		try {
			goodService.insert(good);
			return JsonUtils.createJsonBean(1,null);
		} catch (Exception e) {
			e.printStackTrace();
			return JsonUtils.createJsonBean(0,e.getMessage());
		}
	}
}
