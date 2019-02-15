package com.jeecg.user.dao;

import org.jeecgframework.minidao.annotation.Param;
import org.jeecgframework.minidao.annotation.ResultType;
import org.jeecgframework.minidao.annotation.Sql;
import org.jeecgframework.minidao.pojo.MiniDaoPage;
import org.springframework.stereotype.Repository;

import com.jeecg.user.entity.LhSUserEntity;

/**
 * 描述：用户表
 * @author：www.jeecg.org
 * @since：2019年02月14日 07时41分17秒 星期四 
 * @version:1.0
 */
@Repository
public interface LhSUserDao{

    /**
	 * 查询返回Java对象
	 * @param id
	 * @return
	 */
	@Sql("SELECT * FROM lh_s_user WHERE ID = :id")
	LhSUserEntity get(@Param("id") String id);
	
	/**
	 * 修改数据
	 * @param lhSUser
	 * @return
	 */
	int update(@Param("lhSUser") LhSUserEntity lhSUser);
	
	/**
	 * 插入数据
	 * @param act
	 */
	void insert(@Param("lhSUser") LhSUserEntity lhSUser);
	
	/**
	 * 通用分页方法，支持（oracle、mysql、SqlServer、postgresql）
	 * @param lhSUser
	 * @param page
	 * @param rows
	 * @return
	 */
	@ResultType(LhSUserEntity.class)
	public MiniDaoPage<LhSUserEntity> getAll(@Param("lhSUser") LhSUserEntity lhSUser,@Param("page")  int page,@Param("rows") int rows);
	
	@Sql("DELETE from lh_s_user WHERE ID = :id")
	public void delete(@Param("id") String id);
	
	/**
	 * 根据ID删除
	 * @param id
	 */
	 @Sql("DELETE from lh_s_user WHERE ID = :id")
	 public void deleteById(@Param("id") String id);
	
}

