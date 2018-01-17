package com.dly.entity;

import java.util.Date;

public class TImage
{
  private Integer id;
  private String imageUrl;
  private String imageName;
  private String width;
  private String height;
  private String type;
  private String group;
  private String title;
  private Integer groupId;
  private Date creatDate;

  public Integer getId()
  {
    return this.id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getImageUrl() {
    return this.imageUrl;
  }

  public void setImageUrl(String imageUrl) {
    this.imageUrl = (imageUrl == null ? null : imageUrl.trim());
  }

  public String getImageName() {
    return this.imageName;
  }

  public void setImageName(String imageName) {
    this.imageName = (imageName == null ? null : imageName.trim());
  }

  public String getWidth() {
    return this.width;
  }

  public void setWidth(String width) {
    this.width = (width == null ? null : width.trim());
  }

  public String getHeight() {
    return this.height;
  }

  public void setHeight(String height) {
    this.height = (height == null ? null : height.trim());
  }

  public String getType() {
    return this.type;
  }

  public void setType(String type) {
    this.type = (type == null ? null : type.trim());
  }

  public String getGroup() {
    return this.group;
  }

  public void setGroup(String group) {
    this.group = (group == null ? null : group.trim());
  }

  public String getTitle() {
    return this.title;
  }

  public void setTitle(String title) {
    this.title = (title == null ? null : title.trim());
  }

  public Integer getGroupId() {
    return this.groupId;
  }

  public void setGroupId(Integer groupId) {
    this.groupId = groupId;
  }

  public Date getCreatDate() {
    return this.creatDate;
  }

  public void setCreatDate(Date creatDate) {
    this.creatDate = creatDate;
  }
}