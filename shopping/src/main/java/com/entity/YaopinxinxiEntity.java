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
 * 药品信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2024-02-27 17:29:35
 */
@TableName("yaopinxinxi")
public class YaopinxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public YaopinxinxiEntity() {
		
	}
	
	public YaopinxinxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
    @TableId(type = IdType.AUTO)
    private Long id;
	/**
	 * 药品名称
	 */
					
	private String yaopinmingcheng;
	
	/**
	 * 药品分类
	 */
					
	private String yaopinfenlei;
	
	/**
	 * 药品图片
	 */
					
	private String yaopintupian;
	
	/**
	 * 药品规格
	 */
					
	private String yaopinguige;
	
	/**
	 * 药品品牌
	 */
					
	private String yaopinpinpai;
	
	/**
	 * 生产日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date shengchanriqi;
	
	/**
	 * 有效时间
	 */
					
	private String youxiaoshijian;
	
	/**
	 * 单限
	 */
					
	private Integer onelimittimes;
	
	/**
	 * 库存
	 */
					
	private Integer alllimittimes;
	
	/**
	 * 药品详情
	 */
					
	private String yaopinxiangqing;
	
	/**
	 * 最近点击时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date clicktime;
	
	/**
	 * 评论数
	 */
					
	private Integer discussnum;
	
	/**
	 * 价格
	 */
					
	private Double price;
	
	/**
	 * 收藏数
	 */
					
	private Integer storeupnum;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：药品名称
	 */
	public void setYaopinmingcheng(String yaopinmingcheng) {
		this.yaopinmingcheng = yaopinmingcheng;
	}
	/**
	 * 获取：药品名称
	 */
	public String getYaopinmingcheng() {
		return yaopinmingcheng;
	}
	/**
	 * 设置：药品分类
	 */
	public void setYaopinfenlei(String yaopinfenlei) {
		this.yaopinfenlei = yaopinfenlei;
	}
	/**
	 * 获取：药品分类
	 */
	public String getYaopinfenlei() {
		return yaopinfenlei;
	}
	/**
	 * 设置：药品图片
	 */
	public void setYaopintupian(String yaopintupian) {
		this.yaopintupian = yaopintupian;
	}
	/**
	 * 获取：药品图片
	 */
	public String getYaopintupian() {
		return yaopintupian;
	}
	/**
	 * 设置：药品规格
	 */
	public void setYaopinguige(String yaopinguige) {
		this.yaopinguige = yaopinguige;
	}
	/**
	 * 获取：药品规格
	 */
	public String getYaopinguige() {
		return yaopinguige;
	}
	/**
	 * 设置：药品品牌
	 */
	public void setYaopinpinpai(String yaopinpinpai) {
		this.yaopinpinpai = yaopinpinpai;
	}
	/**
	 * 获取：药品品牌
	 */
	public String getYaopinpinpai() {
		return yaopinpinpai;
	}
	/**
	 * 设置：生产日期
	 */
	public void setShengchanriqi(Date shengchanriqi) {
		this.shengchanriqi = shengchanriqi;
	}
	/**
	 * 获取：生产日期
	 */
	public Date getShengchanriqi() {
		return shengchanriqi;
	}
	/**
	 * 设置：有效时间
	 */
	public void setYouxiaoshijian(String youxiaoshijian) {
		this.youxiaoshijian = youxiaoshijian;
	}
	/**
	 * 获取：有效时间
	 */
	public String getYouxiaoshijian() {
		return youxiaoshijian;
	}
	/**
	 * 设置：单限
	 */
	public void setOnelimittimes(Integer onelimittimes) {
		this.onelimittimes = onelimittimes;
	}
	/**
	 * 获取：单限
	 */
	public Integer getOnelimittimes() {
		return onelimittimes;
	}
	/**
	 * 设置：库存
	 */
	public void setAlllimittimes(Integer alllimittimes) {
		this.alllimittimes = alllimittimes;
	}
	/**
	 * 获取：库存
	 */
	public Integer getAlllimittimes() {
		return alllimittimes;
	}
	/**
	 * 设置：药品详情
	 */
	public void setYaopinxiangqing(String yaopinxiangqing) {
		this.yaopinxiangqing = yaopinxiangqing;
	}
	/**
	 * 获取：药品详情
	 */
	public String getYaopinxiangqing() {
		return yaopinxiangqing;
	}
	/**
	 * 设置：最近点击时间
	 */
	public void setClicktime(Date clicktime) {
		this.clicktime = clicktime;
	}
	/**
	 * 获取：最近点击时间
	 */
	public Date getClicktime() {
		return clicktime;
	}
	/**
	 * 设置：评论数
	 */
	public void setDiscussnum(Integer discussnum) {
		this.discussnum = discussnum;
	}
	/**
	 * 获取：评论数
	 */
	public Integer getDiscussnum() {
		return discussnum;
	}
	/**
	 * 设置：价格
	 */
	public void setPrice(Double price) {
		this.price = price;
	}
	/**
	 * 获取：价格
	 */
	public Double getPrice() {
		return price;
	}
	/**
	 * 设置：收藏数
	 */
	public void setStoreupnum(Integer storeupnum) {
		this.storeupnum = storeupnum;
	}
	/**
	 * 获取：收藏数
	 */
	public Integer getStoreupnum() {
		return storeupnum;
	}

}
