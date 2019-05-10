package com.qianfeng.smarthome.controller;

import com.qianfeng.smarthome.common.JsonBean;
import com.qianfeng.smarthome.entity.Good;
import com.qianfeng.smarthome.entity.Love;
import com.qianfeng.smarthome.service.GoodService;
import com.qianfeng.smarthome.utils.JsonUtils;
import com.qianfeng.smarthome.vo.VMenu;
import com.qianfeng.smarthome.vo.VMenu2;
import com.qianfeng.smarthome.vo.VMenu3;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Api(value = "产品有关服务", tags = "产品有关操作")
public class GoodController {
	@Autowired
	private GoodService goodService;


	@CrossOrigin//实现跨域
	@ApiOperation(value = "添加产品接口", notes = "添加产品接口")
	@PostMapping("good/add.do")
	public JsonBean savaGood(Good good) {
		try {
			goodService.insert(good);
			return JsonUtils.createJsonBean(1, null);
		} catch (Exception e) {
			e.printStackTrace();
			return JsonUtils.createJsonBean(0, e.getMessage());
		}
	}

	@CrossOrigin//实现跨域
	@ApiOperation(value = "删除产品接口", notes = "删除产品接口")
	@DeleteMapping("good/del.do")
	public JsonBean delGood(Integer id) {
		goodService.deleteById(id);
		return JsonUtils.createJsonBean(1, null);
	}

	// 库存量大到小展示（前端传入typeid）
	@CrossOrigin//实现跨域
	@ApiOperation(value = "库存量大到小展示接口", notes = "库存量大到小展示接口")
	@GetMapping("/good/numshort.do")
	public JsonBean numShort(Integer typeid) {
		List<Good> list = goodService.numShort(typeid);

		return JsonUtils.createJsonBean(1, list);
	}

	//价格由低到高
	@CrossOrigin//实现跨域
	@ApiOperation(value = "价格由低到高展示接口", notes = "价格由低到高展示接口")
	@GetMapping("/good/priceshort.do")
	public JsonBean priceShort(Integer typeid) {
		List<Good> list = goodService.priceShort(typeid);

		return JsonUtils.createJsonBean(1, list);
	}

	// 搜索接口
	@CrossOrigin//实现跨域
	@ApiOperation(value = "根据产品名字搜索接口", notes = "根据产品名字搜索接口")
	@GetMapping("/good/findByName.do")
	public JsonBean findByName(String gname) {
		System.out.println(gname);

		List<Good> list = goodService.selectFindName(gname);

		return JsonUtils.createJsonBean(1, list);
	}

	// 搜索接口
	@CrossOrigin//实现跨域
	@ApiOperation(value = "查找所有一级目录及对应商品接口", notes = "查找所有一级目录及对应商品接口")
	@GetMapping("/good/findMenu.do")
	public JsonBean findMenu() {
		List<VMenu> list = goodService.findAllGoods();
		return JsonUtils.createJsonBean(1, list);
	}

	// 详情页
	@CrossOrigin//实现跨域
	@ApiOperation(value = "搜索产品详情页接口", notes = "搜索产品详情页接口")
	@GetMapping("/good/details.do")
	public JsonBean selectDetails(Integer gid) {
		Good details = goodService.selectDetails(gid);
		return JsonUtils.createJsonBean(1, details);
	}

	@CrossOrigin//实现跨域
	@ApiOperation(value = "添加收藏产品接口", notes = "添加收藏产品接口")
	@PostMapping("love.do")
	public JsonBean addLove(Integer gid) {

		goodService.addLove(gid);
		return JsonUtils.createJsonBean(1, null);
	}

	@CrossOrigin//实现跨域
	@ApiOperation(value = "删除收藏产品接口", notes = "删除收藏产品接口")
	@DeleteMapping("lovedel.do")
	public JsonBean delLove(Integer id) {

		goodService.loveDel(id);
		return JsonUtils.createJsonBean(1, null);
	}

	/*查找所有二级商品目录及对应商品*/
	@CrossOrigin//实现跨域
	@ApiOperation(value = "查找所有二级商品目录及对应商品接口", notes = "查找所有二级商品目录及对应商品接口")
	@GetMapping("/good/findMunu2.do")
	public JsonBean findMenu2() {

		List<VMenu2> list = goodService.findAllGoods2();
		return JsonUtils.createJsonBean(1, list);
	}

	/*查找所有一,二级商品目录及对应商品*/
	@CrossOrigin//实现跨域
	@ApiOperation(value = "查找所有一,二级商品目录及对应商品接口", notes = "查找所有二级商品目录及对应商品接口")
	@GetMapping("/good/findMunu3.do")
	public JsonBean findMenu3() {

		List<VMenu3> list = goodService.findAllGoods3();
		return JsonUtils.createJsonBean(1, list);
	}

}
