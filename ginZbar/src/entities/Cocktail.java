package entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cocktail {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	private String nom;
	
	List<Ingredient> listeIngredient=new ArrayList<>();
	List<Etapes> listeEtapes =new ArrayList<>();
	
	
	
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
	
	

	
	public List<Ingredient> getListeIngredient() {
		return listeIngredient;
	}
	public void setListeIngredient(List<Ingredient> listeIngredient) {
		this.listeIngredient = listeIngredient;
	}
	public List<Etapes> getListeEtapes() {
		return listeEtapes;
	}
	public void setListeEtapes(List<Etapes> listeEtapes) {
		this.listeEtapes = listeEtapes;
	}
	
	


}
