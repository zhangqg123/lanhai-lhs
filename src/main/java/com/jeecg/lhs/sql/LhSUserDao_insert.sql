INSERT  INTO
	lh_s_user
      ( 
      ID                            
      ,PHONE                          
      ,USERNAME                       
      ,PASSWORD                       
      ,STATUS                         
      ,USERKEY                        
      ,IDCARD                         
      ,REALNAME                       
      ,SEX                            
      ,ADDRESS                        
      ,USERTYPE                       
      ,OPENID                         
      ,PARENT                         
      ,XCXID         
      ,DEPTID
      ) 
values
      (
      :lhSUser.id                            
      ,:lhSUser.phone                         
      ,:lhSUser.username                      
      ,:lhSUser.password                      
      ,:lhSUser.status                        
      ,:lhSUser.userkey                       
      ,:lhSUser.idcard                        
      ,:lhSUser.realname                      
      ,:lhSUser.sex                           
      ,:lhSUser.address                       
      ,:lhSUser.usertype                      
      ,:lhSUser.openid                        
      ,:lhSUser.parent                        
      ,:lhSUser.xcxid                         
      ,:lhSUser.deptid                        
      )