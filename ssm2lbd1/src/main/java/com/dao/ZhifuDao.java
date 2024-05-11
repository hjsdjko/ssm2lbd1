package com.dao;

import com.entity.ZhifuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZhifuVO;
import com.entity.view.ZhifuView;


/**
 * 支付
 * 
 * @author 
 * @email 
 * @date 2021-04-21 22:41:06
 */
public interface ZhifuDao extends BaseMapper<ZhifuEntity> {
	
	List<ZhifuVO> selectListVO(@Param("ew") Wrapper<ZhifuEntity> wrapper);
	
	ZhifuVO selectVO(@Param("ew") Wrapper<ZhifuEntity> wrapper);
	
	List<ZhifuView> selectListView(@Param("ew") Wrapper<ZhifuEntity> wrapper);

	List<ZhifuView> selectListView(Pagination page,@Param("ew") Wrapper<ZhifuEntity> wrapper);
	
	ZhifuView selectView(@Param("ew") Wrapper<ZhifuEntity> wrapper);
	
}
