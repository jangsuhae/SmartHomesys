package com.qianfeng.smarthome.controller;

import com.qianfeng.smarthome.common.JsonBean;
import com.qianfeng.smarthome.entity.Goodcomment;
import com.qianfeng.smarthome.entity.User;
import com.qianfeng.smarthome.service.GoodcommentService;
import com.qianfeng.smarthome.utils.JsonUtils;
import com.qianfeng.smarthome.vo.VComment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GoodCommentController {
    @Autowired
    private GoodcommentService goodcommentService;

    @PostMapping("/comment/add.do")
        public JsonBean addComment(User user,Goodcomment goodcomment) {

        goodcomment.setUid( user.getUid());
        goodcommentService.insert(goodcomment);
        return JsonUtils.createJsonBean(1,null);

    }
    @RequestMapping("/comment/select.do")
    public JsonBean listComment(Integer gid) {

        List<VComment> list = goodcommentService.findAll(gid);
        return JsonUtils.createJsonBean(1,list);
    }

    @RequestMapping("/comment/AllComment.do")
    public JsonBean allComment(Integer gid) {

        List<VComment> list = goodcommentService.AllComment(gid);
        return JsonUtils.createJsonBean(1,list);
    }

}
