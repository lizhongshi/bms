package com.dly.entity;

public class TCounty
{
  private Integer id;
  private String name;
  private Integer cityId;

  public Integer getId()
  {
    return this.id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = (name == null ? null : name.trim());
  }

  public Integer getCityId() {
    return this.cityId;
  }

  public void setCityId(Integer cityId) {
    this.cityId = cityId;
  }
}