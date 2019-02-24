package com.jeecg.lhs.entity;

import java.io.Serializable;
import java.util.Date;
import java.math.BigDecimal;

/**
 * 描述：账号表
 * @author: www.jeecg.org
 * @since：2019年01月24日 15时03分32秒 星期四 
 * @version:1.0
 */
public class LhSAccountEntity implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String roleCode;
	
	private String lat;
	private String lng;
	private String aesKey;
	private String ivKey;
	private String smsAppid;
	private String smsAppkey;
	private String smsTemplateid;
	
	public String getLat() {
		return lat;
	}
	public void setLat(String lat) {
		this.lat = lat;
	}
	public String getLng() {
		return lng;
	}
	public void setLng(String lng) {
		this.lng = lng;
	}
	public String getRoleCode() {
		return roleCode;
	}
	public void setRoleCode(String roleCode) {
		this.roleCode = roleCode;
	}
	public String getAesKey() {
		return aesKey;
	}
	public void setAesKey(String aesKey) {
		this.aesKey = aesKey;
	}
	public String getIvKey() {
		return ivKey;
	}
	public void setIvKey(String ivKey) {
		this.ivKey = ivKey;
	}
	public String getSmsAppid() {
		return smsAppid;
	}
	public void setSmsAppid(String smsAppid) {
		this.smsAppid = smsAppid;
	}
	public String getSmsAppkey() {
		return smsAppkey;
	}
	public void setSmsAppkey(String smsAppkey) {
		this.smsAppkey = smsAppkey;
	}
	public String getSmsTemplateid() {
		return smsTemplateid;
	}
	public void setSmsTemplateid(String smsTemplateid) {
		this.smsTemplateid = smsTemplateid;
	}
}
