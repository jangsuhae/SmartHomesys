package com.qianfeng.smarthome.entity;

import java.util.Date;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author 张修会
 * @since 2019-04-27
 */
@TableName("t_maintainservice")
public class Maintainservice extends Model<Maintainservice> {

    private static final long serialVersionUID = 1L;

	private Integer id;
	private String serviceName;
	private Integer troubleType;
	private Date serviceTime;
	private String address;
	private Integer pid;
	private String pmodel;
	private Integer status;

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	private Integer userId;


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public Integer getTroubleType() {
		return troubleType;
	}

	public void setTroubleType(Integer troubleType) {
		this.troubleType = troubleType;
	}

	public Date getServiceTime() {
		return serviceTime;
	}

	public void setServiceTime(Date serviceTime) {
		this.serviceTime = serviceTime;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public String getPmodel() {
		return pmodel;
	}

	public void setPmodel(String pmodel) {
		this.pmodel = pmodel;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

}
