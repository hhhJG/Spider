package query.result;

public class ElementSingleResultVO implements ElementBaseResultVO {

	public Object value;
	public Object getValue() {
		return value;
	}
	public void setValue(Object value) {
		this.value = value;
	}
	
	public String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String getResultVOType() {
		return ResultVOConst.SINGLE;
	}
}
