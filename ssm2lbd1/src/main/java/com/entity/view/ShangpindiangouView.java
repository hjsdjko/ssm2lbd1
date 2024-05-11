package com.entity.view;

import com.entity.ShangpindiangouEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 商品店购
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-21 22:41:06
 */
@TableName("shangpindiangou")
public class ShangpindiangouView  extends ShangpindiangouEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShangpindiangouView(){
	}
 
 	public ShangpindiangouView(ShangpindiangouEntity shangpindiangouEntity){
 	try {
			BeanUtils.copyProperties(this, shangpindiangouEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
