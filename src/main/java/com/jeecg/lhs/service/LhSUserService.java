package com.jeecg.lhs.service;

import org.jeecgframework.minidao.annotation.Param;
import org.jeecgframework.minidao.pojo.MiniDaoPage;

import com.jeecg.lhs.entity.LhSUserEntity;

/**
 * 描述：用户表
 * @author: www.jeecg.org
 * @since：2019年02月14日 07时41分17秒 星期四 
 * @version:1.0
 */
public interface LhSUserService {
	public LhSUserEntity get(String id);

	public int update(LhSUserEntity lhSUser);

	public void insert(LhSUserEntity lhSUser);

	public MiniDaoPage<LhSUserEntity> getAll(LhSUserEntity lhSUser,int page,int rows);

	public void delete(String id);
	
	public void batchDelete(String[] ids);
	
}
