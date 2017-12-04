package com.atu.api.domain.wx;

import java.io.Serializable;


public class WXUserInfo implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/** 用户是否订阅该公众号标识，值为0时，代表此用户没有关注该公众号，拉取不到其余信息 */
	private Integer subscribe;
	
	/** 用户的标识，对当前公众号唯一 */
	private String openid;
	
	/** 用户的昵称 */
	private String nickname;
	
	/** 用户的性别，值为1时是男性，值为2时是女性，值为0时是未知 */
	private Integer sex;
	
	/** 用户的语言，简体中文为zh_CN */
	private String language;
	
	/** 用户所在城市 */
	private String city;
	
	/** 用户所在省份 */
	private String province;
	
	/** 用户所在国家 */
	private String country;
	
	/** 用户头像，最后一个数值代表正方形头像大小（有0、46、64、96、132数值可选，0代表640*640正方形头像），用户没有头像时该项为空 */
	private String headimgurl;
	
	/** 用户关注时间，为时间戳 */
	private long subscribe_time;

	public Integer getSubscribe() {
		return subscribe;
	}

	public void setSubscribe(Integer subscribe) {
		this.subscribe = subscribe;
	}

	public String getOpenid() {
		return openid;
	}

	public void setOpenid(String openid) {
		this.openid = openid;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public Integer getSex() {
		return sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getHeadimgurl() {
		return headimgurl;
	}

	public void setHeadimgurl(String headimgurl) {
		this.headimgurl = headimgurl;
	}

	public long getSubscribe_time() {
		return subscribe_time;
	}

	public void setSubscribe_time(long subscribe_time) {
		this.subscribe_time = subscribe_time;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		if(subscribe == null){
			sb.append("subscribe=");
		}else{
			sb.append("subscribe="+subscribe);
		}
		if("".equals(openid) || openid == null){
			sb.append("&openid=");
		}else{
			sb.append("&openid="+openid);
		}
		if("".equals(nickname) || nickname == null){
			sb.append("&nickname=");
		}else{
			sb.append("&nickname="+nickname);
		}
		if(sex == null){
			sb.append("&sex=");
		}else{
			sb.append("&sex="+sex);
		}
		if("".equals(language) || language == null){
			sb.append("&language=");
		}else{
			sb.append("&language="+language);
		}
		if("".equals(city) || city == null){
			sb.append("&city=");
		}else{
			sb.append("&city="+city);
		}
		if("".equals(province) || province == null){
			sb.append("&province=");
		}else{
			sb.append("&province="+province);
		}
		if("".equals(country) || country == null){
			sb.append("&country=");
		}else{
			sb.append("&country="+country);
		}
		if("".equals(headimgurl) || headimgurl == null){
			sb.append("&headimgurl=");
		}else{
			sb.append("&headimgurl="+headimgurl);
		}
		sb.append("&subscribe_time="+subscribe_time);
		return sb.toString();
	}
}
