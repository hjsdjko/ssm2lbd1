package com.dao;

import com.entity.ShimingrenzhengEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShimingrenzhengVO;
import com.entity.view.ShimingrenzhengView;


/**
 * 实名认证
 * 
 * @author 
 * @email 
 * @date 2021-04-21 22:41:06
 */
public interface ShimingrenzhengDao extends BaseMapper<ShimingrenzhengEntity> {
	
	List<ShimingrenzhengVO> selectListVO(@Param("ew") Wrapper<ShimingrenzhengEntity> wrapper);
	
	ShimingrenzhengVO selectVO(@Param("ew") Wrapper<ShimingrenzhengEntity> wrapper);
	
	List<ShimingrenzhengView> selectListView(@Param("ew") Wrapper<ShimingrenzhengEntity> wrapper);

	List<ShimingrenzhengView> selectListView(Pagination page,@Param("ew") Wrapper<ShimingrenzhengEntity> wrapper);
	
	ShimingrenzhengView selectView(@Param("ew") Wrapper<ShimingrenzhengEntity> wrapper);
	
}
