package query.element;

public class QueryElementSingleGet implements QueryElementGetBase {
	/**
	 * ҳǩ���Զ�Ӧ��ֵ
	 * */
	private String attributeVaule;
	public String getAttributeVaule() {
		return attributeVaule;
	}
	public void setAttributeVaule(String attributeVaule) {
		this.attributeVaule = attributeVaule;
	}
	
	@Override
	public String getQueryElementGetType() {
		return QueryElementGetConst.SINGLE;
	}
}
