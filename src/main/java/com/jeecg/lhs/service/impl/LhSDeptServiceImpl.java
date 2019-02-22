package com.jeecg.lhs.service.impl;

import javax.annotation.Resource;

import java.util.UUID;

import org.jeecgframework.minidao.pojo.MiniDaoPage;
import org.springframework.stereotype.Service;

import com.jeecg.lhs.dao.LhSDeptDao;
import com.jeecg.lhs.entity.LhSDeptEntity;
import com.jeecg.lhs.service.LhSDeptService;



/**
 * 描述：部门表
 * @author: www.jeecg.org
 * @since：2019年02月22日 15时39分51秒 星期五 
 * @version:1.0
 */

@Service("lhSDeptService")
public class LhSDeptServiceImpl implements LhSDeptService {
	@Resource
	private LhSDeptDao lhSDeptDao;

	@Override
	public LhSDeptEntity get(String id) {
		return lhSDeptDao.get(id);
	}

	@Override
	public int update(LhSDeptEntity lhSDept) {
		return lhSDeptDao.update(lhSDept);
	}

	@Override
	public void insert(LhSDeptEntity lhSDept) {
		String randomSeed = UUID.randomUUID().toString().replaceAll("-", "").toUpperCase();
		lhSDept.setId(randomSeed);
		lhSDeptDao.insert(lhSDept);
		
	}

	@Override
	public MiniDaoPage<LhSDeptEntity> getAll(LhSDeptEntity lhSDept, int page, int rows) {
		return lhSDeptDao.getAll(lhSDept, page, rows);
	}

	@Override
	public void delete(String id) {
		lhSDeptDao.delete(id);
		
	}
	
	@Override
	public void batchDelete(String[] ids) {
		for(int i = 0; i < ids.length; i++) {
			String id = ids[i];
			lhSDeptDao.deleteById(id);
		}
	}
}
