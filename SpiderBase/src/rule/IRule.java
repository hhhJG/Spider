package rule;

import vo.ISuperVO;

public interface IRule {
	/**
	 * 规则处理类
	 * */
	public void operate(ISuperVO[] vos);
}
