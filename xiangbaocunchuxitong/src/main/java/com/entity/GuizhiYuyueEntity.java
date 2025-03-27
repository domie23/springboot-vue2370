package com.entity;

import com.annotation.ColumnInfo;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;
import java.io.Serializable;
import java.util.*;
import org.apache.tools.ant.util.DateUtils;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.utils.DateUtil;


/**
 * 物品存储
 *
 * @author 
 * @email
 */
@TableName("guizhi_yuyue")
public class GuizhiYuyueEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public GuizhiYuyueEntity() {

	}

	public GuizhiYuyueEntity(T t) {
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
    @ColumnInfo(comment="主键",type="int(11)")
    @TableField(value = "id")

    private Integer id;


    /**
     * 用户
     */
    @ColumnInfo(comment="用户",type="int(11)")
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 柜子
     */
    @ColumnInfo(comment="柜子",type="int(11)")
    @TableField(value = "guizhi_id")

    private Integer guizhiId;


    /**
     * 物品大小
     */
    @ColumnInfo(comment="物品大小",type="int(11)")
    @TableField(value = "guizhi_yuyue_types")

    private Integer guizhiYuyueTypes;


    /**
     * 备注
     */
    @ColumnInfo(comment="备注",type="text")
    @TableField(value = "guizhi_yuyue_content")

    private String guizhiYuyueContent;


    /**
     * 存放时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="存放时间",type="timestamp")
    @TableField(value = "guizhi_yuyue_time")

    private Date guizhiYuyueTime;


    /**
     * 取出时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="取出时间",type="timestamp")
    @TableField(value = "quchu_time")

    private Date quchuTime;


    /**
     * 存放状态
     */
    @ColumnInfo(comment="存放状态",type="int(11)")
    @TableField(value = "zhuangtai_types")

    private Integer zhuangtaiTypes;


    /**
     * 录入时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="录入时间",type="timestamp")
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 创建时间  listShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="创建时间",type="timestamp")
    @TableField(value = "create_time",fill = FieldFill.INSERT)

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
	 * 获取：柜子
	 */
    public Integer getGuizhiId() {
        return guizhiId;
    }
    /**
	 * 设置：柜子
	 */

    public void setGuizhiId(Integer guizhiId) {
        this.guizhiId = guizhiId;
    }
    /**
	 * 获取：物品大小
	 */
    public Integer getGuizhiYuyueTypes() {
        return guizhiYuyueTypes;
    }
    /**
	 * 设置：物品大小
	 */

    public void setGuizhiYuyueTypes(Integer guizhiYuyueTypes) {
        this.guizhiYuyueTypes = guizhiYuyueTypes;
    }
    /**
	 * 获取：备注
	 */
    public String getGuizhiYuyueContent() {
        return guizhiYuyueContent;
    }
    /**
	 * 设置：备注
	 */

    public void setGuizhiYuyueContent(String guizhiYuyueContent) {
        this.guizhiYuyueContent = guizhiYuyueContent;
    }
    /**
	 * 获取：存放时间
	 */
    public Date getGuizhiYuyueTime() {
        return guizhiYuyueTime;
    }
    /**
	 * 设置：存放时间
	 */

    public void setGuizhiYuyueTime(Date guizhiYuyueTime) {
        this.guizhiYuyueTime = guizhiYuyueTime;
    }
    /**
	 * 获取：取出时间
	 */
    public Date getQuchuTime() {
        return quchuTime;
    }
    /**
	 * 设置：取出时间
	 */

    public void setQuchuTime(Date quchuTime) {
        this.quchuTime = quchuTime;
    }
    /**
	 * 获取：存放状态
	 */
    public Integer getZhuangtaiTypes() {
        return zhuangtaiTypes;
    }
    /**
	 * 设置：存放状态
	 */

    public void setZhuangtaiTypes(Integer zhuangtaiTypes) {
        this.zhuangtaiTypes = zhuangtaiTypes;
    }
    /**
	 * 获取：录入时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }
    /**
	 * 设置：录入时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：创建时间  listShow
	 */
    public Date getCreateTime() {
        return createTime;
    }
    /**
	 * 设置：创建时间  listShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "GuizhiYuyue{" +
            ", id=" + id +
            ", yonghuId=" + yonghuId +
            ", guizhiId=" + guizhiId +
            ", guizhiYuyueTypes=" + guizhiYuyueTypes +
            ", guizhiYuyueContent=" + guizhiYuyueContent +
            ", guizhiYuyueTime=" + DateUtil.convertString(guizhiYuyueTime,"yyyy-MM-dd") +
            ", quchuTime=" + DateUtil.convertString(quchuTime,"yyyy-MM-dd") +
            ", zhuangtaiTypes=" + zhuangtaiTypes +
            ", insertTime=" + DateUtil.convertString(insertTime,"yyyy-MM-dd") +
            ", createTime=" + DateUtil.convertString(createTime,"yyyy-MM-dd") +
        "}";
    }
}
