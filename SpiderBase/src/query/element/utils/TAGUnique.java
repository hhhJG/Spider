package query.element.utils;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/**
 * 根据页签的属性唯一确定元素
 * */
public class TAGUnique {
	
	public static final String ID = "id";
	
	public static final String CLASS = "class";
	
	public List<Object> uniqueLt = new ArrayList<Object>();
	
	private TAGUnique(){
		Class<?> thisClass = TAGUnique.class;
		Field[] fields = thisClass.getDeclaredFields();
		if(fields != null && fields.length > 0){
			for(Field element : fields){
				try {
					if((element.getModifiers() >> 3) % 2 == 1){
						System.out.println(element.getName());
						uniqueLt.add(element.get(thisClass));
					}
				}
				catch (IllegalArgumentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IllegalAccessException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		uniqueLt.remove("instance");
	}
	
	private static final TAGUnique instance = new TAGUnique();
	public static TAGUnique getInstance(){
		return instance;
	} 
	
	public boolean isUnique(String uniqueName){
		boolean result = false;
		if(uniqueLt.contains(uniqueName)){
			result = true;
		}
		return result;
	}
	
	public static void main(String[] args){
		System.out.println(TAGUnique.getInstance().isUnique("id"));
	}
}
