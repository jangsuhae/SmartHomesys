package com.qianfeng.smarthome.controller;


import com.qianfeng.smarthome.common.CommonInfo;
import com.qianfeng.smarthome.common.JsonBean;
import com.qianfeng.smarthome.entity.Goodcomment;
import com.qianfeng.smarthome.entity.User;
import com.qianfeng.smarthome.service.OrderService;
import com.qianfeng.smarthome.utils.JsonUtils;
import com.qianfeng.smarthome.vo.VOrder;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
@Api(value = "我的订单")
public class OrderController {

@Autowired
    private OrderService orderService;

@PostMapping("order/findAll.do")
public JsonBean list(HttpSession session) {

    User user = (User) session.getAttribute(CommonInfo.LOGIN_USER);
    List<VOrder> list = orderService.list(user.getUid());

    return JsonUtils.createJsonBean(1, list);

}
}
