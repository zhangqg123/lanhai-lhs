package com.jeecg.lhs.entity;

import java.io.Serializable;
import java.util.Date;
import java.math.BigDecimal;

/**
 * 描述：黑名单表
 * @author: www.jeecg.org
 * @since：2019年04月23日 09时42分42秒 星期二 
 * @version:1.0
 */
public class LhSBlacklistEntity implements Serializable{
	private static final long serialVersionUID = 1L;
		/**	 *id	 */	private String id;	/**	 *手机	 */	private String phone;	/**	 *openId	 */	private String openId;	/**	 *状态	 */	private Integer status;	/**	 *身份证号	 */	private String idcard;	/**	 *创建人	 */	private String createBy;	/**	 *创建日期	 */	private Date createDate;	public String getId() {	    return this.id;	}	public void setId(String id) {	    this.id=id;	}	public String getPhone() {	    return this.phone;	}	public void setPhone(String phone) {	    this.phone=phone;	}	public String getOpenId() {	    return this.openId;	}	public void setOpenId(String openId) {	    this.openId=openId;	}	public Integer getStatus() {	    return this.status;	}	public void setStatus(Integer status) {	    this.status=status;	}	public String getIdcard() {	    return this.idcard;	}	public void setIdcard(String idcard) {	    this.idcard=idcard;	}	public String getCreateBy() {	    return this.createBy;	}	public void setCreateBy(String createBy) {	    this.createBy=createBy;	}	public Date getCreateDate() {	    return this.createDate;	}	public void setCreateDate(Date createDate) {	    this.createDate=createDate;	}
}

