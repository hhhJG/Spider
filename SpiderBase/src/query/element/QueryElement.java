package query.element;

import java.util.HashSet;
import java.util.Set;

/**
 * ͨ�����QueryElementAtom��������ĳһ����Ӧ��ҳǩ
 * */
public class QueryElement {
	
	private Set<QueryElementAtom> querySet = new HashSet<QueryElementAtom>();
	public void add(QueryElementAtom element) {
		querySet.add(element);
	}
	
	public Set<QueryElementAtom> getQuerySet() {
		return querySet;
	}
	
	private QueryElementGetBase elementGet;
	public void setQueryElementGet(QueryElementGetBase elementGet) {
		this.elementGet = elementGet;
	}
	public QueryElementGetBase getQueryElementGet() {
		return this.elementGet;
	}
	
}
