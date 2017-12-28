package com.dly.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="t_group")
public class Group {
	@Id
	@GeneratedValue
	private Integer id;
	@Column
	private String title;
	@Column 
	private String text;
	@Column
	private Integer moudleId;
	@Column
	private Integer imageId;
	@Column
	private String istp;
	@Column
	private String videoUrl;
	@Column
	private String imageUrl;
	@Column
	private Integer countyId;
	@Column
	private Integer levelId;
//	@ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "levelId", insertable = false, updatable = false)
//    @JsonIgnore
//    @NotFound(action = NotFoundAction.IGNORE)
//	private Level levels; 

	 

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getLevelId() {
		return levelId;
	}
	public void setLevelId(Integer levelId) {
		this.levelId = levelId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	
	

	public Integer getMoudleId() {
		return moudleId;
	}
	public void setMoudleId(Integer moudleId) {
		this.moudleId = moudleId;
	}
	public Integer getImageId() {
		return imageId;
	}
	public void setImageId(Integer imageId) {
		this.imageId = imageId;
	}
	public String getIstp() {
		return istp;
	}
	public void setIstp(String istp) {
		this.istp = istp;
	}
	public String getVideoUrl() {
		return videoUrl;
	}
	public void setVideoUrl(String videoUrl) {
		this.videoUrl = videoUrl;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public Integer getCountyId() {
		return countyId;
	}
	public void setCountyId(Integer countyId) {
		this.countyId = countyId;
	}
	@Override
	public String toString() {
		return "Group [id=" + id + ", title=" + title + ", text=" + text + ", moudleId=" + moudleId + ", imageId="
				+ imageId + ", istp=" + istp + ", videoUrl=" + videoUrl + ", imageUrl=" + imageUrl + ", countyId="
				+ countyId + ", levelId=" + levelId + "]";
	}
	


	

	
	

}
