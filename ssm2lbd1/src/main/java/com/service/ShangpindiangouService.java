package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShangpindiangouEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShangpindiangouVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShangpindiangouView;


/**
 * 商品店购
 *
 * @author 
 * @email 
 * @date 2021-04-21 22:41:06
 */
public interface ShangpindiangouService extends IService<ShangpindiangouEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShangpindiangouVO> selectListVO(Wrapper<ShangpindiangouEntity> wrapper);
   	
   	ShangpindiangouVO selectVO(@Param("ew") Wrapper<ShangpindiangouEntity> wrapper);
   	
   	List<ShangpindiangouView> selectListView(Wrapper<ShangpindiangouEntity> wrapper);
   	
   	ShangpindiangouView selectView(@Param("ew") Wrapper<ShangpindiangouEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShangpindiangouEntity> wrapper);
   	
}

