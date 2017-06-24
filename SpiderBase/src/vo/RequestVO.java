package vo;

public class RequestVO implements ISuperVO {
	
	public final static int GET = 0;
	public final static int POST = 1;
	
	/**
	 * ����
	 */
	private String url;
	
	// ��ȡ����
	public String getUrl() {
		return url;
	}
	
	// ��������
	public void setUrl(String url) {
		this.url = url;
	}
	
	/**
	 * ��������
	 * */
	private int requestMoethod;
	
	// ��ȡ��������
	public int getRequestMoethod() {
		return requestMoethod;
	}

	// ������������
	public void setRequestMoethod(int requestMoethod) {
		this.requestMoethod = requestMoethod;
	}

	/**
	 * ��������
	 */
	private String[] params;
	
	// ��ȡ��������
	public String[] getParams() {
			return params;
	}

	// ���ò�������
	public void setParams(String[] params) {
			this.params = params;
	}
		
	/**
	 * ������Ӧ��ֵ
	 */
	private String[] values;	

	// ��ȡ������Ӧ��ֵ
	public String[] getValues() {
		return values;
	}

	// ���ò�����Ӧ��ֵ
	public void setValues(String[] values) {
		this.values = values;
	}

	public RequestVO(){
		this.requestMoethod = POST;
	}
}
