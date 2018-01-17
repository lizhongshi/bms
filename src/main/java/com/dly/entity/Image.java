package com.dly.entity;

public class Image
{
  private String id;
  private String imageUrl;
  private String title;
  private String groupId;
  private String imageName;
  private String width;
  private String height;
  private String type;
  private String group;

  public String getGroupId()
  {
    return this.groupId;
  }
  public void setGroupId(String groupId) {
    this.groupId = groupId;
  }
  public String getTitle() {
    return this.title;
  }
  public void setTitle(String title) {
    this.title = title;
  }
  public String getGroup() {
    return this.group;
  }
  public void setGroup(String group) {
    this.group = group;
  }
  public String getType() {
    return this.type;
  }
  public void setType(String type) {
    this.type = type;
  }
  public String getId() {
    return this.id;
  }
  public void setId(String id) {
    this.id = id;
  }

  public String getWidth() {
    return this.width;
  }
  public void setWidth(String width) {
    this.width = width;
  }
  public String getHeight() {
    return this.height;
  }
  public void setHeight(String height) {
    this.height = height;
  }
  public String getImageUrl() {
    return this.imageUrl;
  }
  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }

  public String getImageName() {
    return this.imageName;
  }
  public void setImageName(String imageName) {
    this.imageName = imageName;
  }
}