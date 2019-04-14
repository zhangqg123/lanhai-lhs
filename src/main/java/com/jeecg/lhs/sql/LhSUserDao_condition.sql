		<#if ( lhSUser.id )?? && lhSUser.id ?length gt 0>
		    /* id */
			and lsu.ID = :lhSUser.id
		</#if>
		<#if ( lhSUser.phone )?? && lhSUser.phone ?length gt 0>
		    /* 手机 */
			and lsu.PHONE = :lhSUser.phone
		</#if>
		<#if ( lhSUser.username )?? && lhSUser.username ?length gt 0>
		    /* 用户账号 */
			and lsu.USERNAME = :lhSUser.username
		</#if>
		<#if ( lhSUser.password )?? && lhSUser.password ?length gt 0>
		    /* 密码 */
			and lsu.PASSWORD = :lhSUser.password
		</#if>
		<#if ( lhSUser.status )?? && lhSUser.status ?length gt 0>
		    /* 有效状态 */
			and lsu.STATUS = :lhSUser.status
		</#if>
		<#if ( lhSUser.userkey )?? && lhSUser.userkey ?length gt 0>
		    /* 用户KEY */
			and lsu.USERKEY = :lhSUser.userkey
		</#if>
		<#if ( lhSUser.idcard )?? && lhSUser.idcard ?length gt 0>
		    /* 身份证号 */
			and lsu.IDCARD = :lhSUser.idcard
		</#if>
		<#if ( lhSUser.realname )?? && lhSUser.realname ?length gt 0>
		    /* 真实名字 */
			and lsu.REALNAME = :lhSUser.realname
		</#if>
		<#if ( lhSUser.sex )?? && lhSUser.sex ?length gt 0>
		    /* 性别 */
			and lsu.SEX = :lhSUser.sex
		</#if>
		<#if ( lhSUser.address )?? && lhSUser.address ?length gt 0>
		    /* 地址 */
			and lsu.ADDRESS = :lhSUser.address
		</#if>
		<#if ( lhSUser.usertype )?? && lhSUser.usertype ?length gt 0>
		    /* 用户类型 */
			and lsu.USERTYPE = :lhSUser.usertype
		</#if>
		<#if ( lhSUser.openid )?? && lhSUser.openid ?length gt 0>
		    /* openid */
			and lsu.OPENID = :lhSUser.openid
		</#if>
		<#if ( lhSUser.parent )?? && lhSUser.parent ?length gt 0>
		    /* parent */
			/* and lsu.PARENT like :lhSUser.parent */ 
			and lsu.PARENT like CONCAT('%', :lhSUser.parent ,'%') 
		</#if>
		<#if ( lhSUser.xcxid )?? && lhSUser.xcxid ?length gt 0>
		    /* xcxid */
			and lsu.XCXID = :lhSUser.xcxid
		</#if>
		<#if ( lhSUser.deptid )?? && lhSUser.deptid ?length gt 0>
		    /* xcxid */
			and lsu.DEPTID = :lhSUser.deptid
		</#if>
		<#if ( lhSUser.roleId )?? && lhSUser.roleId ?length gt 0>
		    /* xcxid */
			and lsu.role_id = :lhSUser.roleId
		</#if>
		<#if ( lhSUser.roleCode )?? && lhSUser.roleCode ?length gt 0>
		    /* xcxid */
			and lsu.role_code = :lhSUser.roleCode
		</#if>
