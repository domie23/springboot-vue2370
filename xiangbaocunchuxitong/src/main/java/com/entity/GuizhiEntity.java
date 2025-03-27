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
 * 柜子信息
 *
 * @author 
 * @email
 */
@TableName("guizhi")
public class GuizhiEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public GuizhiEntity() {

	}

	public GuizhiEntity(T t) {
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
     * 柜子编号
     */
    @ColumnInfo(comment="柜子编号",type="varchar(200)")
    @TableField(value = "guizhi_uuid_number")

    private String guizhiUuidNumber;


    /**
     * 柜子名称
     */
    @ColumnInfo(comment="柜子名称",type="varchar(200)")
    @TableField(value = "guizhi_name")

    private String guizhiName;


    /**
     * 柜子图片
     */
    @ColumnInfo(comment="柜子图片",type="varchar(200)")
    @TableField(value = "guizhi_photo")

    private String guizhiPhoto;


    /**
     * 柜子类型
     */
    @ColumnInfo(comment="柜子类型",type="int(11)")
    @TableField(value = "guizhi_types")

    private Integer guizhiTypes;


    /**
     * 柜子地址
     */
    @ColumnInfo(comment="柜子地址",type="varchar(200)")
    @TableField(value = "guizhi_address")

    private String guizhiAddress;


    /**
     * 价格
     */
    @ColumnInfo(comment="价格",type="decimal(10,2)")
    @TableField(value = "guizhi_new_money")

    private Double guizhiNewMoney;


    /**
     * 柜子状态
     */
    @ColumnInfo(comment="柜子状态",type="int(11)")
    @TableField(value = "status_types")

    private Integer statusTypes;


    /**
     * 柜子详情
     */
    @ColumnInfo(comment="柜子详情",type="text")
    @TableField(value = "guizhi_content")

    private String guizhiContent;


    /**
     * 逻辑删除
     */
    @ColumnInfo(comment="逻辑删除",type="int(11)")
    @TableField(value = "guizhi_delete")

    private Integer guizhiDelete;


    /**
     * 录入时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="录入时间",type="timestamp")
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 创建时间
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
	 * 获取：柜子编号
	 */
    public String getGuizhiUuidNumber() {
        return guizhiUuidNumber;
    }
    /**
	 * 设置：柜子编号
	 */

    public void setGuizhiUuidNumber(String guizhiUuidNumber) {
        this.guizhiUuidNumber = guizhiUuidNumber;
    }
    /**
	 * 获取：柜子名称
	 */
    public String getGuizhiName() {
        return guizhiName;
    }
    /**
	 * 设置：柜子名称
	 */

    public void setGuizhiName(String guizhiName) {
        this.guizhiName = guizhiName;
    }
    /**
	 * 获取：柜子图片
	 */
    public String getGuizhiPhoto() {
        return guizhiPhoto;
    }
    /**
	 * 设置：柜子图片
	 */

    public void setGuizhiPhoto(String guizhiPhoto) {
        this.guizhiPhoto = guizhiPhoto;
    }
    /**
	 * 获取：柜子类型
	 */
    public Integer getGuizhiTypes() {
        return guizhiTypes;
    }
    /**
	 * 设置：柜子类型
	 */

    public void setGuizhiTypes(Integer guizhiTypes) {
        this.guizhiTypes = guizhiTypes;
    }
    /**
	 * 获取：柜子地址
	 */
    public String getGuizhiAddress() {
        return guizhiAddress;
    }
    /**
	 * 设置：柜子地址
	 */

    public void setGuizhiAddress(String guizhiAddress) {
        this.guizhiAddress = guizhiAddress;
    }
    /**
	 * 获取：价格
	 */
    public Double getGuizhiNewMoney() {
        return guizhiNewMoney;
    }
    /**
	 * 设置：价格
	 */

    public void setGuizhiNewMoney(Double guizhiNewMoney) {
        this.guizhiNewMoney = guizhiNewMoney;
    }
    /**
	 * 获取：柜子状态
	 */
    public Integer getStatusTypes() {
        return statusTypes;
    }
    /**
	 * 设置：柜子状态
	 */

    public void setStatusTypes(Integer statusTypes) {
        this.statusTypes = statusTypes;
    }
    /**
	 * 获取：柜子详情
	 */
    public String getGuizhiContent() {
        return guizhiContent;
    }
    /**
	 * 设置：柜子详情
	 */

    public void setGuizhiContent(String guizhiContent) {
        this.guizhiContent = guizhiContent;
    }
    /**
	 * 获取：逻辑删除
	 */
    public Integer getGuizhiDelete() {
        return guizhiDelete;
    }
    /**
	 * 设置：逻辑删除
	 */

    public void setGuizhiDelete(Integer guizhiDelete) {
        this.guizhiDelete = guizhiDelete;
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
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }
    /**
	 * 设置：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Guizhi{" +
            ", id=" + id +
            ", guizhiUuidNumber=" + guizhiUuidNumber +
            ", guizhiName=" + guizhiName +
            ", guizhiPhoto=" + guizhiPhoto +
            ", guizhiTypes=" + guizhiTypes +
            ", guizhiAddress=" + guizhiAddress +
            ", guizhiNewMoney=" + guizhiNewMoney +
            ", statusTypes=" + statusTypes +
            ", guizhiContent=" + guizhiContent +
            ", guizhiDelete=" + guizhiDelete +
            ", insertTime=" + DateUtil.convertString(insertTime,"yyyy-MM-dd") +
            ", createTime=" + DateUtil.convertString(createTime,"yyyy-MM-dd") +
        "}";
    }
}
