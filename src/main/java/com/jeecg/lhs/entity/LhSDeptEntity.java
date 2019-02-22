package com.jeecg.lhs.entity;

import java.io.Serializable;
import java.util.Date;
import java.math.BigDecimal;

/**
 * 描述：部门表
 * @author: www.jeecg.org
 * @since：2019年02月22日 15时39分51秒 星期五 
 * @version:1.0
 */
public class LhSDeptEntity implements Serializable{
	private static final long serialVersionUID = 1L;
		/**	 *编号	 */	private String id;	/**	 *名称	 */	private String deptName;	/**	 *简介	 */	private String summary;	/**	 *创建人	 */	private String createBy;	/**	 *部门类型	 */	private String deptType;	/**	 *上级	 */	private String parentCode;	public String getId() {	    return this.id;	}	public void setId(String id) {	    this.id=id;	}	public String getDeptName() {	    return this.deptName;	}	public void setDeptName(String deptName) {	    this.deptName=deptName;	}	public String getSummary() {	    return this.summary;	}	public void setSummary(String summary) {	    this.summary=summary;	}	public String getCreateBy() {	    return this.createBy;	}	public void setCreateBy(String createBy) {	    this.createBy=createBy;	}	public String getDeptType() {	    return this.deptType;	}	public void setDeptType(String deptType) {	    this.deptType=deptType;	}	public String getParentCode() {	    return this.parentCode;	}	public void setParentCode(String parentCode) {	    this.parentCode=parentCode;	}
}

