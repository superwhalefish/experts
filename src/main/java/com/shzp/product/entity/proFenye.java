package com.shzp.product.entity;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class proFenye<T> {
	private Integer page;
	private Integer limit;
	private List<T> rows;
	//参数
	private T t;
	public proFenye() {
		super();
		// TODO Auto-generated constructor stub
	}
	public proFenye(Integer page, Integer limit, List<T> rows, T t) {
		super();
		this.page = page;
		this.limit = limit;
		this.rows = rows;
		this.t = t;
	}
	public Integer getPage() {
		return page;
	}
	public void setPage(Integer page) {
		this.page = page;
	}
	public Integer getLimit() {
		return limit;
	}
	public void setLimit(Integer limit) {
		this.limit = limit;
	}
	public List<T> getRows() {
		return rows;
	}
	public void setRows(List<T> rows) {
		this.rows = rows;
	}
	public T getT() {
		return t;
	}
	public void setT(T t) {
		this.t = t;
	}
	@Override
	public String toString() {
		return "proFenye [page=" + page + ", limit=" + limit + ", rows=" + rows + ", t=" + t + "]";
	}
	
}
