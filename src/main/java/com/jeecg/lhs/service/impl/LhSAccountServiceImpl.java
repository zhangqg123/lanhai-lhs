package com.jeecg.lhs.service.impl;

import javax.annotation.Resource;

import java.util.List;
import java.util.UUID;

import org.jeecgframework.minidao.pojo.MiniDaoPage;
import org.springframework.stereotype.Service;

import com.jeecg.lhs.dao.LhSAccountDao;
import com.jeecg.lhs.entity.LhSAccountEntity;
import com.jeecg.lhs.entity.User;
import com.jeecg.lhs.service.LhSAccountService;



/**
 * 描述：账号表
 * @author: www.jeecg.org
 * @since：2019年01月24日 15时03分32秒 星期四 
 * @version:1.0
 */

@Service("lhSAccountService")
public class LhSAccountServiceImpl implements LhSAccountService {
	@Resource
	private LhSAccountDao lhSAccountDao;

	@Override
	public LhSAccountEntity get(String id) {
		return lhSAccountDao.get(id);
	}

	@Override
	public int update(LhSAccountEntity lhSAccount) {
		return lhSAccountDao.update(lhSAccount);
	}

	@Override
	public void insert(LhSAccountEntity lhSAccount) {
		String randomSeed = UUID.randomUUID().toString().replaceAll("-", "").toUpperCase();
		lhSAccount.setId(randomSeed);
		lhSAccountDao.insert(lhSAccount);
		
	}

	@Override
	public MiniDaoPage<LhSAccountEntity> getAll(LhSAccountEntity lhSAccount, int page, int rows) {
		return lhSAccountDao.getAll(lhSAccount, page, rows);
	}

	@Override
	public void delete(String id) {
		lhSAccountDao.delete(id);
		
	}
	
	@Override
	public void batchDelete(String[] ids) {
		for(int i = 0; i < ids.length; i++) {
			String id = ids[i];
			lhSAccountDao.deleteById(id);
		}
	}

	@Override
	public LhSAccountEntity getByAppId(String appId) {
		return lhSAccountDao.getByAppId(appId);
	}

	@Override
	public List<User> getUserList() {
		return lhSAccountDao.getUserList();
	}

	@Override
	public List<User> getUsers(String role) {
		return lhSAccountDao.getUsers(role);
	}

	@Override
	public User getUserById(String userId) {
		// TODO Auto-generated method stub
		return lhSAccountDao.getUserById(userId) ;
	}
}
