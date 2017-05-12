package entities;

public class Cocktail {
	private String nom;
	private long id;
	
	public Cocktail(){}
	public Cocktail(String nom){
		this.nom= nom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	

}
