package query.element;

import java.util.ArrayList;
import java.util.List;

import org.jsoup.nodes.Element;

import query.result.ElementBaseResultVO;
import transfer.ElementTransfer;

/**
 * 通过多个QueryElementAtom，检索到某一个对应的页签
 * */
public class QueryElement {
	
	private Element element;
	public QueryElement(Element element) {
		this.element = element;
	}
	
	private List<QueryElementAtom> queryLt = new ArrayList<QueryElementAtom>();
	public void add(QueryElementAtom element) {
		queryLt.add(element);
	}
	
	public List<QueryElementAtom> getQuerySet() {
		return queryLt;
	}
	
	public Element getResultElement() {
		Element result = this.element;
		String name = null;
		String value = null;
		int index = 0;
		for(QueryElementAtom atom : queryLt) {
			name = atom.getAttributeName();
			value = atom.getAttributeVaule();
			index = atom.getIndex();
			result = result.getElementsByAttributeValue(name, value).get(index);
		}
		return result;
	}

	private List<QueryElement> childQueryElement = new ArrayList<QueryElement>();
	public void addChild(QueryElement queryElement) {
		childQueryElement.add(queryElement);
	}
	public List<QueryElement> getChildQueryElement() {
		return this.childQueryElement;
	}
	
	public void tranElement(QueryElementGetBase elementGet, ElementBaseResultVO resultVO) {
		ElementTransfer transfer = new ElementTransfer(this.element);
		transfer.translate(elementGet, resultVO);
	}	
}
