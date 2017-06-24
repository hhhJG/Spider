package rule;

import vo.RequestVO;

public interface IRequestRule {
	/**
	 * 规则处理类
	 * */	
	public void operate(RequestVO[] vos);

}
