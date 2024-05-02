package com.entity.vo;

import com.entity.HuodongbaomingEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 活动报名
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("huodongbaoming")
public class HuodongbaomingVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 活动
     */

    @TableField(value = "huodongfabu_id")
    private Integer huodongfabuId;


    /**
     * 用户
     */

    @TableField(value = "yonghu_id")
    private Integer yonghuId;


    /**
     * 报名审核
     */

    @TableField(value = "huodongbaoming_yesno_types")
    private Integer huodongbaomingYesnoTypes;


    /**
     * 审核结果
     */

    @TableField(value = "huodongbaoming_yesno_text")
    private String huodongbaomingYesnoText;


    /**
     * 创建时间 show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：活动
	 */
    public Integer getHuodongfabuId() {
        return huodongfabuId;
    }


    /**
	 * 获取：活动
	 */

    public void setHuodongfabuId(Integer huodongfabuId) {
        this.huodongfabuId = huodongfabuId;
    }
    /**
	 * 设置：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：报名审核
	 */
    public Integer getHuodongbaomingYesnoTypes() {
        return huodongbaomingYesnoTypes;
    }


    /**
	 * 获取：报名审核
	 */

    public void setHuodongbaomingYesnoTypes(Integer huodongbaomingYesnoTypes) {
        this.huodongbaomingYesnoTypes = huodongbaomingYesnoTypes;
    }
    /**
	 * 设置：审核结果
	 */
    public String getHuodongbaomingYesnoText() {
        return huodongbaomingYesnoText;
    }


    /**
	 * 获取：审核结果
	 */

    public void setHuodongbaomingYesnoText(String huodongbaomingYesnoText) {
        this.huodongbaomingYesnoText = huodongbaomingYesnoText;
    }
    /**
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show1 show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
