package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShimingrenzhengEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShimingrenzhengVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShimingrenzhengView;


/**
 * 实名认证
 *
 * @author 
 * @email 
 * @date 2021-04-21 22:41:06
 */
public interface ShimingrenzhengService extends IService<ShimingrenzhengEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShimingrenzhengVO> selectListVO(Wrapper<ShimingrenzhengEntity> wrapper);
   	
   	ShimingrenzhengVO selectVO(@Param("ew") Wrapper<ShimingrenzhengEntity> wrapper);
   	
   	List<ShimingrenzhengView> selectListView(Wrapper<ShimingrenzhengEntity> wrapper);
   	
   	ShimingrenzhengView selectView(@Param("ew") Wrapper<ShimingrenzhengEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShimingrenzhengEntity> wrapper);
   	
}

