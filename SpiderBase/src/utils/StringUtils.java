package utils;

public class StringUtils {
	/**
	 * 判断字符串message是否非空
	 * 如果trim为true，则先trim，后判断是否为空
	 * */
	public static boolean isEmpty(String message, boolean trim){
		if(null == message)
			return true;
		if(message.length() == 0)
			return true;
		if(trim && message.trim().length() == 0)
			return true;		
		return false;
	}
	
	/**
	 * 根据splitStr分隔符对message进行分割
	 * 如果分割后的子串包括partID，则返回子串
	 * 否则，返回null
	 * */
	public static String getValueByLike(String message, String splitStr, String partID){
		if(!isEmpty(message, true)){
			String[] datas = message.split(splitStr);
			for(String data : datas){
				if(data.contains(partID)){
					return data;
				}
			}
		}
		return null;
	}
		
}
