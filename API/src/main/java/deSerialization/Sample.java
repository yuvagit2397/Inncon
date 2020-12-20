package deSerialization;

import java.util.List;

public class Sample {
private Support support;
private List<Data> data;

private int page;
private int per_pages;
private int total;
private int total_pages;
public Support getSupport() {
	return support;
}
public void setSupport(Support support) {
	this.support = support;
}
public List<Data> getData() {
	return data;
}
public void setData(List<Data> data) {
	this.data = data;
}
public int getPage() {
	return page;
}
public void setPage(int page) {
	this.page = page;
}
public int getPer_page() {
	return per_pages;
}
public void setPer_page(int per_page) {
	this.per_pages = per_page;
}
public int getTotal() {
	return total;
}
public void setTotal(int total) {
	this.total = total;
}
public int getPer_total() {
	return total_pages;
}
public void setPer_total(int per_total) {
	this.total_pages = per_total;
}
}
