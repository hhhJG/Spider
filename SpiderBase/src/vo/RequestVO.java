package vo;

public class RequestVO implements ISuperVO {
	
	public final static int GET = 0;
	public final static int POST = 1;
	
	/**
	 * 链接
	 */
	private String url;
	
	// 获取链接
	public String getUrl() {
		return url;
	}
	
	// 设置链接
	public void setUrl(String url) {
		this.url = url;
	}
	
	/**
	 * 请求类型
	 * */
	private int requestMoethod;
	
	// 获取请求类型
	public int getRequestMoethod() {
		return requestMoethod;
	}

	// 设置请求类型
	public void setRequestMoethod(int requestMoethod) {
		this.requestMoethod = requestMoethod;
	}

	/**
	 * 参数集合
	 */
	private String[] params;
	
	// 获取参数集合
	public String[] getParams() {
			return params;
	}

	// 设置参数集合
	public void setParams(String[] params) {
			this.params = params;
	}
		
	/**
	 * 参数对应的值
	 */
	private String[] values;	

	// 获取参数对应的值
	public String[] getValues() {
		return values;
	}

	// 设置参数对应的值
	public void setValues(String[] values) {
		this.values = values;
	}

	public RequestVO(){
		this.requestMoethod = POST;
	}
}
