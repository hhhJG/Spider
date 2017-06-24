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
					throw new RuleException("url不能为空！");
				}
				if (!url.startsWith("http://")) {
					throw new RuleException("url的格式不正确！");
				}
	
				if (vo.getParams() != null && vo.getValues() != null) {
					if (vo.getParams().length != vo.getValues().length) {
						throw new RuleException("参数的键值对个数不匹配！");
					}
				}
				else if(vo.getParams() != null && vo.getValues() == null) {
					throw new RuleException("参数的键值对个数不匹配！");
				}
				else if(vo.getParams() == null && vo.getValues() != null) {
					throw new RuleException("参数的键值对个数不匹配！");
				}
			}
		}		
	}

	@Override
	public void operate(RequestVO[] vos) {
		validateRule(vos);		
	}
}
