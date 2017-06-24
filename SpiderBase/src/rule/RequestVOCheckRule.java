package rule;

import exception.RuleException;
import utils.StringUtils;
import vo.RequestVO;

public class RequestVOCheckRule implements IRequestRule {
	
	private void validateRule(RequestVO[] vos) {
		if(null != vos)
		{
			for(RequestVO vo : vos){
				String url = vo.getUrl();
				if (StringUtils.isEmpty(url, true)) {
					throw new RuleException("url����Ϊ�գ�");
				}
				if (!url.startsWith("http://")) {
					throw new RuleException("url�ĸ�ʽ����ȷ��");
				}
	
				if (vo.getParams() != null && vo.getValues() != null) {
					if (vo.getParams().length != vo.getValues().length) {
						throw new RuleException("�����ļ�ֵ�Ը�����ƥ�䣡");
					}
				}
				else if(vo.getParams() != null && vo.getValues() == null) {
					throw new RuleException("�����ļ�ֵ�Ը�����ƥ�䣡");
				}
				else if(vo.getParams() == null && vo.getValues() != null) {
					throw new RuleException("�����ļ�ֵ�Ը�����ƥ�䣡");
				}
			}
		}		
	}

	@Override
	public void operate(RequestVO[] vos) {
		validateRule(vos);		
	}
}
