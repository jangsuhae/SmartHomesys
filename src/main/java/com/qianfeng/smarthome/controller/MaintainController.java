package com.qianfeng.smarthome.controller;


import com.qianfeng.smarthome.common.CommonInfo;
import com.qianfeng.smarthome.common.JsonBean;
import com.qianfeng.smarthome.entity.Maintainservice;
import com.qianfeng.smarthome.entity.User;
import com.qianfeng.smarthome.service.MaintainserviceService;
import com.qianfeng.smarthome.utils.JsonUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
@Api(value = "维修服务", tags = "维修有关操作")
public class MaintainController {

    @Autowired
    private MaintainserviceService maintainserviceService;


    @CrossOrigin//实现跨域
    @ApiOperation(value = "查询所有购买接口", notes = "查询所有购买接口")
    @GetMapping("good/main.do")
    public JsonBean findAllGood() {
        return maintainserviceService.findAll();
    }

    @CrossOrigin//实现跨域
    @ApiOperation(value = "故障类型接口" ,notes = "故障类型接口")
    @PostMapping("trouble/lis.do")
    public JsonBean selectTrouble() {
        return maintainserviceService.selectTrouble();

    }

    @CrossOrigin//实现跨域
    @ApiOperation(value = "添加维修服务，pid,troubleType,address,serviceTime,status(详细信息)，其他参数不用" ,notes = "添加维修服务")
    @PostMapping("main/add.do")
   public  JsonBean add(Maintainservice m, HttpSession session) {
        User user = (User) session.getAttribute(CommonInfo.LOGIN_USER);
        m.setUserId(user.getUid());
        maintainserviceService.insert(m);
        return JsonUtils.createJsonBean(1,null);
   }


}
