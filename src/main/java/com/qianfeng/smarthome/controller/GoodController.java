package com.qianfeng.smarthome.controller;

import com.qianfeng.smarthome.common.JsonBean;
import com.qianfeng.smarthome.entity.Good;
import com.qianfeng.smarthome.service.GoodService;
import com.qianfeng.smarthome.utils.JsonUtils;
import com.qianfeng.smarthome.vo.VMenu;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Api(value = "产品展示先关操作",tags = "产品展示")
public class GoodController {
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
	@GetMapping("good/del.do")
	public JsonBean delGood(Integer id) {
		goodService.deleteById(id);
		return JsonUtils.createJsonBean(1,null);
	}
	@PostMapping("/good/list.do")
	public JsonBean findAll(){
	List<Good> list = goodService.selectList(null);

	return JsonUtils.createJsonBean(1,list);
}
@PostMapping("/good/details.do")
	public JsonBean selectDetails(Integer gid) {
	Good details = goodService.selectDetails(gid);
	return JsonUtils.createJsonBean(1,details);
}
@ApiOperation(value = "查询所有品类下的所有产品",notes = "查询所有品类下的所有产品")
@PostMapping("/typegood/list.do")
	public JsonBean findAllGoods(){
	List<VMenu> list = goodService.findAllGoods();
	return  JsonUtils.createJsonBean(1,list);
}

}
