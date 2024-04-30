package pv.sb_jdomeexchange_mvc.model;

public class ExchangeRate {
	
	private String unit;
	private String curr;
	private String value;
	
	public ExchangeRate(String unit, String curr, String value) {
		super();
		this.unit = unit;
		this.curr = curr;
		this.value = value;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public String getCurr() {
		return curr;
	}

	public void setCurr(String curr) {
		this.curr = curr;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "ExchangeRate [unit=" + unit + ", curr=" + curr + ", value=" + value + "]";
	}
	
	

}
