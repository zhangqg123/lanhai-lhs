package com.jeecg.lhs.service;

import org.jeecgframework.minidao.annotation.Param;
import org.jeecgframework.minidao.pojo.MiniDaoPage;
import com.jeecg.lhs.entity.LhSBlacklistEntity;

/**
 * 描述：黑名单表
 * @author: www.jeecg.org
 * @since：2019年04月23日 09时42分42秒 星期二 
 * @version:1.0
 */
public interface LhSBlacklistService {
	public LhSBlacklistEntity get(String id);
	public LhSBlacklistEntity getByPhone(String phone);
	public int update(LhSBlacklistEntity lhSBlacklist);

	public void insert(LhSBlacklistEntity lhSBlacklist);

	public MiniDaoPage<LhSBlacklistEntity> getAll(LhSBlacklistEntity lhSBlacklist,int page,int rows);

	public void delete(String id);
	
	public void batchDelete(String[] ids);
	
}
