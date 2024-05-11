package com.dao;

import com.entity.ShangpindiangouEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShangpindiangouVO;
import com.entity.view.ShangpindiangouView;


/**
 * 商品店购
 * 
 * @author 
 * @email 
 * @date 2021-04-21 22:41:06
 */
public interface ShangpindiangouDao extends BaseMapper<ShangpindiangouEntity> {
	
	List<ShangpindiangouVO> selectListVO(@Param("ew") Wrapper<ShangpindiangouEntity> wrapper);
	
	ShangpindiangouVO selectVO(@Param("ew") Wrapper<ShangpindiangouEntity> wrapper);
	
	List<ShangpindiangouView> selectListView(@Param("ew") Wrapper<ShangpindiangouEntity> wrapper);

	List<ShangpindiangouView> selectListView(Pagination page,@Param("ew") Wrapper<ShangpindiangouEntity> wrapper);
	
	ShangpindiangouView selectView(@Param("ew") Wrapper<ShangpindiangouEntity> wrapper);
	
}
