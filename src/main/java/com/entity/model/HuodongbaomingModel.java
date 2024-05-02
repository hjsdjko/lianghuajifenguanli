package com.entity.model;

import com.entity.HuodongbaomingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 活动报名
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class HuodongbaomingModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 活动
     */
    private Integer huodongfabuId;


    /**
     * 用户
     */
    private Integer yonghuId;


    /**
     * 报名审核
     */
    private Integer huodongbaomingYesnoTypes;


    /**
     * 审核结果
     */
    private String huodongbaomingYesnoText;


    /**
     * 创建时间 show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：活动
	 */
    public Integer getHuodongfabuId() {
        return huodongfabuId;
    }


    /**
	 * 设置：活动
	 */
    public void setHuodongfabuId(Integer huodongfabuId) {
        this.huodongfabuId = huodongfabuId;
    }
    /**
	 * 获取：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 设置：用户
	 */
    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：报名审核
	 */
    public Integer getHuodongbaomingYesnoTypes() {
        return huodongbaomingYesnoTypes;
    }


    /**
	 * 设置：报名审核
	 */
    public void setHuodongbaomingYesnoTypes(Integer huodongbaomingYesnoTypes) {
        this.huodongbaomingYesnoTypes = huodongbaomingYesnoTypes;
    }
    /**
	 * 获取：审核结果
	 */
    public String getHuodongbaomingYesnoText() {
        return huodongbaomingYesnoText;
    }


    /**
	 * 设置：审核结果
	 */
    public void setHuodongbaomingYesnoText(String huodongbaomingYesnoText) {
        this.huodongbaomingYesnoText = huodongbaomingYesnoText;
    }
    /**
	 * 获取：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
