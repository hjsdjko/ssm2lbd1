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


import com.dao.FujinwangbaDao;
import com.entity.FujinwangbaEntity;
import com.service.FujinwangbaService;
import com.entity.vo.FujinwangbaVO;
import com.entity.view.FujinwangbaView;

@Service("fujinwangbaService")
public class FujinwangbaServiceImpl extends ServiceImpl<FujinwangbaDao, FujinwangbaEntity> implements FujinwangbaService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<FujinwangbaEntity> page = this.selectPage(
                new Query<FujinwangbaEntity>(params).getPage(),
                new EntityWrapper<FujinwangbaEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<FujinwangbaEntity> wrapper) {
		  Page<FujinwangbaView> page =new Query<FujinwangbaView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<FujinwangbaVO> selectListVO(Wrapper<FujinwangbaEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public FujinwangbaVO selectVO(Wrapper<FujinwangbaEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<FujinwangbaView> selectListView(Wrapper<FujinwangbaEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public FujinwangbaView selectView(Wrapper<FujinwangbaEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
