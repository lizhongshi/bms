package com.dly.explain.entity;

public class TExplain {
    private String zw;

    private String pinyin;

    public String getZw() {
        return zw;
    }

    public void setZw(String zw) {
        this.zw = zw == null ? null : zw.trim();
    }

    public String getPinyin() {
        return pinyin;
    }

    public void setPinyin(String pinyin) {
        this.pinyin = pinyin == null ? null : pinyin.trim();
    }

	@Override
	public String toString() {
		return "TExplain [zw=" + zw + ", pinyin=" + pinyin + "]";
	}
    
}