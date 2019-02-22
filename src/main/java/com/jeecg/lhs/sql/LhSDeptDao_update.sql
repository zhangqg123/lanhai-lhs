UPDATE lh_s_dept
SET 
	   <#if lhSDept.id ?exists>
		   ID = :lhSDept.id,
		</#if>
	   <#if lhSDept.deptName ?exists>
		   DEPT_NAME = :lhSDept.deptName,
		</#if>
	   <#if lhSDept.summary ?exists>
		   SUMMARY = :lhSDept.summary,
		</#if>
	   <#if lhSDept.createBy ?exists>
		   CREATE_BY = :lhSDept.createBy,
		</#if>
	   <#if lhSDept.deptType ?exists>
		   DEPT_TYPE = :lhSDept.deptType,
		</#if>
	   <#if lhSDept.parentCode ?exists>
		   PARENT_CODE = :lhSDept.parentCode,
		</#if>
WHERE id = :lhSDept.id