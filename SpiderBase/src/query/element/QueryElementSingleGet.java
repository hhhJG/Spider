package query.element;

public class QueryElementSingleGet implements QueryElementGetBase {
	/**
	 * ҳǩ���Զ�Ӧ��ֵ
	 * */
	private String attributeName;
	public String getAttributeName() {
		return attributeName;
	}
	public void setAttributeName(String attributeName) {
		this.attributeName = attributeName;
	}
	
	@Override
	public String getQueryElementGetType() {
		return QueryElementGetConst.SINGLE;
	}
}
