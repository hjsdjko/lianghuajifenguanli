package com.dao;

import com.entity.JifenjiluEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.JifenjiluView;

/**
 * 积分记录 Dao 接口
 *
 * @author 
 */
public interface JifenjiluDao extends BaseMapper<JifenjiluEntity> {

   List<JifenjiluView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
