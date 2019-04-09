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
		/**	 *编号	 */	private String id;	/**	 *名称	 */	private String roleName;	/**	 *创建人	 */	private String createBy;	/**	 * 小程序id	 */	private String xcxId;	/**	 *类型	 */	private String userType;	public String getId() {	    return this.id;	}	public void setId(String id) {	    this.id=id;	}	public String getRoleName() {	    return this.roleName;	}	public void setRoleName(String roleName) {	    this.roleName=roleName;	}	public String getCreateBy() {	    return this.createBy;	}	public void setCreateBy(String createBy) {	    this.createBy=createBy;	}	public String getXcxId() {	    return this.xcxId;	}	public void setXcxId(String xcxId) {	    this.xcxId=xcxId;	}	public String getUserType() {	    return this.userType;	}	public void setUserType(String userType) {	    this.userType=userType;	}
}

