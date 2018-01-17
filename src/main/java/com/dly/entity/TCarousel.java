package com.dly.entity;

public class TCarousel
{
  private Integer id;
  private Integer imageId;
  private Integer ordered;
  private Integer groupId;

  public Integer getId()
  {
    return this.id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Integer getImageId() {
    return this.imageId;
  }

  public void setImageId(Integer imageId) {
    this.imageId = imageId;
  }

  public Integer getOrdered() {
    return this.ordered;
  }

  public void setOrdered(Integer ordered) {
    this.ordered = ordered;
  }

  public Integer getGroupId() {
    return this.groupId;
  }

  public void setGroupId(Integer groupId) {
    this.groupId = groupId;
  }
}