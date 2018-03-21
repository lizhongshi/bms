package com.dly.explain.entity;

public class TExplain12 {
    private Integer id;

    private String pinyin;

    private String zw;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPinyin() {
        return pinyin;
    }

    public void setPinyin(String pinyin) {
        this.pinyin = pinyin == null ? null : pinyin.trim();
    }

    public String getZw() {
        return zw;
    }

    public void setZw(String zw) {
        this.zw = zw == null ? null : zw.trim();
    }
}