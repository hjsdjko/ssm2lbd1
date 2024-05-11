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


import com.dao.ShangpindiangouDao;
import com.entity.ShangpindiangouEntity;
import com.service.ShangpindiangouService;
import com.entity.vo.ShangpindiangouVO;
import com.entity.view.ShangpindiangouView;

@Service("shangpindiangouService")
public class ShangpindiangouServiceImpl extends ServiceImpl<ShangpindiangouDao, ShangpindiangouEntity> implements ShangpindiangouService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShangpindiangouEntity> page = this.selectPage(
                new Query<ShangpindiangouEntity>(params).getPage(),
                new EntityWrapper<ShangpindiangouEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShangpindiangouEntity> wrapper) {
		  Page<ShangpindiangouView> page =new Query<ShangpindiangouView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShangpindiangouVO> selectListVO(Wrapper<ShangpindiangouEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShangpindiangouVO selectVO(Wrapper<ShangpindiangouEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShangpindiangouView> selectListView(Wrapper<ShangpindiangouEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShangpindiangouView selectView(Wrapper<ShangpindiangouEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
