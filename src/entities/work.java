package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entities.enums.workLevel;

public class work {

	private String name;
	private workLevel level;
	private Double bsalary;
	
	private depart depart;
	private List<hContrac> contrac = new ArrayList<>();
	
	public work() {
		
	}

	public work(String name, workLevel level, Double bsalary, entities.depart depart) {
		this.name = name;
		this.level = level;
		this.bsalary = bsalary;
		this.depart = depart;
	
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public workLevel getLevel() {
		return level;
	}

	public void setLevel(workLevel level) {
		this.level = level;
	}

	public Double getBsalary() {
		return bsalary;
	}

	public void setBsalary(Double bsalary) {
		this.bsalary = bsalary;
	}

	public depart getDepart() {
		return depart;
	}

	public void setDepart(depart depart) {
		this.depart = depart;
	}

	public List<hContrac> getContrac() {
		return contrac;
	}
	
	public void addContrac(hContrac contrac) {
		this.contrac.add(contrac);
	}
	
	public void removeContrac(hContrac contrac) {
		this.contrac.remove(contrac);
	}
	
	public double income(int year, int month) {
		double sum = bsalary;
		Calendar cal = Calendar.getInstance();
				
		for(hContrac c : contrac) {
			cal.setTime(c.getDate());
			int c_year = cal.get(Calendar.YEAR);
			int c_month = 1+cal.get(Calendar.MONTH);
			if(year == c_year && month ==c_month) {
			sum += c.totalValue();
			}
		}	
		return sum;
	}
}
