package com.atu.api.domain.vo;

import java.math.BigDecimal;

public class FavoritesVO {
	/** 收藏id */
	private Integer favoritesId;
	
	/** 商品图片 */
	private Integer itemId;
	
	/** 商品名称 */
	private String itemName;
	
	/** 商品图片 */
	private String itemImage;
	
	/** 商品图片 */
	private Integer skuId;
	
	/** 属性名称 */
	private String salesPropertyName;
	
	/** 天宝价格 */
	private BigDecimal tbPrice;
	
	/** 促销价格 */
	private BigDecimal promPrice;
	
	/** 商品产地(市级) */
	private Integer originCity;
	private String originCityName;
	
	/** 商品产地(省级) */
	private Integer originProvince;
	private String originProvinceName;

	public Integer getFavoritesId() {
		return favoritesId;
	}

	public void setFavoritesId(Integer favoritesId) {
		this.favoritesId = favoritesId;
	}

	public Integer getItemId() {
		return itemId;
	}

	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getItemImage() {
		return itemImage;
	}

	public void setItemImage(String itemImage) {
		this.itemImage = itemImage;
	}

	public Integer getSkuId() {
		return skuId;
	}

	public void setSkuId(Integer skuId) {
		this.skuId = skuId;
	}

	public String getSalesPropertyName() {
		return salesPropertyName;
	}

	public void setSalesPropertyName(String salesPropertyName) {
		this.salesPropertyName = salesPropertyName;
	}

	public BigDecimal getTbPrice() {
		return tbPrice;
	}

	public void setTbPrice(BigDecimal tbPrice) {
		this.tbPrice = tbPrice;
	}

	public BigDecimal getPromPrice() {
		return promPrice;
	}

	public void setPromPrice(BigDecimal promPrice) {
		this.promPrice = promPrice;
	}

	public Integer getOriginCity() {
		return originCity;
	}

	public void setOriginCity(Integer originCity) {
		this.originCity = originCity;
	}

	public String getOriginCityName() {
		return originCityName;
	}

	public void setOriginCityName(String originCityName) {
		this.originCityName = originCityName;
	}

	public Integer getOriginProvince() {
		return originProvince;
	}

	public void setOriginProvince(Integer originProvince) {
		this.originProvince = originProvince;
	}

	public String getOriginProvinceName() {
		return originProvinceName;
	}

	public void setOriginProvinceName(String originProvinceName) {
		this.originProvinceName = originProvinceName;
	}
}
