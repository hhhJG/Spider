package rule;

import vo.RequestVO;

public interface IRequestRule {
	/**
	 * ��������
	 * */	
	public void operate(RequestVO[] vos);

}
