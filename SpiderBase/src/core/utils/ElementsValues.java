package core.utils;

import java.util.ArrayList;
import java.util.List;

import org.jsoup.select.Elements;

public class ElementsValues {
	private Elements elements = null;
	
	public ElementsValues(Elements elements){
		this.elements = elements;
	}
	
	// ��ȡ��Ӧҳǩ�����е�textֵ
	public List<String> getValues(String tagName){
		List<String> result = new ArrayList<String>();
		if(this.elements != null) {
			Elements tagElements = this.elements.tagName(tagName);
			result = tagElements.eachText();
		}
		return result;
	}
	
	// ��ȡ��Ӧҳǩ�ĵ�index+1��textֵ
	public String getValue(String tagName, int getIndex){
		String result = null;
		if(this.elements != null) {
			Elements tagElements = this.elements.tagName(tagName);
			tagElements.get(getIndex).text();
		}
		return result;
	}
	
	// ��ȡ��Ӧҳǩ�����е�attrName���Ե�ֵ
	public List<String> getValues(String tagName, String attrName){
		List<String> result = new ArrayList<String>();
		if(this.elements != null) {
			Elements tagElements = this.elements.tagName(tagName);
			result = tagElements.eachAttr(attrName);
		}
		return result;
	}
	
	// ��ȡ��Ӧҳǩ�ĵ�index+1��attrName���Ե�ֵ
	public String getValue(String tagName, int getIndex, String attrName){
		String result = null;
		if(this.elements != null) {
			Elements tagElements = this.elements.tagName(tagName);
			result = tagElements.get(getIndex).attr(attrName);
		}
		return result;
	}
}
