package com.qianfeng.smarthome.vo;

import com.qianfeng.smarthome.entity.Good;
import lombok.Data;

import java.util.List;

/*二级目录和对应三级商品*/
@Data
public class VMenu2 {
	private Integer typeid;
	private String name;
	private Integer pid;
	private Integer grade;
	private List<Good> list;

}
