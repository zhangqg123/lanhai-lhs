package com.jeecg.lhs.service.impl;

import javax.annotation.Resource;

import java.util.UUID;

import org.jeecgframework.minidao.pojo.MiniDaoPage;
import org.springframework.stereotype.Service;

import com.jeecg.lhs.dao.LhSBlacklistDao;
import com.jeecg.lhs.entity.LhSBlacklistEntity;
import com.jeecg.lhs.service.LhSBlacklistService;

/**
 * 描述：黑名单表
 * @author: www.jeecg.org
 * @since：2019年04月23日 09时42分42秒 星期二 
 * @version:1.0
 */

@Service("lhSBlacklistService")
public class LhSBlacklistServiceImpl implements LhSBlacklistService {
	@Resource
	private LhSBlacklistDao lhSBlacklistDao;

	@Override
	public LhSBlacklistEntity get(String id) {
		return lhSBlacklistDao.get(id);
	}

	@Override
	public int update(LhSBlacklistEntity lhSBlacklist) {
		return lhSBlacklistDao.update(lhSBlacklist);
	}

	@Override
	public void insert(LhSBlacklistEntity lhSBlacklist) {
		String randomSeed = UUID.randomUUID().toString().replaceAll("-", "").toUpperCase();
		lhSBlacklist.setId(randomSeed);
		lhSBlacklistDao.insert(lhSBlacklist);
		
	}

	@Override
	public MiniDaoPage<LhSBlacklistEntity> getAll(LhSBlacklistEntity lhSBlacklist, int page, int rows) {
		return lhSBlacklistDao.getAll(lhSBlacklist, page, rows);
	}

	@Override
	public void delete(String id) {
		lhSBlacklistDao.delete(id);
		
	}
	
	@Override
	public void batchDelete(String[] ids) {
		for(int i = 0; i < ids.length; i++) {
			String id = ids[i];
			lhSBlacklistDao.deleteById(id);
		}
	}

	@Override
	public LhSBlacklistEntity getByPhone(String phone) {
		return lhSBlacklistDao.getByPhone(phone);
	}
}
