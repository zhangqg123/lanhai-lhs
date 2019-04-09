		<#if ( lhSRole.id )?? && lhSRole.id ?length gt 0>
		    /* 编号 */
			and lsr.ID = :lhSRole.id
		</#if>
		<#if ( lhSRole.roleName )?? && lhSRole.roleName ?length gt 0>
		    /* 名称 */
			and lsr.ROLE_NAME = :lhSRole.roleName
		</#if>
		<#if ( lhSRole.createBy )?? && lhSRole.createBy ?length gt 0>
		    /* 创建人 */
			and lsr.CREATE_BY = :lhSRole.createBy
		</#if>
		<#if ( lhSRole.xcxId )?? && lhSRole.xcxId ?length gt 0>
		    /*  小程序id */
			and lsr.XCX_ID = :lhSRole.xcxId
		</#if>
		<#if ( lhSRole.userType )?? && lhSRole.userType ?length gt 0>
		    /* 类型 */
			and lsr.USER_TYPE = :lhSRole.userType
		</#if>
