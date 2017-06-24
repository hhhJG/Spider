package query.element;

import query.element.utils.TAGUnique;
import utils.NumberConst;

/**
 * 检索路径元素
 * 获取某个页签值得最小检索元素
 * 用于定位待检索元素
 * */
public class QueryElementAtom {

	/**
	 * 页签名称，如div，img
	 * */
	private String tagName;
	public String getTagName() {
		return tagName;
	}
	public void setTagName(String tagName) {
		this.tagName = tagName;		
	}
	
	/**
	 * 页签属性，如id，class，name
	 * */
	private String attributeName;
	public String getAttributeName() {
		return attributeName;
	}
	public void setAttributeName(String attributeName) {
		this.attributeName = attributeName;
		// 如果属性对应的元素唯一，则索引值为0
		if(TAGUnique.getInstance().isUnique(attributeName)) {
			setIndex(NumberConst.ZERO);
		}
	}
	
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

	/**
	 * 获取的页签的索引，便于指定具体值
	 * */
	private int index;
	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}
}
