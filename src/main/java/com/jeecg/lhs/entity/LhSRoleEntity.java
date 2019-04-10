package com.jeecg.lhs.entity;

import java.io.Serializable;
import java.util.Date;
import java.math.BigDecimal;

/**
 * 描述：角色表
 * @author: www.jeecg.org
 * @since：2019年04月09日 14时33分52秒 星期二 
 * @version:1.0
 */
public class LhSRoleEntity implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String roleCode;
	public String getRoleCode() {
		return roleCode;
	}
	public void setRoleCode(String roleCode) {
		this.roleCode = roleCode;
	}
}
