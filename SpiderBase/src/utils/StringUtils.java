package utils;

public class StringUtils {
	/**
	 * �ж��ַ���message�Ƿ�ǿ�
	 * ���trimΪtrue������trim�����ж��Ƿ�Ϊ��
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
	 * ����splitStr�ָ�����message���зָ�
	 * ����ָ����Ӵ�����partID���򷵻��Ӵ�
	 * ���򣬷���null
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
