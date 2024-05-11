package com.dao;

import com.entity.YudingweizhiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YudingweizhiVO;
import com.entity.view.YudingweizhiView;


/**
 * 预定位置
 * 
 * @author 
 * @email 
 * @date 2021-04-21 22:41:06
 */
public interface YudingweizhiDao extends BaseMapper<YudingweizhiEntity> {
	
	List<YudingweizhiVO> selectListVO(@Param("ew") Wrapper<YudingweizhiEntity> wrapper);
	
	YudingweizhiVO selectVO(@Param("ew") Wrapper<YudingweizhiEntity> wrapper);
	
	List<YudingweizhiView> selectListView(@Param("ew") Wrapper<YudingweizhiEntity> wrapper);

	List<YudingweizhiView> selectListView(Pagination page,@Param("ew") Wrapper<YudingweizhiEntity> wrapper);
	
	YudingweizhiView selectView(@Param("ew") Wrapper<YudingweizhiEntity> wrapper);
	
}
