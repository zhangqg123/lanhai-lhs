UPDATE lh_s_blacklist
SET 
	   <#if lhSBlacklist.id ?exists>
		   ID = :lhSBlacklist.id,
		</#if>
	   <#if lhSBlacklist.phone ?exists>
		   PHONE = :lhSBlacklist.phone,
		</#if>
	   <#if lhSBlacklist.openId ?exists>
		   OPEN_ID = :lhSBlacklist.openId,
		</#if>
	   <#if lhSBlacklist.status ?exists>
		   STATUS = :lhSBlacklist.status,
		</#if>
	   <#if lhSBlacklist.idcard ?exists>
		   IDCARD = :lhSBlacklist.idcard,
		</#if>
	   <#if lhSBlacklist.createBy ?exists>
		   CREATE_BY = :lhSBlacklist.createBy,
		</#if>
	    <#if lhSBlacklist.createDate ?exists>
		   CREATE_DATE = :lhSBlacklist.createDate,
		</#if>
	   <#if lhSBlacklist.xcxId ?exists>
		   XCX_ID = :lhSBlacklist.xcxId,
		</#if>
WHERE id = :lhSBlacklist.id