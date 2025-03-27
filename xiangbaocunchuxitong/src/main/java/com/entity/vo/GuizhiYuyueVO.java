package com.entity.vo;

import com.entity.GuizhiYuyueEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 物品存储
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("guizhi_yuyue")
public class GuizhiYuyueVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 用户
     */

    @TableField(value = "yonghu_id")
    private Integer yonghuId;


    /**
     * 柜子
     */

    @TableField(value = "guizhi_id")
    private Integer guizhiId;


    /**
     * 物品大小
     */

    @TableField(value = "guizhi_yuyue_types")
    private Integer guizhiYuyueTypes;


    /**
     * 备注
     */

    @TableField(value = "guizhi_yuyue_content")
    private String guizhiYuyueContent;


    /**
     * 存放时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "guizhi_yuyue_time")
    private Date guizhiYuyueTime;


    /**
     * 取出时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "quchu_time")
    private Date quchuTime;


    /**
     * 存放状态
     */

    @TableField(value = "zhuangtai_types")
    private Integer zhuangtaiTypes;


    /**
     * 录入时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 创建时间 show3 listShow
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
	 * 设置：柜子
	 */
    public Integer getGuizhiId() {
        return guizhiId;
    }


    /**
	 * 获取：柜子
	 */

    public void setGuizhiId(Integer guizhiId) {
        this.guizhiId = guizhiId;
    }
    /**
	 * 设置：物品大小
	 */
    public Integer getGuizhiYuyueTypes() {
        return guizhiYuyueTypes;
    }


    /**
	 * 获取：物品大小
	 */

    public void setGuizhiYuyueTypes(Integer guizhiYuyueTypes) {
        this.guizhiYuyueTypes = guizhiYuyueTypes;
    }
    /**
	 * 设置：备注
	 */
    public String getGuizhiYuyueContent() {
        return guizhiYuyueContent;
    }


    /**
	 * 获取：备注
	 */

    public void setGuizhiYuyueContent(String guizhiYuyueContent) {
        this.guizhiYuyueContent = guizhiYuyueContent;
    }
    /**
	 * 设置：存放时间
	 */
    public Date getGuizhiYuyueTime() {
        return guizhiYuyueTime;
    }


    /**
	 * 获取：存放时间
	 */

    public void setGuizhiYuyueTime(Date guizhiYuyueTime) {
        this.guizhiYuyueTime = guizhiYuyueTime;
    }
    /**
	 * 设置：取出时间
	 */
    public Date getQuchuTime() {
        return quchuTime;
    }


    /**
	 * 获取：取出时间
	 */

    public void setQuchuTime(Date quchuTime) {
        this.quchuTime = quchuTime;
    }
    /**
	 * 设置：存放状态
	 */
    public Integer getZhuangtaiTypes() {
        return zhuangtaiTypes;
    }


    /**
	 * 获取：存放状态
	 */

    public void setZhuangtaiTypes(Integer zhuangtaiTypes) {
        this.zhuangtaiTypes = zhuangtaiTypes;
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
	 * 设置：创建时间 show3 listShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show3 listShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
