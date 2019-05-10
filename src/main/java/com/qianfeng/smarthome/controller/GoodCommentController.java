package com.qianfeng.smarthome.controller;

import com.qianfeng.smarthome.common.CommonInfo;
import com.qianfeng.smarthome.common.JsonBean;
import com.qianfeng.smarthome.entity.Goodcomment;
import com.qianfeng.smarthome.entity.User;
import com.qianfeng.smarthome.service.GoodcommentService;
import com.qianfeng.smarthome.utils.JsonUtils;
import com.qianfeng.smarthome.vo.VComment;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;

@Api(value = "评论有关操作",tags = "评论有关操作")
@RestController
public class GoodCommentController {
    @Autowired
    private GoodcommentService goodcommentService;

    // 添加评论
    @CrossOrigin//实现跨域
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
    @CrossOrigin//实现跨域
    @ApiOperation(value = "展示评论接口", notes = "展示评论接口")
    @GetMapping("/comment/select.do")
    public JsonBean listComment(Integer gid) {

        List<VComment> list = goodcommentService.findAll(gid);
        return JsonUtils.createJsonBean(1,list);
    }

    //总体评分
    @CrossOrigin//实现跨域
    @ApiOperation(value = "总体评分接口", notes = "总体评分接口")
    @GetMapping("/comment/AllComment.do")
    public JsonBean allComment(Integer gid) {

        List<VComment> list = goodcommentService.AllComment(gid);
        return JsonUtils.createJsonBean(1,list);
    }

}

