package com.qianfeng.smarthome.service.impl;

import com.qianfeng.smarthome.entity.Goodcomment;
import com.qianfeng.smarthome.mapper.GoodcommentMapper;
import com.qianfeng.smarthome.service.GoodcommentService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.qianfeng.smarthome.vo.VComment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 张修会
 * @since 2019-04-27
 */
@Service
public class GoodcommentServiceImpl extends ServiceImpl<GoodcommentMapper, Goodcomment> implements GoodcommentService {

    @Autowired
    private GoodcommentMapper goodcommentMapper;
    @Override
    public List<VComment> findAll(Integer gid) {
        List<VComment> list = goodcommentMapper.findAll(gid);
        return list;
    }

    @Override
    public List<VComment> AllComment(Integer gid) {
        List<VComment> list = goodcommentMapper.AllComment(gid);
        return list;
    }
}
