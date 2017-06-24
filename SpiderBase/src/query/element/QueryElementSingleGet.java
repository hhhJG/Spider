package query.element;

public class QueryElementSingleGet implements QueryElementGetBase {
	/**
	 * 页签属性对应的值
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
