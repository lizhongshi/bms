package com.dly.explain.vo;

public class Page {
	private Integer index;
	private Integer size;
	public Integer getIndex() {
		return index;
	}
	public void setIndex(Integer index) {
		this.index = index;
	}
	public Integer getSize() {
		return size;
	}
	public void setSize(Integer size) {
		this.size = size;
	}
	@Override
	public String toString() {
		return "Page [index=" + index + ", size=" + size + "]";
	}

}
