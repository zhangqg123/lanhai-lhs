package com.jeecg.lhs.service;

import org.jeecgframework.minidao.annotation.Param;
import org.jeecgframework.minidao.pojo.MiniDaoPage;

import com.jeecg.lhs.entity.LhSDeptEntity;

/**
 * 描述：部门表
 * @author: www.jeecg.org
 * @since：2019年02月22日 15时39分51秒 星期五 
 * @version:1.0
 */
public interface LhSDeptService {
	public LhSDeptEntity get(String id);

	public int update(LhSDeptEntity lhSDept);

	public void insert(LhSDeptEntity lhSDept);

	public MiniDaoPage<LhSDeptEntity> getAll(LhSDeptEntity lhSDept,int page,int rows);

	public void delete(String id);
	
	public void batchDelete(String[] ids);
	
}
