package com.qianfeng.smarthome.service;

import com.qianfeng.smarthome.entity.Goodcomment;
import com.baomidou.mybatisplus.service.IService;
import com.qianfeng.smarthome.vo.VComment;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 张修会
 * @since 2019-04-27
 */
@Service
public interface GoodcommentService extends IService<Goodcomment> {
	public List<VComment> findAll (Integer gid) ;
	public List<VComment> AllComment (Integer gid) ;
}
