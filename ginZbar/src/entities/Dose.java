package entities;

public class Dose {
	
	private String unit;
	private double quantity;
	
	public Dose(){}
	
	
	public Dose(String unit, double quantity) {
	
		this.unit = unit;
		this.quantity = quantity;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	public double getQuantity() {
		return quantity;
	}
	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

}
