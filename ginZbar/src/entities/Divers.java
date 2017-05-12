package entities;

public class Divers extends Ingredient {

	private String nom;

	public Divers() {
		super();
	}

	public Divers(String nom) {

		this.nom = nom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

}
