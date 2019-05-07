package com.qianfeng.smarthome.controller;

import com.qianfeng.smarthome.common.CommonInfo;
import com.qianfeng.smarthome.common.JsonBean;
import com.qianfeng.smarthome.entity.Good;
import com.qianfeng.smarthome.entity.Goodcomment;
import com.qianfeng.smarthome.entity.User;
import com.qianfeng.smarthome.service.GoodcommentService;
import com.qianfeng.smarthome.utils.JsonUtils;
import com.qianfeng.smarthome.vo.VComment;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.List;

@Api(value = "评论操作",tags = "增加展示")
@RestController
public class GoodCommentController {
    @Autowired
    private GoodcommentService goodcommentService;

    // 添加评论
    @ApiOperation(value = "添加评论",notes = "实现评论的添加")

    @PostMapping("/comment/add.do")
        public JsonBean addComment(HttpSession session, Integer gid, Goodcomment goodcomment) {

        User user = (User) session.getAttribute(CommonInfo.LOGIN_USER);
        goodcomment.setUid(user.getUid());
        goodcomment.setGid(gid);
        goodcommentService.insert(goodcomment);
        return JsonUtils.createJsonBean(1, null);

    }
    //展示评论
    @RequestMapping("/comment/select.do")
    public JsonBean listComment(Integer gid) {

        List<VComment> list = goodcommentService.findAll(gid);
        return JsonUtils.createJsonBean(1,list);
    }

    //总体评分
    @RequestMapping("/comment/AllComment.do")
    public JsonBean allComment(Integer gid) {

        List<VComment> list = goodcommentService.AllComment(gid);
        return JsonUtils.createJsonBean(1,list);
    }

}

