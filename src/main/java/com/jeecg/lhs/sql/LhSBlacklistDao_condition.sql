		<#if ( lhSBlacklist.id )?? && lhSBlacklist.id ?length gt 0>
		    /* id */
			and lsb.ID = :lhSBlacklist.id
		</#if>
		<#if ( lhSBlacklist.phone )?? && lhSBlacklist.phone ?length gt 0>
		    /* 手机 */
			and lsb.PHONE = :lhSBlacklist.phone
		</#if>
		<#if ( lhSBlacklist.openId )?? && lhSBlacklist.openId ?length gt 0>
		    /* openId */
			and lsb.OPEN_ID = :lhSBlacklist.openId
		</#if>
		<#if ( lhSBlacklist.status )?? && lhSBlacklist.status ?length gt 0>
		    /* 状态 */
			and lsb.STATUS = :lhSBlacklist.status
		</#if>
		<#if ( lhSBlacklist.idcard )?? && lhSBlacklist.idcard ?length gt 0>
		    /* 身份证号 */
			and lsb.IDCARD = :lhSBlacklist.idcard
		</#if>
		<#if ( lhSBlacklist.createBy )?? && lhSBlacklist.createBy ?length gt 0>
		    /* 创建人 */
			and lsb.CREATE_BY = :lhSBlacklist.createBy
		</#if>
	    <#if ( lhSBlacklist.createDate )??>
		    /* 创建日期 */
			and lsb.CREATE_DATE = :lhSBlacklist.createDate
		</#if>
