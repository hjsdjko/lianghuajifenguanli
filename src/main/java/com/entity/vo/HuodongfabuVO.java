package com.entity.vo;

import com.entity.HuodongfabuEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 活动发布
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("huodongfabu")
public class HuodongfabuVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 活动名称
     */

    @TableField(value = "huodongfabu_name")
    private String huodongfabuName;


    /**
     * 活动类型
     */

    @TableField(value = "huodongfabu_types")
    private Integer huodongfabuTypes;


    /**
     * 发起人
     */

    @TableField(value = "huodongfabu_faburen")
    private String huodongfabuFaburen;


    /**
     * 活动详情
     */

    @TableField(value = "huodongfabu_content")
    private String huodongfabuContent;


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
	 * 设置：活动名称
	 */
    public String getHuodongfabuName() {
        return huodongfabuName;
    }


    /**
	 * 获取：活动名称
	 */

    public void setHuodongfabuName(String huodongfabuName) {
        this.huodongfabuName = huodongfabuName;
    }
    /**
	 * 设置：活动类型
	 */
    public Integer getHuodongfabuTypes() {
        return huodongfabuTypes;
    }


    /**
	 * 获取：活动类型
	 */

    public void setHuodongfabuTypes(Integer huodongfabuTypes) {
        this.huodongfabuTypes = huodongfabuTypes;
    }
    /**
	 * 设置：发起人
	 */
    public String getHuodongfabuFaburen() {
        return huodongfabuFaburen;
    }


    /**
	 * 获取：发起人
	 */

    public void setHuodongfabuFaburen(String huodongfabuFaburen) {
        this.huodongfabuFaburen = huodongfabuFaburen;
    }
    /**
	 * 设置：活动详情
	 */
    public String getHuodongfabuContent() {
        return huodongfabuContent;
    }


    /**
	 * 获取：活动详情
	 */

    public void setHuodongfabuContent(String huodongfabuContent) {
        this.huodongfabuContent = huodongfabuContent;
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
