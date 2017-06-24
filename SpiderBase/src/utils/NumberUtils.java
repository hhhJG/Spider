package utils;

public class NumberUtils {
	public final static double FAIL = -444444444;
	
	/**
	 * 字符串message转化为double类型数字
	 * 失败则返回FAIL
	 * */
	public double getDoubleByString(String message){
		if(!StringUtils.isEmpty(message, true)){
			try{
				return Double.valueOf(message.trim());
			}
			catch(Exception e){
				System.out.println(e);
				return NumberUtils.FAIL;
			}
		}
		return NumberUtils.FAIL;
	}
}
