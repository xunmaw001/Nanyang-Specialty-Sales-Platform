package com.entity.view;

import com.entity.TechanleixingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 特产类型
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-02-24 12:59:58
 */
@TableName("techanleixing")
public class TechanleixingView  extends TechanleixingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public TechanleixingView(){
	}
 
 	public TechanleixingView(TechanleixingEntity techanleixingEntity){
 	try {
			BeanUtils.copyProperties(this, techanleixingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
