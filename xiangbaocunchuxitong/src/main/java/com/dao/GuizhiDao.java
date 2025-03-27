package com.dao;

import com.entity.GuizhiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.GuizhiView;

/**
 * 柜子信息 Dao 接口
 *
 * @author 
 */
public interface GuizhiDao extends BaseMapper<GuizhiEntity> {

   List<GuizhiView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
