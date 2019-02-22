UPDATE lh_s_user
SET 
	   <#if lhSUser.id ?exists>
		   ID = :lhSUser.id,
		</#if>
	   <#if lhSUser.phone ?exists>
		   PHONE = :lhSUser.phone,
		</#if>
	   <#if lhSUser.username ?exists>
		   USERNAME = :lhSUser.username,
		</#if>
	   <#if lhSUser.password ?exists>
		   PASSWORD = :lhSUser.password,
		</#if>
	   <#if lhSUser.status ?exists>
		   STATUS = :lhSUser.status,
		</#if>
	   <#if lhSUser.userkey ?exists>
		   USERKEY = :lhSUser.userkey,
		</#if>
	   <#if lhSUser.idcard ?exists>
		   IDCARD = :lhSUser.idcard,
		</#if>
	   <#if lhSUser.realname ?exists>
		   REALNAME = :lhSUser.realname,
		</#if>
	   <#if lhSUser.sex ?exists>
		   SEX = :lhSUser.sex,
		</#if>
	   <#if lhSUser.address ?exists>
		   ADDRESS = :lhSUser.address,
		</#if>
	   <#if lhSUser.usertype ?exists>
		   USERTYPE = :lhSUser.usertype,
		</#if>
	   <#if lhSUser.openid ?exists>
		   OPENID = :lhSUser.openid,
		</#if>
	   <#if lhSUser.parent ?exists>
		   PARENT = :lhSUser.parent,
		</#if>
	   <#if lhSUser.xcxid ?exists>
		   XCXID = :lhSUser.xcxid,
		</#if>
WHERE id = :lhSUser.id