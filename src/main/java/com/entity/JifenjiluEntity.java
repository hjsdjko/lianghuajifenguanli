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
 * 积分记录
 *
 * @author 
 * @email
 */
@TableName("jifenjilu")
public class JifenjiluEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public JifenjiluEntity() {

	}

	public JifenjiluEntity(T t) {
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
     * 标题
     */
    @TableField(value = "jifenjilu_name")

    private String jifenjiluName;


    /**
     * 项目类型
     */
    @TableField(value = "jifenjilu_types")

    private Integer jifenjiluTypes;


    /**
     * 增减类型
     */
    @TableField(value = "zhengjian_types")

    private Integer zhengjianTypes;


    /**
     * 涉及积分数量
     */
    @TableField(value = "jifenjilu_number")

    private Integer jifenjiluNumber;


    /**
     * 学生
     */
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 详情
     */
    @TableField(value = "jifenjilu_content")

    private String jifenjiluContent;


    /**
     * 发布时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


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
	 * 设置：标题
	 */
    public String getJifenjiluName() {
        return jifenjiluName;
    }


    /**
	 * 获取：标题
	 */

    public void setJifenjiluName(String jifenjiluName) {
        this.jifenjiluName = jifenjiluName;
    }
    /**
	 * 设置：项目类型
	 */
    public Integer getJifenjiluTypes() {
        return jifenjiluTypes;
    }


    /**
	 * 获取：项目类型
	 */

    public void setJifenjiluTypes(Integer jifenjiluTypes) {
        this.jifenjiluTypes = jifenjiluTypes;
    }
    /**
	 * 设置：增减类型
	 */
    public Integer getZhengjianTypes() {
        return zhengjianTypes;
    }


    /**
	 * 获取：增减类型
	 */

    public void setZhengjianTypes(Integer zhengjianTypes) {
        this.zhengjianTypes = zhengjianTypes;
    }
    /**
	 * 设置：涉及积分数量
	 */
    public Integer getJifenjiluNumber() {
        return jifenjiluNumber;
    }


    /**
	 * 获取：涉及积分数量
	 */

    public void setJifenjiluNumber(Integer jifenjiluNumber) {
        this.jifenjiluNumber = jifenjiluNumber;
    }
    /**
	 * 设置：学生
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：学生
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：详情
	 */
    public String getJifenjiluContent() {
        return jifenjiluContent;
    }


    /**
	 * 获取：详情
	 */

    public void setJifenjiluContent(String jifenjiluContent) {
        this.jifenjiluContent = jifenjiluContent;
    }
    /**
	 * 设置：发布时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：发布时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
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
        return "Jifenjilu{" +
            "id=" + id +
            ", jifenjiluName=" + jifenjiluName +
            ", jifenjiluTypes=" + jifenjiluTypes +
            ", zhengjianTypes=" + zhengjianTypes +
            ", jifenjiluNumber=" + jifenjiluNumber +
            ", yonghuId=" + yonghuId +
            ", jifenjiluContent=" + jifenjiluContent +
            ", insertTime=" + insertTime +
            ", createTime=" + createTime +
        "}";
    }
}
