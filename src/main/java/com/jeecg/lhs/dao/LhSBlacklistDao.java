package com.jeecg.lhs.dao;

import org.jeecgframework.minidao.annotation.Param;
import org.jeecgframework.minidao.annotation.ResultType;
import org.jeecgframework.minidao.annotation.Sql;
import org.jeecgframework.minidao.pojo.MiniDaoPage;
import org.springframework.stereotype.Repository;

import com.jeecg.lhs.entity.LhSBlacklistEntity;

/**
 * 描述：黑名单表
 * @author：www.jeecg.org
 * @since：2019年04月23日 09时42分42秒 星期二 
 * @version:1.0
 */
@Repository
public interface LhSBlacklistDao{

    /**
	 * 查询返回Java对象
	 * @param id
	 * @return
	 */
	@Sql("SELECT * FROM lh_s_blacklist WHERE ID = :id")
	LhSBlacklistEntity get(@Param("id") String id);
	
	@Sql("SELECT * FROM lh_s_blacklist WHERE phone = :phone")
	LhSBlacklistEntity getByPhone(@Param("phone") String phone);
	
	/**
	 * 修改数据
	 * @param lhSBlacklist
	 * @return
	 */
	int update(@Param("lhSBlacklist") LhSBlacklistEntity lhSBlacklist);
	
	/**
	 * 插入数据
	 * @param act
	 */
	void insert(@Param("lhSBlacklist") LhSBlacklistEntity lhSBlacklist);
	
	/**
	 * 通用分页方法，支持（oracle、mysql、SqlServer、postgresql）
	 * @param lhSBlacklist
	 * @param page
	 * @param rows
	 * @return
	 */
	@ResultType(LhSBlacklistEntity.class)
	public MiniDaoPage<LhSBlacklistEntity> getAll(@Param("lhSBlacklist") LhSBlacklistEntity lhSBlacklist,@Param("page")  int page,@Param("rows") int rows);
	
	@Sql("DELETE from lh_s_blacklist WHERE ID = :id")
	public void delete(@Param("id") String id);
	
	/**
	 * 根据ID删除
	 * @param id
	 */
	 @Sql("DELETE from lh_s_blacklist WHERE ID = :id")
	 public void deleteById(@Param("id") String id);
	 
	@Sql("DELETE from lh_s_blacklist WHERE open_id = :openid")
	public void deleteByOpenId(@Param("openid") String openid);
	
}

