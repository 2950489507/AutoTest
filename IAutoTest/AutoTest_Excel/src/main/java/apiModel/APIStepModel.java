package apiModel;


public class APIStepModel {
	
	String step;
	String url;
	String precondition;
	String action;
	String value;
	String expect;
	
	public String getStep() {
		return step;
	}
	public void setStep(String step) {
		this.step = step;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getPrecondition() {
		return precondition;
	}
	public void setPrecondition(String precondition) {
		this.precondition = precondition;
	}
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getExpect() {
		return expect;
	}
	public void setExpect(String expect) {
		this.expect = expect;
	}
	
	@Override
	public String toString() {
		return "StepModel [step=" + step + ",url=" + url + ",action=" + action + "\n" + ",value=" + value
				+ ",expect=" + expect + "]" + "\n";
	}
}
