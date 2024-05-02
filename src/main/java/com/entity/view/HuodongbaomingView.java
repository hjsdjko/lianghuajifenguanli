package com.entity.view;

import com.entity.HuodongbaomingEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 活动报名
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("huodongbaoming")
public class HuodongbaomingView extends HuodongbaomingEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 报名审核的值
		*/
		private String huodongbaomingYesnoValue;



		//级联表 huodongfabu
			/**
			* 活动名称
			*/
			private String huodongfabuName;
			/**
			* 活动类型
			*/
			private Integer huodongfabuTypes;
				/**
				* 活动类型的值
				*/
				private String huodongfabuValue;
			/**
			* 发起人
			*/
			private String huodongfabuFaburen;
			/**
			* 活动详情
			*/
			private String huodongfabuContent;

		//级联表 yonghu
			/**
			* 学号
			*/
			private String yonghuUuidNumber;
			/**
			* 学生姓名
			*/
			private String yonghuName;
			/**
			* 头像
			*/
			private String yonghuPhoto;
			/**
			* 学院
			*/
			private Integer xueyuanTypes;
				/**
				* 学院的值
				*/
				private String xueyuanValue;
			/**
			* 专业
			*/
			private Integer zhuanyeTypes;
				/**
				* 专业的值
				*/
				private String zhuanyeValue;
			/**
			* 班级
			*/
			private Integer banjiTypes;
				/**
				* 班级的值
				*/
				private String banjiValue;
			/**
			* 联系方式
			*/
			private String yonghuPhone;
			/**
			* 学生身份证号
			*/
			private String yonghuIdNumber;
			/**
			* 邮箱
			*/
			private String yonghuEmail;
			/**
			* 关量化积分
			*/
			private Integer jifenNumber;
			/**
			* 假删
			*/
			private Integer yonghuDelete;

	public HuodongbaomingView() {

	}

	public HuodongbaomingView(HuodongbaomingEntity huodongbaomingEntity) {
		try {
			BeanUtils.copyProperties(this, huodongbaomingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 报名审核的值
			*/
			public String getHuodongbaomingYesnoValue() {
				return huodongbaomingYesnoValue;
			}
			/**
			* 设置： 报名审核的值
			*/
			public void setHuodongbaomingYesnoValue(String huodongbaomingYesnoValue) {
				this.huodongbaomingYesnoValue = huodongbaomingYesnoValue;
			}










				//级联表的get和set huodongfabu

					/**
					* 获取： 活动名称
					*/
					public String getHuodongfabuName() {
						return huodongfabuName;
					}
					/**
					* 设置： 活动名称
					*/
					public void setHuodongfabuName(String huodongfabuName) {
						this.huodongfabuName = huodongfabuName;
					}

					/**
					* 获取： 活动类型
					*/
					public Integer getHuodongfabuTypes() {
						return huodongfabuTypes;
					}
					/**
					* 设置： 活动类型
					*/
					public void setHuodongfabuTypes(Integer huodongfabuTypes) {
						this.huodongfabuTypes = huodongfabuTypes;
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

					/**
					* 获取： 发起人
					*/
					public String getHuodongfabuFaburen() {
						return huodongfabuFaburen;
					}
					/**
					* 设置： 发起人
					*/
					public void setHuodongfabuFaburen(String huodongfabuFaburen) {
						this.huodongfabuFaburen = huodongfabuFaburen;
					}

					/**
					* 获取： 活动详情
					*/
					public String getHuodongfabuContent() {
						return huodongfabuContent;
					}
					/**
					* 设置： 活动详情
					*/
					public void setHuodongfabuContent(String huodongfabuContent) {
						this.huodongfabuContent = huodongfabuContent;
					}










				//级联表的get和set yonghu

					/**
					* 获取： 学号
					*/
					public String getYonghuUuidNumber() {
						return yonghuUuidNumber;
					}
					/**
					* 设置： 学号
					*/
					public void setYonghuUuidNumber(String yonghuUuidNumber) {
						this.yonghuUuidNumber = yonghuUuidNumber;
					}

					/**
					* 获取： 学生姓名
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 学生姓名
					*/
					public void setYonghuName(String yonghuName) {
						this.yonghuName = yonghuName;
					}

					/**
					* 获取： 头像
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 头像
					*/
					public void setYonghuPhoto(String yonghuPhoto) {
						this.yonghuPhoto = yonghuPhoto;
					}

					/**
					* 获取： 学院
					*/
					public Integer getXueyuanTypes() {
						return xueyuanTypes;
					}
					/**
					* 设置： 学院
					*/
					public void setXueyuanTypes(Integer xueyuanTypes) {
						this.xueyuanTypes = xueyuanTypes;
					}


						/**
						* 获取： 学院的值
						*/
						public String getXueyuanValue() {
							return xueyuanValue;
						}
						/**
						* 设置： 学院的值
						*/
						public void setXueyuanValue(String xueyuanValue) {
							this.xueyuanValue = xueyuanValue;
						}

					/**
					* 获取： 专业
					*/
					public Integer getZhuanyeTypes() {
						return zhuanyeTypes;
					}
					/**
					* 设置： 专业
					*/
					public void setZhuanyeTypes(Integer zhuanyeTypes) {
						this.zhuanyeTypes = zhuanyeTypes;
					}


						/**
						* 获取： 专业的值
						*/
						public String getZhuanyeValue() {
							return zhuanyeValue;
						}
						/**
						* 设置： 专业的值
						*/
						public void setZhuanyeValue(String zhuanyeValue) {
							this.zhuanyeValue = zhuanyeValue;
						}

					/**
					* 获取： 班级
					*/
					public Integer getBanjiTypes() {
						return banjiTypes;
					}
					/**
					* 设置： 班级
					*/
					public void setBanjiTypes(Integer banjiTypes) {
						this.banjiTypes = banjiTypes;
					}


						/**
						* 获取： 班级的值
						*/
						public String getBanjiValue() {
							return banjiValue;
						}
						/**
						* 设置： 班级的值
						*/
						public void setBanjiValue(String banjiValue) {
							this.banjiValue = banjiValue;
						}

					/**
					* 获取： 联系方式
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 联系方式
					*/
					public void setYonghuPhone(String yonghuPhone) {
						this.yonghuPhone = yonghuPhone;
					}

					/**
					* 获取： 学生身份证号
					*/
					public String getYonghuIdNumber() {
						return yonghuIdNumber;
					}
					/**
					* 设置： 学生身份证号
					*/
					public void setYonghuIdNumber(String yonghuIdNumber) {
						this.yonghuIdNumber = yonghuIdNumber;
					}

					/**
					* 获取： 邮箱
					*/
					public String getYonghuEmail() {
						return yonghuEmail;
					}
					/**
					* 设置： 邮箱
					*/
					public void setYonghuEmail(String yonghuEmail) {
						this.yonghuEmail = yonghuEmail;
					}

					/**
					* 获取： 关量化积分
					*/
					public Integer getJifenNumber() {
						return jifenNumber;
					}
					/**
					* 设置： 关量化积分
					*/
					public void setJifenNumber(Integer jifenNumber) {
						this.jifenNumber = jifenNumber;
					}

					/**
					* 获取： 假删
					*/
					public Integer getYonghuDelete() {
						return yonghuDelete;
					}
					/**
					* 设置： 假删
					*/
					public void setYonghuDelete(Integer yonghuDelete) {
						this.yonghuDelete = yonghuDelete;
					}



}
