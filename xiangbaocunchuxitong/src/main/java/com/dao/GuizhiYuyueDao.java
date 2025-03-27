package com.dao;

import com.entity.GuizhiYuyueEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.GuizhiYuyueView;

/**
 * 物品存储 Dao 接口
 *
 * @author 
 */
public interface GuizhiYuyueDao extends BaseMapper<GuizhiYuyueEntity> {

   List<GuizhiYuyueView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
