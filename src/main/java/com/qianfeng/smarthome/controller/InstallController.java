package com.qianfeng.smarthome.controller;

import com.qianfeng.smarthome.common.JsonBean;
import com.qianfeng.smarthome.entity.Install;
import com.qianfeng.smarthome.service.InstallService;
import com.qianfeng.smarthome.utils.JsonUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import netscape.javascript.JSUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(value = "安装服务",tags = "安装服务操作")
public class InstallController {
    @Autowired
    private InstallService installService;

    @CrossOrigin//实现跨域
    @ApiOperation(value = "安装产品接口" ,notes = "")
    @PostMapping("good/cost.do")
    public JsonBean findAllGood() {
     return   installService.findAll();

    }

    @CrossOrigin//实现跨域
    @ApiOperation(value = "安装物流状态接口" ,notes = "")
    @PostMapping("order/status.do")
    public JsonBean selectStatus() {
        return installService.selectStaus();
    }

    @CrossOrigin//实现跨域
    @ApiOperation(value = "添加安装服务,参数分别为pid,status,address,desc,createTime" ,notes = "")
    @PostMapping("install/add.do")
    public JsonBean addInstall(Install install) {
        installService.add(install);
//        installService.insert(install);
        return JsonUtils.createJsonBean(1,null);
    }
}
