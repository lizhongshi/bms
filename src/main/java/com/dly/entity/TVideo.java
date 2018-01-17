package com.dly.entity;

import java.util.Date;

public class TVideo
{
  private Integer id;
  private String url;
  private String title;
  private Date creatDate;

  public Integer getId()
  {
    return this.id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getUrl() {
    return this.url;
  }

  public void setUrl(String url) {
    this.url = (url == null ? null : url.trim());
  }

  public String getTitle() {
    return this.title;
  }

  public void setTitle(String title) {
    this.title = (title == null ? null : title.trim());
  }

  public Date getCreatDate() {
    return this.creatDate;
  }

  public void setCreatDate(Date creatDate) {
    this.creatDate = creatDate;
  }
}