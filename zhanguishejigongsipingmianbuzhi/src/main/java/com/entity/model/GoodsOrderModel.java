package com.entity.model;

import com.entity.GoodsOrderEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 商品订单
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class GoodsOrderModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 订单号
     */
    private String goodsOrderUuidNumber;


    /**
     * 收货地址
     */
    private Integer addressId;


    /**
     * 商品
     */
    private Integer goodsId;


    /**
     * 用户
     */
    private Integer yonghuId;


    /**
     * 购买数量
     */
    private Integer buyNumber;


    /**
     * 实付价格
     */
    private Double goodsOrderTruePrice;


    /**
     * 展柜需求图片
     */
    private String goodsXuqiuPhoto;


    /**
     * 展柜需求详情
     */
    private String goodsXuqiuText;


    /**
     * 商家设计图
     */
    private String goodsShejituPhoto;


    /**
     * 订单类型
     */
    private Integer goodsOrderTypes;


    /**
     * 支付类型
     */
    private Integer goodsOrderPaymentTypes;


    /**
     * 订单创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 创建时间 show3
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
	 * 获取：订单号
	 */
    public String getGoodsOrderUuidNumber() {
        return goodsOrderUuidNumber;
    }


    /**
	 * 设置：订单号
	 */
    public void setGoodsOrderUuidNumber(String goodsOrderUuidNumber) {
        this.goodsOrderUuidNumber = goodsOrderUuidNumber;
    }
    /**
	 * 获取：收货地址
	 */
    public Integer getAddressId() {
        return addressId;
    }


    /**
	 * 设置：收货地址
	 */
    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }
    /**
	 * 获取：商品
	 */
    public Integer getGoodsId() {
        return goodsId;
    }


    /**
	 * 设置：商品
	 */
    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
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
	 * 获取：购买数量
	 */
    public Integer getBuyNumber() {
        return buyNumber;
    }


    /**
	 * 设置：购买数量
	 */
    public void setBuyNumber(Integer buyNumber) {
        this.buyNumber = buyNumber;
    }
    /**
	 * 获取：实付价格
	 */
    public Double getGoodsOrderTruePrice() {
        return goodsOrderTruePrice;
    }


    /**
	 * 设置：实付价格
	 */
    public void setGoodsOrderTruePrice(Double goodsOrderTruePrice) {
        this.goodsOrderTruePrice = goodsOrderTruePrice;
    }
    /**
	 * 获取：展柜需求图片
	 */
    public String getGoodsXuqiuPhoto() {
        return goodsXuqiuPhoto;
    }


    /**
	 * 设置：展柜需求图片
	 */
    public void setGoodsXuqiuPhoto(String goodsXuqiuPhoto) {
        this.goodsXuqiuPhoto = goodsXuqiuPhoto;
    }
    /**
	 * 获取：展柜需求详情
	 */
    public String getGoodsXuqiuText() {
        return goodsXuqiuText;
    }


    /**
	 * 设置：展柜需求详情
	 */
    public void setGoodsXuqiuText(String goodsXuqiuText) {
        this.goodsXuqiuText = goodsXuqiuText;
    }
    /**
	 * 获取：商家设计图
	 */
    public String getGoodsShejituPhoto() {
        return goodsShejituPhoto;
    }


    /**
	 * 设置：商家设计图
	 */
    public void setGoodsShejituPhoto(String goodsShejituPhoto) {
        this.goodsShejituPhoto = goodsShejituPhoto;
    }
    /**
	 * 获取：订单类型
	 */
    public Integer getGoodsOrderTypes() {
        return goodsOrderTypes;
    }


    /**
	 * 设置：订单类型
	 */
    public void setGoodsOrderTypes(Integer goodsOrderTypes) {
        this.goodsOrderTypes = goodsOrderTypes;
    }
    /**
	 * 获取：支付类型
	 */
    public Integer getGoodsOrderPaymentTypes() {
        return goodsOrderPaymentTypes;
    }


    /**
	 * 设置：支付类型
	 */
    public void setGoodsOrderPaymentTypes(Integer goodsOrderPaymentTypes) {
        this.goodsOrderPaymentTypes = goodsOrderPaymentTypes;
    }
    /**
	 * 获取：订单创建时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：订单创建时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：创建时间 show3
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show3
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
