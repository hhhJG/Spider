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
	 * ��ȡÿҳ����������
	 * */
	public abstract int getRowsOfPage();
	
	/**
	 * ����ÿҳ����������
	 * */
	public abstract int setRowsOfPage(int rowsOfPage);
}
