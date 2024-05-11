package com.dao;

import com.entity.FujinwangbaEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.FujinwangbaVO;
import com.entity.view.FujinwangbaView;


/**
 * 附近网吧
 * 
 * @author 
 * @email 
 * @date 2021-04-21 22:41:06
 */
public interface FujinwangbaDao extends BaseMapper<FujinwangbaEntity> {
	
	List<FujinwangbaVO> selectListVO(@Param("ew") Wrapper<FujinwangbaEntity> wrapper);
	
	FujinwangbaVO selectVO(@Param("ew") Wrapper<FujinwangbaEntity> wrapper);
	
	List<FujinwangbaView> selectListView(@Param("ew") Wrapper<FujinwangbaEntity> wrapper);

	List<FujinwangbaView> selectListView(Pagination page,@Param("ew") Wrapper<FujinwangbaEntity> wrapper);
	
	FujinwangbaView selectView(@Param("ew") Wrapper<FujinwangbaEntity> wrapper);
	
}
