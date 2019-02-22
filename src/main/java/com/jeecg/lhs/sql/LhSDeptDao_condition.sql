		<#if ( lhSDept.id )?? && lhSDept.id ?length gt 0>
		    /* 编号 */
			and lsd.ID = :lhSDept.id
		</#if>
		<#if ( lhSDept.deptName )?? && lhSDept.deptName ?length gt 0>
		    /* 名称 */
			and lsd.DEPT_NAME = :lhSDept.deptName
		</#if>
		<#if ( lhSDept.summary )?? && lhSDept.summary ?length gt 0>
		    /* 简介 */
			and lsd.SUMMARY = :lhSDept.summary
		</#if>
		<#if ( lhSDept.createBy )?? && lhSDept.createBy ?length gt 0>
		    /* 创建人 */
			and lsd.CREATE_BY = :lhSDept.createBy
		</#if>
		<#if ( lhSDept.deptType )?? && lhSDept.deptType ?length gt 0>
		    /* 部门类型 */
			and lsd.DEPT_TYPE = :lhSDept.deptType
		</#if>
		<#if ( lhSDept.parentCode )?? && lhSDept.parentCode ?length gt 0>
		    /* 上级 */
			and lsd.PARENT_CODE = :lhSDept.parentCode
		</#if>
