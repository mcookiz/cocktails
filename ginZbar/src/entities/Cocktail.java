package entities;

import java.util.ArrayList;
import java.util.List;

public class Cocktail {
	private String nom;
	private long id;
	private List<Etapes> listeEtapes= new ArrayList<>();
	private List<Ingredient> listeIngredient= new ArrayList<>();
	
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
	public List<Etapes> getListeEtapes() {
		return listeEtapes;
	}
	public void setListeEtapes(List<Etapes> listeEtapes) {
		this.listeEtapes = listeEtapes;
	}
	public List<Ingredient> getListeIngredient() {
		return listeIngredient;
	}
	public void setListeIngredient(List<Ingredient> listeIngredient) {
		this.listeIngredient = listeIngredient;
	}
	

}
