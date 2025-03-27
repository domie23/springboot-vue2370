package com.entity.view;

import org.apache.tools.ant.util.DateUtils;
import com.annotation.ColumnInfo;
import com.entity.GuizhiEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;
import com.utils.DateUtil;

/**
* 柜子信息
* 后端返回视图实体辅助类
* （通常后端关联的表或者自定义的字段需要返回使用）
*/
@TableName("guizhi")
public class GuizhiView extends GuizhiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	//当前表
	/**
	* 柜子类型的值
	*/
	@ColumnInfo(comment="柜子类型的字典表值",type="varchar(200)")
	private String guizhiValue;
	/**
	* 柜子状态的值
	*/
	@ColumnInfo(comment="柜子状态的字典表值",type="varchar(200)")
	private String statusValue;




	public GuizhiView() {

	}

	public GuizhiView(GuizhiEntity guizhiEntity) {
		try {
			BeanUtils.copyProperties(this, guizhiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



	//当前表的
	/**
	* 获取： 柜子类型的值
	*/
	public String getGuizhiValue() {
		return guizhiValue;
	}
	/**
	* 设置： 柜子类型的值
	*/
	public void setGuizhiValue(String guizhiValue) {
		this.guizhiValue = guizhiValue;
	}
	//当前表的
	/**
	* 获取： 柜子状态的值
	*/
	public String getStatusValue() {
		return statusValue;
	}
	/**
	* 设置： 柜子状态的值
	*/
	public void setStatusValue(String statusValue) {
		this.statusValue = statusValue;
	}




	@Override
	public String toString() {
		return "GuizhiView{" +
			", guizhiValue=" + guizhiValue +
			", statusValue=" + statusValue +
			"} " + super.toString();
	}
}
