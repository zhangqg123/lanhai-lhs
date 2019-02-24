package com.jeecg.lhs.entity;

import java.io.Serializable;
import java.util.Date;
import java.math.BigDecimal;

/**
 * 描述：用户表
 * @author: www.jeecg.org
 * @since：2019年02月14日 07时41分17秒 星期四 
 * @version:1.0
 */
public class LhSUserEntity implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String deptid;
	
	public String getDeptid() {
		return deptid;
	}
	public void setDeptid(String deptid) {
		this.deptid = deptid;
	}
}
