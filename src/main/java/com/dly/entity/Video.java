package com.dly.entity;

public class Video
{
  private Integer id;
  private String path;

  public Integer getId()
  {
    return this.id;
  }
  public void setId(Integer id) {
    this.id = id;
  }
  public String getPath() {
    return this.path;
  }
  public void setPath(String path) {
    this.path = path;
  }

  public String toString() {
    return "Video [id=" + this.id + ", path=" + this.path + "]";
  }
}