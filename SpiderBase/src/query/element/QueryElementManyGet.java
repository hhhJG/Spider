package query.element;

import java.util.HashSet;
import java.util.Set;

public class QueryElementManyGet implements QueryElementGetBase {

	/**
	 * ҳǩ���Զ�Ӧ��ֵ
	 * */
	private Set<String> attributeNameSet = new HashSet<String>();
	
	@Override
	public String getQueryElementGetType() {
		return QueryElementGetConst.MANY;
	}
	
	public void add(String attriName) {
		attributeNameSet.add(attriName);
	}
	
	public Set<String> getAttriNameSet() {
		return attributeNameSet;
	}
	
	public int getSize() {
		return attributeNameSet.size();
	}
}
