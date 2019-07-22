package demo.po;

import java.util.List;

public class PageBean<T> {
	//总页数
	private Integer totalPage;
	//总记录数
	private Integer totalCount;
	//当前页数
	private Integer currentPage;
	//每页大小
	private Integer pageSize;
	//开始位置
	private Integer begin;
	//查询集合
	private List<T> TList;
	public Integer getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(Integer totalPage) {
		this.totalPage = totalPage;
	}
	public Integer getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}
	public Integer getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}
	public Integer getPageSize() {
		return pageSize;
	}
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
	public Integer getBegin() {
		return begin;
	}
	public void setBegin(Integer begin) {
		this.begin = begin;
	}
	
	public List<T> getTList() {
		return TList;
	}
	public void setTList(List<T> tList) {
		TList = tList;
	}
	@Override
	public String toString() {
		return "PageBean [totalPage=" + totalPage + ", totalCount="
				+ totalCount + ", currentPage=" + currentPage + ", pageSize="
				+ pageSize + ", begin=" + begin + "]";
	}
	
	
	
	
}
