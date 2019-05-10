package com.qianfeng.smarthome.vo;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.enums.IdType;
import com.qianfeng.smarthome.entity.Orderdetail;
import lombok.Data;

import java.util.Date;
import java.util.List;
@Data
public class VOrder {

    /**
     * 单元为分
     */
    @TableId(value="gid", type= IdType.AUTO)
   private Integer id;
   private String orderNum;
   private Integer price;
   private Integer status;
   private String statusName;
   private Date createTime;
   private  Integer userId;
   private List<VOrderDetail> list;


}
