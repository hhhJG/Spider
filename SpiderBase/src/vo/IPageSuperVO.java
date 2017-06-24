package vo;

public interface IPageSuperVO {
	/**
	 * 获取当前页码
	 * */
	int getCurrentPageNum();
	
	/**
	 * 设置当前页码
	 * */
	void setCurrentPageNum(int currentPageNum);
	
	/**
	 * 获取总页数
	 * */
	int getPageCount();
}
