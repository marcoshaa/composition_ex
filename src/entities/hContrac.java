package entities;

import java.util.Date;

public class hContrac {
	
	private Date date;
	private Double valueperH;
	private Integer h;
	
	public hContrac() {
		
	}

	public hContrac(Date date, Double valueperH, Integer h) {
		this.date = date;
		this.valueperH = valueperH;
		this.h = h;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Double getValueperH() {
		return valueperH;
	}

	public void setValueperH(Double valueperH) {
		this.valueperH = valueperH;
	}

	public Integer getH() {
		return h;
	}

	public void setH(Integer h) {
		this.h = h;
	}

	
}
