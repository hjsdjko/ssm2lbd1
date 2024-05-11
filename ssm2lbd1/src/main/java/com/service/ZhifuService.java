package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhifuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZhifuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhifuView;


/**
 * 支付
 *
 * @author 
 * @email 
 * @date 2021-04-21 22:41:06
 */
public interface ZhifuService extends IService<ZhifuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhifuVO> selectListVO(Wrapper<ZhifuEntity> wrapper);
   	
   	ZhifuVO selectVO(@Param("ew") Wrapper<ZhifuEntity> wrapper);
   	
   	List<ZhifuView> selectListView(Wrapper<ZhifuEntity> wrapper);
   	
   	ZhifuView selectView(@Param("ew") Wrapper<ZhifuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhifuEntity> wrapper);
   	
}

