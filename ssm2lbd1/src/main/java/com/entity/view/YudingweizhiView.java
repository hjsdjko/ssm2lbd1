package com.entity.view;

import com.entity.YudingweizhiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 预定位置
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-21 22:41:06
 */
@TableName("yudingweizhi")
public class YudingweizhiView  extends YudingweizhiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YudingweizhiView(){
	}
 
 	public YudingweizhiView(YudingweizhiEntity yudingweizhiEntity){
 	try {
			BeanUtils.copyProperties(this, yudingweizhiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
