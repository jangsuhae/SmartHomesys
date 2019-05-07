package com.qianfeng.smarthome.controller;


import com.qianfeng.smarthome.common.JsonBean;
import com.qianfeng.smarthome.entity.Maintainservice;
import com.qianfeng.smarthome.service.MaintainserviceService;
import com.qianfeng.smarthome.utils.JsonUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(value = "维修服务", tags = "维修服务操作")
public class MaintainController {

    @Autowired
    private MaintainserviceService maintainserviceService;


    @CrossOrigin//实现跨域
    @ApiOperation(value = "维修产品接口", notes = "")
    @PostMapping("good/main.do")
    public JsonBean findAllGood() {
        return maintainserviceService.findAll();
    }

    @CrossOrigin//实现跨域
    @ApiOperation(value = "故障类型接口" ,notes = "")
    @PostMapping("trouble/lis.do")
    public JsonBean selectTrouble() {
        return maintainserviceService.selectTrouble();

    }

    @CrossOrigin//实现跨域
    @ApiOperation(value = "维修服务，pid,troubleType,address,serviceTime,status(详细信息)，其他参数不用" ,notes = "")
    @PostMapping("main/add.do")
   public  JsonBean add(Maintainservice m) {
        maintainserviceService.insert(m);
        return JsonUtils.createJsonBean(1,null);
   }


}
