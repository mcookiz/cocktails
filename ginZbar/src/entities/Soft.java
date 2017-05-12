package entities;

public class Soft extends Ingredient{
	private String nom;

	
	public Soft(){
		super();
	}
	public Soft(String nom) {
		
		this.nom = nom;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}

}
