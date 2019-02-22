package com.jeecg.lhs.dao;

import org.jeecgframework.minidao.annotation.Param;
import org.jeecgframework.minidao.annotation.ResultType;
import org.jeecgframework.minidao.annotation.Sql;
import org.jeecgframework.minidao.pojo.MiniDaoPage;
import org.springframework.stereotype.Repository;

import com.jeecg.lhs.entity.LhSDeptEntity;

/**
 * 描述：部门表
 * @author：www.jeecg.org
 * @since：2019年02月22日 15时39分51秒 星期五 
 * @version:1.0
 */
@Repository
public interface LhSDeptDao{

    /**
	 * 查询返回Java对象
	 * @param id
	 * @return
	 */
	@Sql("SELECT * FROM lh_s_dept WHERE ID = :id")
	LhSDeptEntity get(@Param("id") String id);
	
	/**
	 * 修改数据
	 * @param lhSDept
	 * @return
	 */
	int update(@Param("lhSDept") LhSDeptEntity lhSDept);
	
	/**
	 * 插入数据
	 * @param act
	 */
	void insert(@Param("lhSDept") LhSDeptEntity lhSDept);
	
	/**
	 * 通用分页方法，支持（oracle、mysql、SqlServer、postgresql）
	 * @param lhSDept
	 * @param page
	 * @param rows
	 * @return
	 */
	@ResultType(LhSDeptEntity.class)
	public MiniDaoPage<LhSDeptEntity> getAll(@Param("lhSDept") LhSDeptEntity lhSDept,@Param("page")  int page,@Param("rows") int rows);
	
	@Sql("DELETE from lh_s_dept WHERE ID = :id")
	public void delete(@Param("id") String id);
	
	/**
	 * 根据ID删除
	 * @param id
	 */
	 @Sql("DELETE from lh_s_dept WHERE ID = :id")
	 public void deleteById(@Param("id") String id);
	
}

