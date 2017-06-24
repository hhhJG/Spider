package transfer;

import java.util.Set;

import org.jsoup.nodes.Element;

import query.element.QueryElementGetBase;
import query.element.QueryElementManyGet;
import query.element.QueryElementSingleGet;
import query.result.ElementBaseResultVO;
import query.result.ElementManyResultVO;
import query.result.ElementSingleResultVO;

public class ElementTransfer {
	
	private Element element;
	public ElementTransfer(Element element) {
		this.element = element;
	}
	
	public void translate(QueryElementGetBase elementGet, ElementBaseResultVO resultVO) {
		if(elementGet.getQueryElementGetType().equals(resultVO.getResultVOType())) {
			if(elementGet instanceof QueryElementSingleGet) {
				String attName = ((QueryElementSingleGet) elementGet).getAttributeName();
				String value = this.element.attr(attName);
				resultVO = new ElementSingleResultVO(attName, value);
			}
			else if(elementGet instanceof QueryElementManyGet) {
				Set<String> attNameSet = ((QueryElementManyGet) elementGet).getAttriNameSet();
				ElementManyResultVO tempResultVO = new ElementManyResultVO();
				for(String attName : attNameSet) {					
					tempResultVO.addValue(attName, this.element.attr(attName));
				}
				resultVO = tempResultVO;
			}
		}
		else
		{
			System.out.println("×ª»»ElementÒì³££¡");
		}
	}
}
