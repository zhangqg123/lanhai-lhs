package com.jeecg.lhs.service;

import org.jeecgframework.minidao.annotation.Param;
import org.jeecgframework.minidao.pojo.MiniDaoPage;
import com.jeecg.lhs.entity.LhSRoleEntity;

/**
 * 描述：角色表
 * @author: www.jeecg.org
 * @since：2019年04月09日 14时33分52秒 星期二 
 * @version:1.0
 */
public interface LhSRoleService {
	public LhSRoleEntity get(String id);

	public int update(LhSRoleEntity lhSRole);

	public void insert(LhSRoleEntity lhSRole);

	public MiniDaoPage<LhSRoleEntity> getAll(LhSRoleEntity lhSRole,int page,int rows);

	public void delete(String id);
	
	public void batchDelete(String[] ids);
	
}
