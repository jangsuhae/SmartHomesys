package com.qianfeng.smarthome.utils;


import com.qianfeng.smarthome.common.JsonBean;

public class JsonUtils {

	public static JsonBean createJsonBean(int code, Object info){
		JsonBean bean = new JsonBean();
		bean.setCode(code);
		bean.setInfo(info);
		
		return bean;
	}
}
