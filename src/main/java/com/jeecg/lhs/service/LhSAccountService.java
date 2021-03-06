package com.jeecg.lhs.service;

import java.util.List;

import org.jeecgframework.minidao.annotation.Param;
import org.jeecgframework.minidao.pojo.MiniDaoPage;

import com.jeecg.lhs.entity.LhSAccountEntity;
import com.jeecg.lhs.entity.User;



/**
 * 描述：账号表
 * @author: www.jeecg.org
 * @since：2019年01月24日 15时03分32秒 星期四 
 * @version:1.0
 */
public interface LhSAccountService {
	public LhSAccountEntity get(String id);

	public int update(LhSAccountEntity lhSAccount);

	public void insert(LhSAccountEntity lhSAccount);

	public MiniDaoPage<LhSAccountEntity> getAll(LhSAccountEntity lhSAccount,int page,int rows);

	public void delete(String id);
	
	public void batchDelete(String[] ids);

	public LhSAccountEntity getByAppId(String appId);

	public List<User> getUserList();

	public List<User> getUsers(String role);

	public User getUserById(String userId);
	
}
