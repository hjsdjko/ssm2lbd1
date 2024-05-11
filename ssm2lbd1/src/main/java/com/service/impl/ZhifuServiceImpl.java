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


import com.dao.ZhifuDao;
import com.entity.ZhifuEntity;
import com.service.ZhifuService;
import com.entity.vo.ZhifuVO;
import com.entity.view.ZhifuView;

@Service("zhifuService")
public class ZhifuServiceImpl extends ServiceImpl<ZhifuDao, ZhifuEntity> implements ZhifuService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZhifuEntity> page = this.selectPage(
                new Query<ZhifuEntity>(params).getPage(),
                new EntityWrapper<ZhifuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZhifuEntity> wrapper) {
		  Page<ZhifuView> page =new Query<ZhifuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZhifuVO> selectListVO(Wrapper<ZhifuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZhifuVO selectVO(Wrapper<ZhifuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZhifuView> selectListView(Wrapper<ZhifuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZhifuView selectView(Wrapper<ZhifuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
