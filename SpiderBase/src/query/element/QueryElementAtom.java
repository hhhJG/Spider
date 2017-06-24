package query.element;

import query.element.utils.TAGUnique;
import utils.NumberConst;

/**
 * ����·��Ԫ��
 * ��ȡĳ��ҳǩֵ����С����Ԫ��
 * ���ڶ�λ������Ԫ��
 * */
public class QueryElementAtom {

	/**
	 * ҳǩ���ƣ���div��img
	 * */
	private String tagName;
	public String getTagName() {
		return tagName;
	}
	public void setTagName(String tagName) {
		this.tagName = tagName;		
	}
	
	/**
	 * ҳǩ���ԣ���id��class��name
	 * */
	private String attributeName;
	public String getAttributeName() {
		return attributeName;
	}
	public void setAttributeName(String attributeName) {
		this.attributeName = attributeName;
		// ������Զ�Ӧ��Ԫ��Ψһ��������ֵΪ0
		if(TAGUnique.getInstance().isUnique(attributeName)) {
			setIndex(NumberConst.ZERO);
		}
	}
	
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

	/**
	 * ��ȡ��ҳǩ������������ָ������ֵ
	 * */
	private int index;
	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}
}
