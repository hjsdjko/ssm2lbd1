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


import com.dao.YudingweizhiDao;
import com.entity.YudingweizhiEntity;
import com.service.YudingweizhiService;
import com.entity.vo.YudingweizhiVO;
import com.entity.view.YudingweizhiView;

@Service("yudingweizhiService")
public class YudingweizhiServiceImpl extends ServiceImpl<YudingweizhiDao, YudingweizhiEntity> implements YudingweizhiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YudingweizhiEntity> page = this.selectPage(
                new Query<YudingweizhiEntity>(params).getPage(),
                new EntityWrapper<YudingweizhiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YudingweizhiEntity> wrapper) {
		  Page<YudingweizhiView> page =new Query<YudingweizhiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YudingweizhiVO> selectListVO(Wrapper<YudingweizhiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YudingweizhiVO selectVO(Wrapper<YudingweizhiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YudingweizhiView> selectListView(Wrapper<YudingweizhiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YudingweizhiView selectView(Wrapper<YudingweizhiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
