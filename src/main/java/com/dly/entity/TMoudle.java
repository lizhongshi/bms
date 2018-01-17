package com.dly.entity;

public class TMoudle
{
  private Integer id;
  private String title;
  private Integer imageId;
  private String dsfUrl;

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

  public Integer getImageId() {
    return this.imageId;
  }

  public void setImageId(Integer imageId) {
    this.imageId = imageId;
  }

  public String getDsfUrl() {
    return this.dsfUrl;
  }

  public void setDsfUrl(String dsfUrl) {
    this.dsfUrl = (dsfUrl == null ? null : dsfUrl.trim());
  }

  public String toString()
  {
    return "TMoudle [id=" + this.id + ", title=" + this.title + ", imageId=" + this.imageId + ", dsfUrl=" + this.dsfUrl + "]";
  }
}