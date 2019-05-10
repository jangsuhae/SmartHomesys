package com.qianfeng.smarthome.vo;

import com.qianfeng.smarthome.entity.Goodtype;
import lombok.Data;

import java.util.List;

/*一,二级目录和对应三级商品展示*/
@Data
public class VMenu3 {
	private Integer id;
	private String typename;
	private List<VMenu2> list;


}
