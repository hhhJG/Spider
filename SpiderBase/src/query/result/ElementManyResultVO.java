package query.result;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ElementManyResultVO implements ElementBaseResultVO {

	public Map<String, Object> resultMap = new HashMap<String, Object>();
	
	@Override
	public String getResultVOType() {
		return ResultVOConst.MANY;
	}
	
	public void addValue(String key, Object value) {
		resultMap.put(key, value);
	}
	
	public Object getValue(String key) {
		return resultMap.get(key);
	}
	
	public Set<String> getKeys() {
		return resultMap.keySet();
	}
	
	public Collection<Object> getValues() {
		return resultMap.values();
	}
	
	public int getSize(){
		return resultMap.size();
	}
	
	public boolean containKey(String key) {
		return resultMap.containsKey(key);
	}
	
	public boolean containValue(Object value) {
		return resultMap.containsValue(value);
	}
}
