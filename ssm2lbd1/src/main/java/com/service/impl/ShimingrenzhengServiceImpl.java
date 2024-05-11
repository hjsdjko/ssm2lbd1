package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.ShimingrenzhengDao;
import com.entity.ShimingrenzhengEntity;
import com.service.ShimingrenzhengService;
import com.entity.vo.ShimingrenzhengVO;
import com.entity.view.ShimingrenzhengView;

@Service("shimingrenzhengService")
public class ShimingrenzhengServiceImpl extends ServiceImpl<ShimingrenzhengDao, ShimingrenzhengEntity> implements ShimingrenzhengService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShimingrenzhengEntity> page = this.selectPage(
                new Query<ShimingrenzhengEntity>(params).getPage(),
                new EntityWrapper<ShimingrenzhengEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShimingrenzhengEntity> wrapper) {
		  Page<ShimingrenzhengView> page =new Query<ShimingrenzhengView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShimingrenzhengVO> selectListVO(Wrapper<ShimingrenzhengEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShimingrenzhengVO selectVO(Wrapper<ShimingrenzhengEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShimingrenzhengView> selectListView(Wrapper<ShimingrenzhengEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShimingrenzhengView selectView(Wrapper<ShimingrenzhengEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
