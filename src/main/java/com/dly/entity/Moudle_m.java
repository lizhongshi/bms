package com.dly.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 用户实体
 * @author Administrator
 *
 */

public class Moudle_m {
	private String  id;
	private String  title;
	private String imageId;
	private String dsfUrl;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getImageId() {
		return imageId;
	}
	public void setImageId(String imageId) {
		this.imageId = imageId;
	}
	
	public String getDsfUrl() {
		return dsfUrl;
	}
	public void setDsfUrl(String dsfUrl) {
		this.dsfUrl = dsfUrl;
	}
	@Override
	public String toString() {
		return "Moudle_m [id=" + id + ", title=" + title + ", imageId=" + imageId + ", dsfUrl=" + dsfUrl + "]";
	}
	

	
	

}
