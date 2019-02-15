package com.jeecg.user.service.impl;

import javax.annotation.Resource;
import java.util.UUID;
import org.jeecgframework.minidao.pojo.MiniDaoPage;
import org.springframework.stereotype.Service;

import com.jeecg.user.dao.LhSUserDao;
import com.jeecg.user.entity.LhSUserEntity;
import com.jeecg.user.service.LhSUserService;

/**
 * 描述：用户表
 * @author: www.jeecg.org
 * @since：2019年02月14日 07时41分17秒 星期四 
 * @version:1.0
 */

@Service("lhSUserService")
public class LhSUserServiceImpl implements LhSUserService {
	@Resource
	private LhSUserDao lhSUserDao;

	@Override
	public LhSUserEntity get(String id) {
		return lhSUserDao.get(id);
	}

	@Override
	public int update(LhSUserEntity lhSUser) {
		return lhSUserDao.update(lhSUser);
	}

	@Override
	public void insert(LhSUserEntity lhSUser) {
		String randomSeed = UUID.randomUUID().toString().replaceAll("-", "").toUpperCase();
		lhSUser.setId(randomSeed);
		lhSUserDao.insert(lhSUser);
		
	}

	@Override
	public MiniDaoPage<LhSUserEntity> getAll(LhSUserEntity lhSUser, int page, int rows) {
		return lhSUserDao.getAll(lhSUser, page, rows);
	}

	@Override
	public void delete(String id) {
		lhSUserDao.delete(id);
		
	}
	
	@Override
	public void batchDelete(String[] ids) {
		for(int i = 0; i < ids.length; i++) {
			String id = ids[i];
			lhSUserDao.deleteById(id);
		}
	}
}
