package com.dly.entity;

public class Show {
	private String title;
	private Integer imageCount;
	private Integer videoCount;
	private Integer groupCount;
	private Integer sum;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Integer getImageCount() {
		return imageCount;
	}
	public void setImageCount(Integer imageCount) {
		this.imageCount = imageCount;
	}
	public Integer getVideoCount() {
		return videoCount;
	}
	public void setVideoCount(Integer videoCount) {
		this.videoCount = videoCount;
	}
	public Integer getGroupCount() {
		return groupCount;
	}
	public void setGroupCount(Integer groupCount) {
		this.groupCount = groupCount;
	}
	public Integer getSum() {
		return sum;
	}
	public void setSum(Integer sum) {
		this.sum = sum;
	}
	@Override
	public String toString() {
		return "Show [title=" + title + ", imageCount=" + imageCount + ", videoCount=" + videoCount + ", groupCount="
				+ groupCount + ", sum=" + sum + "]";
	}
	
}
