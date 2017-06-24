package vo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ResultParamVO {
	// 索引
	private int index = -1;
	
	// 页签名称
	private String tagName;
	
	// 条件
	private Map<String, String> conditionMap;
	
	// 想要的结果
	private Map<String, List<Object>> resultParamMap;
	
	public ResultParamVO() {
		conditionMap = new HashMap<String, String>();
		resultParamMap = new HashMap<String, List<Object>>();
	}
	
	public ResultParamVO(String tagName) {
		this.tagName = tagName;
		conditionMap = new HashMap<String, String>();
		resultParamMap = new HashMap<String, List<Object>>();
	}
	
	public ResultParamVO(String tagName, int index) {
		this.tagName = tagName;
		this.index = index;
		conditionMap = new HashMap<String, String>();
		resultParamMap = new HashMap<String, List<Object>>();
	}
	
	public int getIndex() {
		return this.index;
	}
	
	public String getTagName() {
		return this.tagName;
	}
	
	public void putResultParam(String resultParam) {
		resultParamMap.put(resultParam, null);
	}
	
	public void putResultParams(String[] resultParams) {
		if(null != resultParams) {
			for(String resultParam : resultParams){
				resultParamMap.put(resultParam, null);
			}
		}
	}
	
	public Map<String, List<Object>> getResultParams(){
		return this.resultParamMap;
	}
	
	public void putCondition(String key, String value) {
		conditionMap.put(key, value);
	}
	
	public void putCondition(String[] keys, String[] values) {
		if(null != keys && null != values && keys.length == values.length) {
			for(int x = 0; x < keys.length; x ++){
				conditionMap.put(keys[x], values[x]);
			}
		}
	}
	
	public Map<String, String> getCondition(){
		return this.conditionMap;
	}
}
