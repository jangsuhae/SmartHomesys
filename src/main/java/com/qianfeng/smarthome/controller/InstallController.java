package com.qianfeng.smarthome.controller;

import com.qianfeng.smarthome.common.CommonInfo;
import com.qianfeng.smarthome.common.JsonBean;
import com.qianfeng.smarthome.entity.Install;
import com.qianfeng.smarthome.entity.User;
import com.qianfeng.smarthome.service.InstallService;
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
@Api(value = "安装服务",tags = "安装有关操作")
public class InstallController {
    @Autowired
    private InstallService installService;

    @CrossOrigin//实现跨域
    @ApiOperation(value = "查询所有购买接口" ,notes = "查询所有购买接口")
    @GetMapping("good/cost.do")
    public JsonBean findAllGood() {
     return   installService.findAll();

    }

    @CrossOrigin//实现
    @ApiOperation(value = "安装物流状态接口" ,notes = "")
    @GetMapping("order/status.do")
    public JsonBean selectStatus() {
        return installService.selectStaus();
    }

    @CrossOrigin//实现跨域
    @ApiOperation(value = "添加安装服务,参数分别为pid,status,address,desc,createTime" ,notes = "")
    @PostMapping("install/add.do")
    public JsonBean addInstall(Install install, HttpSession session) {
        User user = (User) session.getAttribute(CommonInfo.LOGIN_USER);
        install.setUserId(user.getUid());
        installService.add(install);
//        installService.insert(install);
        return JsonUtils.createJsonBean(1,null);
    }
}
