package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YudingweizhiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YudingweizhiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YudingweizhiView;


/**
 * 预定位置
 *
 * @author 
 * @email 
 * @date 2021-04-21 22:41:06
 */
public interface YudingweizhiService extends IService<YudingweizhiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YudingweizhiVO> selectListVO(Wrapper<YudingweizhiEntity> wrapper);
   	
   	YudingweizhiVO selectVO(@Param("ew") Wrapper<YudingweizhiEntity> wrapper);
   	
   	List<YudingweizhiView> selectListView(Wrapper<YudingweizhiEntity> wrapper);
   	
   	YudingweizhiView selectView(@Param("ew") Wrapper<YudingweizhiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YudingweizhiEntity> wrapper);
   	
}

