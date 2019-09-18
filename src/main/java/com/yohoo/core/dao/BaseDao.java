package com.yohoo.core.dao;

import java.util.List;

/**
 * DAO层基础接口
 * 
 * @author LinXi
 *
 * @param <PO>
 *            实 体
 * @param <BO>
 *            业务 体
 * @param <EX>
 *            Example 体
 * @param <ID>
 *            主键
 * @date 2017-03-09 11:28:33
 */
public interface BaseDao<PO, BO, EX, ID> {

	/**
	 * 新增
	 * 
	 * @param po
	 * @return
	 */
	int insert(PO po);

	/**
	 * 新增字段值不为null的字段
	 * 
	 * @param po
	 * @return
	 */
	int insertSelective(PO po);

	/**
	 * 按主键ID删除
	 * 
	 * @param id
	 * @return
	 */
	int deleteByPrimaryKey(ID id);

	/**
	 * 按条件删除
	 * 
	 * @param ex
	 * @return
	 */
	int deleteByExample(EX ex);

	/**
	 * 按实体 其他字段删除
	 * 
	 * @param po
	 * @return
	 */
	int deleteByEntity(PO po);

	/**
	 * 按主键更新
	 * 
	 * @param po
	 * @return
	 */
	int updateByPrimaryKey(PO po);

	/**
	 * 按主键更新值不为null的字段
	 * 
	 * @param po
	 * @return
	 */
	int updateByPrimaryKeySelective(PO po);

	/**
	 * 按主键ID查询实体BO
	 * 
	 * @param id
	 * @return
	 */
	BO selectByPrimaryKey(ID id);

	/**
	 * 按 Ex条件 查询
	 * 
	 * @param ex
	 * @return
	 */
	List<BO> selectByExample(EX ex);

	/**
	 * 按条件计数
	 * 
	 * @param ex
	 * @return
	 */
	int countByExample(EX ex);

	/**
	 * 按实体BO字段查询结果集（）
	 * 
	 * @param bo
	 * @return
	 */
	List<BO> selectRows(BO bo);
}
