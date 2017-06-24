package core.utils;

import java.util.ArrayList;
import java.util.List;

import org.jsoup.select.Elements;

public class ElementsValues {
	private Elements elements = null;
	
	public ElementsValues(Elements elements){
		this.elements = elements;
	}
	
	// 获取相应页签的所有的text值
	public List<String> getValues(String tagName){
		List<String> result = new ArrayList<String>();
		if(this.elements != null) {
			Elements tagElements = this.elements.tagName(tagName);
			result = tagElements.eachText();
		}
		return result;
	}
	
	// 获取相应页签的第index+1的text值
	public String getValue(String tagName, int getIndex){
		String result = null;
		if(this.elements != null) {
			Elements tagElements = this.elements.tagName(tagName);
			tagElements.get(getIndex).text();
		}
		return result;
	}
	
	// 获取相应页签的所有的attrName属性的值
	public List<String> getValues(String tagName, String attrName){
		List<String> result = new ArrayList<String>();
		if(this.elements != null) {
			Elements tagElements = this.elements.tagName(tagName);
			result = tagElements.eachAttr(attrName);
		}
		return result;
	}
	
	// 获取相应页签的第index+1的attrName属性的值
	public String getValue(String tagName, int getIndex, String attrName){
		String result = null;
		if(this.elements != null) {
			Elements tagElements = this.elements.tagName(tagName);
			result = tagElements.get(getIndex).attr(attrName);
		}
		return result;
	}
}
