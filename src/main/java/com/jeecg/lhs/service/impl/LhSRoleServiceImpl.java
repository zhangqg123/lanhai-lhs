package com.jeecg.lhs.service.impl;

import javax.annotation.Resource;
import java.util.UUID;
import org.jeecgframework.minidao.pojo.MiniDaoPage;
import org.springframework.stereotype.Service;

import com.jeecg.lhs.dao.LhSRoleDao;
import com.jeecg.lhs.entity.LhSRoleEntity;
import com.jeecg.lhs.service.LhSRoleService;

/**
 * 描述：角色表
 * @author: www.jeecg.org
 * @since：2019年04月09日 14时33分52秒 星期二 
 * @version:1.0
 */

@Service("lhSRoleService")
public class LhSRoleServiceImpl implements LhSRoleService {
	@Resource
	private LhSRoleDao lhSRoleDao;

	@Override
	public LhSRoleEntity get(String id) {
		return lhSRoleDao.get(id);
	}

	@Override
	public int update(LhSRoleEntity lhSRole) {
		return lhSRoleDao.update(lhSRole);
	}

	@Override
	public void insert(LhSRoleEntity lhSRole) {
		String randomSeed = UUID.randomUUID().toString().replaceAll("-", "").toUpperCase();
		lhSRole.setId(randomSeed);
		lhSRoleDao.insert(lhSRole);
		
	}

	@Override
	public MiniDaoPage<LhSRoleEntity> getAll(LhSRoleEntity lhSRole, int page, int rows) {
		return lhSRoleDao.getAll(lhSRole, page, rows);
	}

	@Override
	public void delete(String id) {
		lhSRoleDao.delete(id);
		
	}
	
	@Override
	public void batchDelete(String[] ids) {
		for(int i = 0; i < ids.length; i++) {
			String id = ids[i];
			lhSRoleDao.deleteById(id);
		}
	}
}
