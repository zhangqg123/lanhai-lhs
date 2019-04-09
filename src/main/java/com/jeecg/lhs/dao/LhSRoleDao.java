package com.jeecg.lhs.dao;

import org.jeecgframework.minidao.annotation.Param;
import org.jeecgframework.minidao.annotation.ResultType;
import org.jeecgframework.minidao.annotation.Sql;
import org.jeecgframework.minidao.pojo.MiniDaoPage;
import org.springframework.stereotype.Repository;

import com.jeecg.lhs.entity.LhSRoleEntity;

/**
 * 描述：角色表
 * @author：www.jeecg.org
 * @since：2019年04月09日 14时33分52秒 星期二 
 * @version:1.0
 */
@Repository
public interface LhSRoleDao{

    /**
	 * 查询返回Java对象
	 * @param id
	 * @return
	 */
	@Sql("SELECT * FROM lh_s_role WHERE ID = :id")
	LhSRoleEntity get(@Param("id") String id);
	
	/**
	 * 修改数据
	 * @param lhSRole
	 * @return
	 */
	int update(@Param("lhSRole") LhSRoleEntity lhSRole);
	
	/**
	 * 插入数据
	 * @param act
	 */
	void insert(@Param("lhSRole") LhSRoleEntity lhSRole);
	
	/**
	 * 通用分页方法，支持（oracle、mysql、SqlServer、postgresql）
	 * @param lhSRole
	 * @param page
	 * @param rows
	 * @return
	 */
	@ResultType(LhSRoleEntity.class)
	public MiniDaoPage<LhSRoleEntity> getAll(@Param("lhSRole") LhSRoleEntity lhSRole,@Param("page")  int page,@Param("rows") int rows);
	
	@Sql("DELETE from lh_s_role WHERE ID = :id")
	public void delete(@Param("id") String id);
	
	/**
	 * 根据ID删除
	 * @param id
	 */
	 @Sql("DELETE from lh_s_role WHERE ID = :id")
	 public void deleteById(@Param("id") String id);
	
}

