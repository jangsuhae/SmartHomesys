package com.qianfeng.smarthome.controller;

import com.qianfeng.smarthome.common.JsonBean;
import com.qianfeng.smarthome.entity.Good;
import com.qianfeng.smarthome.entity.Love;
import com.qianfeng.smarthome.service.GoodService;
import com.qianfeng.smarthome.utils.JsonUtils;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
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
	// 库存量大到小展示（前端传入typeid）
	@PostMapping("/good/numshort.do")
	public JsonBean numShort(Integer typeid){
	List<Good> list = goodService.numShort(typeid);

	return JsonUtils.createJsonBean(1,list);
}
    //价格由低到高
	@PostMapping("/good/priceshort.do")
	public JsonBean priceShort(Integer typeid){
	List<Good> list = goodService.priceShort(typeid);

	return JsonUtils.createJsonBean(1,list);
}
// 搜索接口
	@PostMapping( "/good/findAll.do")
	public JsonBean findAll( String gname){

	List<Good> list = goodService.selectFindName(gname);

	return JsonUtils.createJsonBean(1,list);
}
// 详情页
@PostMapping("/good/details.do")
	public JsonBean selectDetails(Integer gid) {
	Good details = goodService.selectDetails(gid);
	return JsonUtils.createJsonBean(1,details);
}
	@GetMapping("love.do")
	public JsonBean addLove(Integer gid) {

   goodService.addLove(gid);
		return JsonUtils.createJsonBean(1,null);
	}

	@GetMapping("lovedel.do")
	public JsonBean delLove(Integer id){

		goodService.loveDel(id);
		return JsonUtils.createJsonBean(1,null);
	}

}
