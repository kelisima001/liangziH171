package com.liangzi.util;

import java.util.List;

public class BootstrapUIDataGridResult {
	
	private Long total;
	private List<?> rows;
	public Long getTotal() {
		return total;
	}
	public void setTotal(Long total) {
		this.total = total;
	}
	public List<?> getRows() {
		return rows;
	}
	public void setRows(List<?> rows) {
		this.rows = rows;
	}
	@Override
	public String toString() {
		return "BootstrapUIDataGridResult [total=" + total + ", rows=" + rows + "]";
	}
	
}
