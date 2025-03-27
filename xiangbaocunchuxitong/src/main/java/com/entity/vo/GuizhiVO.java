package com.entity.vo;

import com.entity.GuizhiEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 柜子信息
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("guizhi")
public class GuizhiVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 柜子编号
     */

    @TableField(value = "guizhi_uuid_number")
    private String guizhiUuidNumber;


    /**
     * 柜子名称
     */

    @TableField(value = "guizhi_name")
    private String guizhiName;


    /**
     * 柜子图片
     */

    @TableField(value = "guizhi_photo")
    private String guizhiPhoto;


    /**
     * 柜子类型
     */

    @TableField(value = "guizhi_types")
    private Integer guizhiTypes;


    /**
     * 柜子地址
     */

    @TableField(value = "guizhi_address")
    private String guizhiAddress;


    /**
     * 价格
     */

    @TableField(value = "guizhi_new_money")
    private Double guizhiNewMoney;


    /**
     * 柜子状态
     */

    @TableField(value = "status_types")
    private Integer statusTypes;


    /**
     * 柜子详情
     */

    @TableField(value = "guizhi_content")
    private String guizhiContent;


    /**
     * 逻辑删除
     */

    @TableField(value = "guizhi_delete")
    private Integer guizhiDelete;


    /**
     * 录入时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


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
	 * 设置：柜子编号
	 */
    public String getGuizhiUuidNumber() {
        return guizhiUuidNumber;
    }


    /**
	 * 获取：柜子编号
	 */

    public void setGuizhiUuidNumber(String guizhiUuidNumber) {
        this.guizhiUuidNumber = guizhiUuidNumber;
    }
    /**
	 * 设置：柜子名称
	 */
    public String getGuizhiName() {
        return guizhiName;
    }


    /**
	 * 获取：柜子名称
	 */

    public void setGuizhiName(String guizhiName) {
        this.guizhiName = guizhiName;
    }
    /**
	 * 设置：柜子图片
	 */
    public String getGuizhiPhoto() {
        return guizhiPhoto;
    }


    /**
	 * 获取：柜子图片
	 */

    public void setGuizhiPhoto(String guizhiPhoto) {
        this.guizhiPhoto = guizhiPhoto;
    }
    /**
	 * 设置：柜子类型
	 */
    public Integer getGuizhiTypes() {
        return guizhiTypes;
    }


    /**
	 * 获取：柜子类型
	 */

    public void setGuizhiTypes(Integer guizhiTypes) {
        this.guizhiTypes = guizhiTypes;
    }
    /**
	 * 设置：柜子地址
	 */
    public String getGuizhiAddress() {
        return guizhiAddress;
    }


    /**
	 * 获取：柜子地址
	 */

    public void setGuizhiAddress(String guizhiAddress) {
        this.guizhiAddress = guizhiAddress;
    }
    /**
	 * 设置：价格
	 */
    public Double getGuizhiNewMoney() {
        return guizhiNewMoney;
    }


    /**
	 * 获取：价格
	 */

    public void setGuizhiNewMoney(Double guizhiNewMoney) {
        this.guizhiNewMoney = guizhiNewMoney;
    }
    /**
	 * 设置：柜子状态
	 */
    public Integer getStatusTypes() {
        return statusTypes;
    }


    /**
	 * 获取：柜子状态
	 */

    public void setStatusTypes(Integer statusTypes) {
        this.statusTypes = statusTypes;
    }
    /**
	 * 设置：柜子详情
	 */
    public String getGuizhiContent() {
        return guizhiContent;
    }


    /**
	 * 获取：柜子详情
	 */

    public void setGuizhiContent(String guizhiContent) {
        this.guizhiContent = guizhiContent;
    }
    /**
	 * 设置：逻辑删除
	 */
    public Integer getGuizhiDelete() {
        return guizhiDelete;
    }


    /**
	 * 获取：逻辑删除
	 */

    public void setGuizhiDelete(Integer guizhiDelete) {
        this.guizhiDelete = guizhiDelete;
    }
    /**
	 * 设置：录入时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：录入时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
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
