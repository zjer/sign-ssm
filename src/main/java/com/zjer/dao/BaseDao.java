package com.zjer.dao;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * @author Administrator
 * @date 2018/2/23 14:50
 */
public interface BaseDao<T> {
    //带条件查询，条件可以为null，既没有条件；返回list对象集合
    public List<T> find(Map paraMap);

    //只查询一个，常用于修改
    public T get(Serializable id);

    //插入，用实体作为参数
    public void insert(T entity);

    //修改，用实体作为参数
    public void update(T entity);

    //按id删除，删除一条；支持整数型和字符串类型ID
    public void deleteById(Serializable id);

    //批量删除；支持整数型和字符串类型ID
    public void delete(Serializable[] ids);
}
