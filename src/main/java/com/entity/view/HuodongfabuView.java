package com.entity.view;

import com.entity.HuodongfabuEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 活动发布
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("huodongfabu")
public class HuodongfabuView extends HuodongfabuEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 活动类型的值
		*/
		private String huodongfabuValue;



	public HuodongfabuView() {

	}

	public HuodongfabuView(HuodongfabuEntity huodongfabuEntity) {
		try {
			BeanUtils.copyProperties(this, huodongfabuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 活动类型的值
			*/
			public String getHuodongfabuValue() {
				return huodongfabuValue;
			}
			/**
			* 设置： 活动类型的值
			*/
			public void setHuodongfabuValue(String huodongfabuValue) {
				this.huodongfabuValue = huodongfabuValue;
			}









}
