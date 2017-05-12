package entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Dose {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String unit;
	

	private double quantity;

	public Dose() {
	}

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
	@Override
	public String toString() {
		return "Dose [id=" + id + ", unit=" + unit + ", quantity=" + quantity + "]";
	}
}
