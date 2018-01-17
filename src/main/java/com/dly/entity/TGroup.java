package com.dly.entity;

public class TGroup
{
  private Integer id;
  private String title;
  private String text;
  private Integer moudleId;
  private Integer imageId;
  private String istp;
  private Integer countyId;
  private Integer levelId;
  private Integer videoId;
  private String images;

  public Integer getId()
  {
    return this.id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getTitle() {
    return this.title;
  }

  public void setTitle(String title) {
    this.title = (title == null ? null : title.trim());
  }

  public String getText() {
    return this.text;
  }

  public void setText(String text) {
    this.text = (text == null ? null : text.trim());
  }

  public Integer getMoudleId() {
    return this.moudleId;
  }

  public void setMoudleId(Integer moudleId) {
    this.moudleId = moudleId;
  }

  public Integer getImageId() {
    return this.imageId;
  }

  public void setImageId(Integer imageId) {
    this.imageId = imageId;
  }

  public String getIstp() {
    return this.istp;
  }

  public void setIstp(String istp) {
    this.istp = (istp == null ? null : istp.trim());
  }

  public Integer getCountyId() {
    return this.countyId;
  }

  public void setCountyId(Integer countyId) {
    this.countyId = countyId;
  }

  public Integer getLevelId() {
    return this.levelId;
  }

  public void setLevelId(Integer levelId) {
    this.levelId = levelId;
  }

  public Integer getVideoId() {
    return this.videoId;
  }

  public void setVideoId(Integer videoId) {
    this.videoId = videoId;
  }

  public String getImages() {
    return this.images;
  }

  public void setImages(String images) {
    this.images = images;
  }
}