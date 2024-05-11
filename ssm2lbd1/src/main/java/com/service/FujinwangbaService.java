package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.FujinwangbaEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.FujinwangbaVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.FujinwangbaView;


/**
 * 附近网吧
 *
 * @author 
 * @email 
 * @date 2021-04-21 22:41:06
 */
public interface FujinwangbaService extends IService<FujinwangbaEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<FujinwangbaVO> selectListVO(Wrapper<FujinwangbaEntity> wrapper);
   	
   	FujinwangbaVO selectVO(@Param("ew") Wrapper<FujinwangbaEntity> wrapper);
   	
   	List<FujinwangbaView> selectListView(Wrapper<FujinwangbaEntity> wrapper);
   	
   	FujinwangbaView selectView(@Param("ew") Wrapper<FujinwangbaEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<FujinwangbaEntity> wrapper);
   	
}

