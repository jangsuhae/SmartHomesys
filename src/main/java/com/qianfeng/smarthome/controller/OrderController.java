package com.qianfeng.smarthome.controller;


import com.qianfeng.smarthome.common.CommonInfo;
import com.qianfeng.smarthome.common.JsonBean;
import com.qianfeng.smarthome.entity.Order;
import com.qianfeng.smarthome.entity.Orderdetail;
import com.qianfeng.smarthome.entity.User;
import com.qianfeng.smarthome.service.OrderService;
import com.qianfeng.smarthome.service.OrderdetailService;
import com.qianfeng.smarthome.utils.JsonUtils;
import com.qianfeng.smarthome.vo.VOrder;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@RestController
@Api(value = "订单有关服务", tags = "订单有关操作")
public class OrderController {

	@Autowired
	private OrderService orderService;
	@Autowired
	private OrderdetailService orderdetailService;

	@ApiOperation(value = "查询所有订单", notes = "查询所有订单")
	@PostMapping("order/findAll.do")
	@CrossOrigin
	public JsonBean list(HttpSession session) {

		User user = (User) session.getAttribute(CommonInfo.LOGIN_USER);
		List<VOrder> list = orderService.list(user.getUid());

		return JsonUtils.createJsonBean(1, list);
	}
	@ApiOperation(value = "根据订单类型查询订单", notes = "根据订单类型查询订单")
	@GetMapping("order/selectByStatus.do")
	@CrossOrigin
//	@GetMapping  // 查询
//	@PostMapping  // 添加
//	@PutMapping  // 更新
//	@DeleteMapping // 删除
	public JsonBean list(Integer status,HttpSession session){
		User user = (User) session.getAttribute(CommonInfo.LOGIN_USER);
		List<VOrder> list = orderService.findByStatus(status,user.getUid());
		return JsonUtils.createJsonBean(1, list);
	}

	@ApiOperation(value = "生成订单", notes = "生成订单")
	@PostMapping("order/create.do")
	@CrossOrigin
	public JsonBean list(Order order, Orderdetail orderdetail, HttpSession session){
		User user = (User) session.getAttribute(CommonInfo.LOGIN_USER);
		order.setUserId(user.getUid());
		order.setCreateTime(new Date());
		long time = order.getCreateTime().getTime();
		String s = String.valueOf(time);
		String uuid = UUID.randomUUID().toString().replaceAll("-", "");
		String s1 = s + uuid;
		order.setOrderNum(s1);

		if(null == order.getId() ){
			order.setId(0);
		}
		orderService.insert(order);
		if(orderdetail.getId()==null){
			orderdetail.setId(0);
		}
		return JsonUtils.createJsonBean(1, null);
	}

}
