package com.entity.view;

import com.entity.RukuxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.utils.EncryptUtil;
 

/**
 * 入库信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-02-27 17:29:35
 */
@TableName("rukuxinxi")
public class RukuxinxiView  extends RukuxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public RukuxinxiView(){
	}
 
 	public RukuxinxiView(RukuxinxiEntity rukuxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, rukuxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
