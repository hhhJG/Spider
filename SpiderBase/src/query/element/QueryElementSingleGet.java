package query.element;

public class QueryElementSingleGet implements QueryElementGetBase {
	/**
	 * 页签属性对应的值
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
