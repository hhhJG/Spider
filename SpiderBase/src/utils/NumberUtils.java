package utils;

public class NumberUtils {
	
	/**
	 * �ַ���messageת��Ϊdouble��������
	 * ʧ���򷵻�FAIL
	 * */
	public double getDoubleByString(String message){
		if(!StringUtils.isEmpty(message, true)){
			try{
				return Double.valueOf(message.trim());
			}
			catch(Exception e){
				System.out.println(e);
				return NumberConst.CONVERTINTFAIL;
			}
		}
		return NumberConst.CONVERTINTFAIL;
	}
}
