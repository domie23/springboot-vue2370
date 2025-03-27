package com.entity.model;

import com.entity.GuizhiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 柜子信息
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class GuizhiModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 柜子编号
     */
    private String guizhiUuidNumber;


    /**
     * 柜子名称
     */
    private String guizhiName;


    /**
     * 柜子图片
     */
    private String guizhiPhoto;


    /**
     * 柜子类型
     */
    private Integer guizhiTypes;


    /**
     * 柜子地址
     */
    private String guizhiAddress;


    /**
     * 价格
     */
    private Double guizhiNewMoney;


    /**
     * 柜子状态
     */
    private Integer statusTypes;


    /**
     * 柜子详情
     */
    private String guizhiContent;


    /**
     * 逻辑删除
     */
    private Integer guizhiDelete;


    /**
     * 录入时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


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
