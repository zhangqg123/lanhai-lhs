UPDATE lh_s_role
SET 
	   <#if lhSRole.id ?exists>
		   ID = :lhSRole.id,
		</#if>
	   <#if lhSRole.roleCode ?exists>
		   ROLE_CODE = :lhSRole.roleCode,
		</#if>
	   <#if lhSRole.roleName ?exists>
		   ROLE_NAME = :lhSRole.roleName,
		</#if>
	   <#if lhSRole.createBy ?exists>
		   CREATE_BY = :lhSRole.createBy,
		</#if>
	   <#if lhSRole.xcxId ?exists>
		   XCX_ID = :lhSRole.xcxId,
		</#if>
	   <#if lhSRole.userType ?exists>
		   USER_TYPE = :lhSRole.userType,
		</#if>
WHERE id = :lhSRole.id