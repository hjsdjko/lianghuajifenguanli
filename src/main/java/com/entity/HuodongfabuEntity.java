package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 活动发布
 *
 * @author 
 * @email
 */
@TableName("huodongfabu")
public class HuodongfabuEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public HuodongfabuEntity() {

	}

	public HuodongfabuEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
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
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

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
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }
    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Huodongfabu{" +
            "id=" + id +
            ", huodongfabuName=" + huodongfabuName +
            ", huodongfabuTypes=" + huodongfabuTypes +
            ", huodongfabuFaburen=" + huodongfabuFaburen +
            ", huodongfabuContent=" + huodongfabuContent +
            ", createTime=" + createTime +
        "}";
    }
}
