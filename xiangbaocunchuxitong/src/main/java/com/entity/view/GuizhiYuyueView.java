package com.entity.view;

import org.apache.tools.ant.util.DateUtils;
import com.annotation.ColumnInfo;
import com.entity.GuizhiYuyueEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;
import com.utils.DateUtil;

/**
* 物品存储
* 后端返回视图实体辅助类
* （通常后端关联的表或者自定义的字段需要返回使用）
*/
@TableName("guizhi_yuyue")
public class GuizhiYuyueView extends GuizhiYuyueEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	//当前表
	/**
	* 物品大小的值
	*/
	@ColumnInfo(comment="物品大小的字典表值",type="varchar(200)")
	private String guizhiYuyueValue;
	/**
	* 存放状态的值
	*/
	@ColumnInfo(comment="存放状态的字典表值",type="varchar(200)")
	private String zhuangtaiValue;

	//级联表 柜子信息
		/**
		* 柜子编号
		*/

		@ColumnInfo(comment="柜子编号",type="varchar(200)")
		private String guizhiUuidNumber;
		/**
		* 柜子名称
		*/

		@ColumnInfo(comment="柜子名称",type="varchar(200)")
		private String guizhiName;
		/**
		* 柜子图片
		*/

		@ColumnInfo(comment="柜子图片",type="varchar(200)")
		private String guizhiPhoto;
		/**
		* 柜子类型
		*/
		@ColumnInfo(comment="柜子类型",type="int(11)")
		private Integer guizhiTypes;
			/**
			* 柜子类型的值
			*/
			@ColumnInfo(comment="柜子类型的字典表值",type="varchar(200)")
			private String guizhiValue;
		/**
		* 柜子地址
		*/

		@ColumnInfo(comment="柜子地址",type="varchar(200)")
		private String guizhiAddress;
		/**
		* 价格
		*/
		@ColumnInfo(comment="价格",type="decimal(10,2)")
		private Double guizhiNewMoney;
		/**
		* 柜子状态
		*/
		@ColumnInfo(comment="柜子状态",type="int(11)")
		private Integer statusTypes;
			/**
			* 柜子状态的值
			*/
			@ColumnInfo(comment="柜子状态的字典表值",type="varchar(200)")
			private String statusValue;
		/**
		* 柜子详情
		*/

		@ColumnInfo(comment="柜子详情",type="text")
		private String guizhiContent;
		/**
		* 逻辑删除
		*/

		@ColumnInfo(comment="逻辑删除",type="int(11)")
		private Integer guizhiDelete;
	//级联表 用户
		/**
		* 用户姓名
		*/

		@ColumnInfo(comment="用户姓名",type="varchar(200)")
		private String yonghuName;
		/**
		* 头像
		*/

		@ColumnInfo(comment="头像",type="varchar(255)")
		private String yonghuPhoto;
		/**
		* 用户手机号
		*/

		@ColumnInfo(comment="用户手机号",type="varchar(200)")
		private String yonghuPhone;
		/**
		* 用户身份证号
		*/

		@ColumnInfo(comment="用户身份证号",type="varchar(200)")
		private String yonghuIdNumber;
		/**
		* 邮箱
		*/

		@ColumnInfo(comment="邮箱",type="varchar(200)")
		private String yonghuEmail;
		/**
		* 假删
		*/

		@ColumnInfo(comment="假删",type="int(11)")
		private Integer yonghuDelete;



	public GuizhiYuyueView() {

	}

	public GuizhiYuyueView(GuizhiYuyueEntity guizhiYuyueEntity) {
		try {
			BeanUtils.copyProperties(this, guizhiYuyueEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



	//当前表的
	/**
	* 获取： 物品大小的值
	*/
	public String getGuizhiYuyueValue() {
		return guizhiYuyueValue;
	}
	/**
	* 设置： 物品大小的值
	*/
	public void setGuizhiYuyueValue(String guizhiYuyueValue) {
		this.guizhiYuyueValue = guizhiYuyueValue;
	}
	//当前表的
	/**
	* 获取： 存放状态的值
	*/
	public String getZhuangtaiValue() {
		return zhuangtaiValue;
	}
	/**
	* 设置： 存放状态的值
	*/
	public void setZhuangtaiValue(String zhuangtaiValue) {
		this.zhuangtaiValue = zhuangtaiValue;
	}


	//级联表的get和set 柜子信息

		/**
		* 获取： 柜子编号
		*/
		public String getGuizhiUuidNumber() {
			return guizhiUuidNumber;
		}
		/**
		* 设置： 柜子编号
		*/
		public void setGuizhiUuidNumber(String guizhiUuidNumber) {
			this.guizhiUuidNumber = guizhiUuidNumber;
		}

		/**
		* 获取： 柜子名称
		*/
		public String getGuizhiName() {
			return guizhiName;
		}
		/**
		* 设置： 柜子名称
		*/
		public void setGuizhiName(String guizhiName) {
			this.guizhiName = guizhiName;
		}

		/**
		* 获取： 柜子图片
		*/
		public String getGuizhiPhoto() {
			return guizhiPhoto;
		}
		/**
		* 设置： 柜子图片
		*/
		public void setGuizhiPhoto(String guizhiPhoto) {
			this.guizhiPhoto = guizhiPhoto;
		}
		/**
		* 获取： 柜子类型
		*/
		public Integer getGuizhiTypes() {
			return guizhiTypes;
		}
		/**
		* 设置： 柜子类型
		*/
		public void setGuizhiTypes(Integer guizhiTypes) {
			this.guizhiTypes = guizhiTypes;
		}


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

		/**
		* 获取： 柜子地址
		*/
		public String getGuizhiAddress() {
			return guizhiAddress;
		}
		/**
		* 设置： 柜子地址
		*/
		public void setGuizhiAddress(String guizhiAddress) {
			this.guizhiAddress = guizhiAddress;
		}

		/**
		* 获取： 价格
		*/
		public Double getGuizhiNewMoney() {
			return guizhiNewMoney;
		}
		/**
		* 设置： 价格
		*/
		public void setGuizhiNewMoney(Double guizhiNewMoney) {
			this.guizhiNewMoney = guizhiNewMoney;
		}
		/**
		* 获取： 柜子状态
		*/
		public Integer getStatusTypes() {
			return statusTypes;
		}
		/**
		* 设置： 柜子状态
		*/
		public void setStatusTypes(Integer statusTypes) {
			this.statusTypes = statusTypes;
		}


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

		/**
		* 获取： 柜子详情
		*/
		public String getGuizhiContent() {
			return guizhiContent;
		}
		/**
		* 设置： 柜子详情
		*/
		public void setGuizhiContent(String guizhiContent) {
			this.guizhiContent = guizhiContent;
		}

		/**
		* 获取： 逻辑删除
		*/
		public Integer getGuizhiDelete() {
			return guizhiDelete;
		}
		/**
		* 设置： 逻辑删除
		*/
		public void setGuizhiDelete(Integer guizhiDelete) {
			this.guizhiDelete = guizhiDelete;
		}
	//级联表的get和set 用户

		/**
		* 获取： 用户姓名
		*/
		public String getYonghuName() {
			return yonghuName;
		}
		/**
		* 设置： 用户姓名
		*/
		public void setYonghuName(String yonghuName) {
			this.yonghuName = yonghuName;
		}

		/**
		* 获取： 头像
		*/
		public String getYonghuPhoto() {
			return yonghuPhoto;
		}
		/**
		* 设置： 头像
		*/
		public void setYonghuPhoto(String yonghuPhoto) {
			this.yonghuPhoto = yonghuPhoto;
		}

		/**
		* 获取： 用户手机号
		*/
		public String getYonghuPhone() {
			return yonghuPhone;
		}
		/**
		* 设置： 用户手机号
		*/
		public void setYonghuPhone(String yonghuPhone) {
			this.yonghuPhone = yonghuPhone;
		}

		/**
		* 获取： 用户身份证号
		*/
		public String getYonghuIdNumber() {
			return yonghuIdNumber;
		}
		/**
		* 设置： 用户身份证号
		*/
		public void setYonghuIdNumber(String yonghuIdNumber) {
			this.yonghuIdNumber = yonghuIdNumber;
		}

		/**
		* 获取： 邮箱
		*/
		public String getYonghuEmail() {
			return yonghuEmail;
		}
		/**
		* 设置： 邮箱
		*/
		public void setYonghuEmail(String yonghuEmail) {
			this.yonghuEmail = yonghuEmail;
		}

		/**
		* 获取： 假删
		*/
		public Integer getYonghuDelete() {
			return yonghuDelete;
		}
		/**
		* 设置： 假删
		*/
		public void setYonghuDelete(Integer yonghuDelete) {
			this.yonghuDelete = yonghuDelete;
		}


	@Override
	public String toString() {
		return "GuizhiYuyueView{" +
			", guizhiYuyueValue=" + guizhiYuyueValue +
			", zhuangtaiValue=" + zhuangtaiValue +
			", guizhiUuidNumber=" + guizhiUuidNumber +
			", guizhiName=" + guizhiName +
			", guizhiPhoto=" + guizhiPhoto +
			", guizhiAddress=" + guizhiAddress +
			", guizhiNewMoney=" + guizhiNewMoney +
			", guizhiContent=" + guizhiContent +
			", guizhiDelete=" + guizhiDelete +
			", yonghuName=" + yonghuName +
			", yonghuPhoto=" + yonghuPhoto +
			", yonghuPhone=" + yonghuPhone +
			", yonghuIdNumber=" + yonghuIdNumber +
			", yonghuEmail=" + yonghuEmail +
			", yonghuDelete=" + yonghuDelete +
			"} " + super.toString();
	}
}
