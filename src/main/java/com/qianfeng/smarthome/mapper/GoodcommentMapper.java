package com.qianfeng.smarthome.mapper;

import com.qianfeng.smarthome.entity.Goodcomment;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.qianfeng.smarthome.vo.VComment;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * <p>
  *  Mapper 接口
 * </p>
 *
 * @author 张修会
 * @since 2019-04-27
 */
@Mapper
public interface GoodcommentMapper extends BaseMapper<Goodcomment> {

    public List<VComment> findAll(Integer gid) ;

    public List<VComment> AllComment(Integer gid);

}