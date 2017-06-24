package core.utils;

import org.jsoup.nodes.Element;

public class ElementVaule {
	Element data;
	public ElementVaule(Element data){
		this.data = data;
	}
	
	public String getTextValue(){
		if(this.data != null){
			return this.data.text();
		}
		return null;
	}
	
	public String getHtmlValue(){
		if(this.data != null){
			return this.data.html();
		}
		return null;
	}
	
	public String getAttValue(String seleAttName){
		if(this.data != null){
			return this.data.attr(seleAttName);
		}
		return null;
	}
}
