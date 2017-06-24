package vo;

public abstract class APageSuperVO implements IPageSuperVO {
	
	public APageSuperVO(){}
	
	public APageSuperVO(String message, String id){};

	@Override
	public int getCurrentPageNum() {
		return 0;
	}

	@Override
	public void setCurrentPageNum(int currentPageNum) {
	}

	@Override
	public int getPageCount() {
		return 0;
	}
	
	/**
	 * 获取每页的数据行数
	 * */
	public abstract int getRowsOfPage();
	
	/**
	 * 设置每页的数据行数
	 * */
	public abstract int setRowsOfPage(int rowsOfPage);
}
