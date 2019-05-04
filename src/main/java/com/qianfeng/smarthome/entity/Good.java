package com.qianfeng.smarthome.entity;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
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
@TableName("t_good")
public class Good extends Model<Good> {

    private static final long serialVersionUID = 1L;

	@TableId(value="gid", type= IdType.AUTO)
	private Integer gid;
	private String gname;
    /**
     * 单元为分
     */
	private Integer gprice;
	private String gmodel;
	private String gimg;
	private Integer gnum;
	private String gdetail;
	private String gtitle;
	private Integer typeid;
	private String gimg2;

	public Integer getGid() {
		return gid;
	}

	public void setGid(Integer gid) {
		this.gid = gid;
	}

	public String getGname() {
		return gname;
	}

	public void setGname(String gname) {
		this.gname = gname;
	}

	public Integer getGprice() {
		return gprice;
	}

	public void setGprice(Integer gprice) {
		this.gprice = gprice;
	}

	public String getGmodel() {
		return gmodel;
	}

	public void setGmodel(String gmodel) {
		this.gmodel = gmodel;
	}

	public String getGimg() {
		return gimg;
	}

	public void setGimg(String gimg) {
		this.gimg = gimg;
	}

	public Integer getGnum() {
		return gnum;
	}

	public void setGnum(Integer gnum) {
		this.gnum = gnum;
	}

	public String getGdetail() {
		return gdetail;
	}

	public void setGdetail(String gdetail) {
		this.gdetail = gdetail;
	}

	public String getGtitle() {
		return gtitle;
	}

	public void setGtitle(String gtitle) {
		this.gtitle = gtitle;
	}

	public Integer getTypeid() {
		return typeid;
	}

	public void setTypeid(Integer typeid) {
		this.typeid = typeid;
	}

	public String getGimg2() {
		return gimg2;
	}

	public void setGimg2(String gimg2) {
		this.gimg2 = gimg2;
	}

	@Override
	protected Serializable pkVal() {
		return this.gid;
	}

}
