package com.qianfeng.smarthome.vo;

import com.qianfeng.smarthome.entity.Goodtype;

import java.util.List;
/*一级目录和对应三级商品展示*/
public class VMenu {
	private Integer id;
	private String typename;
	private List<Goodtype> list;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTypename() {
		return typename;
	}

	public void setTypename(String typename) {
		this.typename = typename;
	}

	public List<Goodtype> getList() {
		return list;
	}

	public void setList(List<Goodtype> list) {
		this.list = list;
	}
}
