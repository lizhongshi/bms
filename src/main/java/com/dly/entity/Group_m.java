package com.dly.entity;

import javax.persistence.Column;

public class Group_m {
	private Integer id;

	private String title;
	private String text;

	private Integer moudleId;

	private Integer imageId;

	private String istp;

	private String videoUrl;

	private String imageUrl;

	private Integer countyId;

	private Integer levelId;
	private Level level;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public Integer getLevelId() {
		return levelId;
	}

	public void setLevelId(Integer levelId) {
		this.levelId = levelId;
	}

	public Level getLevel() {
		return level;
	}

	public void setLevel(Level level) {
		this.level = level;
	}

	@Override
	public String toString() {
		return "Group_m [id=" + id + ", title=" + title + ", text=" + text + ", moudleId=" + moudleId + ", imageId="
				+ imageId + ", istp=" + istp + ", videoUrl=" + videoUrl + ", imageUrl=" + imageUrl + ", countyId="
				+ countyId + ", levelId=" + levelId + ", level=" + level + "]";
	}

	
}
