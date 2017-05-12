package entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Ingredient {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String description;
	private Cocktail cocktail;
	
	public Ingredient(){}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Ingredient [id=" + id + ", description=" + description + ", cocktail=" + cocktail + "]";

	
	
	}

}
