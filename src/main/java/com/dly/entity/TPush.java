package com.dly.entity;

import java.util.Date;

public class TPush
{
  private Integer id;
  private String body;
  private Date date;
  private String dateval;
  private String title;

  public TPush()
  {
  }

  public TPush(String title, String body)
  {
    this.body = body;

    this.title = title;
  }

  public String getDateval() {
    return this.dateval;
  }

  public void setDateval(String dateval) {
    this.dateval = dateval;
  }

  public Integer getId() {
    return this.id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getBody() {
    return this.body;
  }

  public void setBody(String body) {
    this.body = (body == null ? null : body.trim());
  }

  public Date getDate() {
    return this.date;
  }

  public void setDate(Date date) {
    this.date = date;
  }

  public String getTitle() {
    return this.title;
  }

  public void setTitle(String title) {
    this.title = (title == null ? null : title.trim());
  }

  public String toString()
  {
    return "TPush [id=" + this.id + ", body=" + this.body + ", date=" + this.date + ", title=" + this.title + "]";
  }
}