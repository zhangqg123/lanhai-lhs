INSERT  INTO
	lh_s_dept
      ( 
      ID                            
      ,DEPT_NAME                      
      ,SUMMARY                        
      ,CREATE_BY                      
      ,DEPT_TYPE                      
      ,PARENT_CODE                    
      ) 
values
      (
      :lhSDept.id                            
      ,:lhSDept.deptName                      
      ,:lhSDept.summary                       
      ,:lhSDept.createBy                      
      ,:lhSDept.deptType                      
      ,:lhSDept.parentCode                    
      )