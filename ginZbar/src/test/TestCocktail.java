package test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import entities.Cocktail;
import entities.Etapes;
import entities.Ingredient;

public class TestCocktail {

	@Test
	public void testCocktail() {
		Cocktail ck = new Cocktail();
		assertNotNull(ck);
	}

	@Test
	public void testCocktailString() {
		Cocktail ck = new Cocktail("cocktail");
		assertNotNull(ck);
	}

	@Test
	public void testGetNom() {
		Cocktail ck = new Cocktail("cocktail");
		assertEquals("cocktail", ck.getNom());
		
	}

	@Test
	public void testSetNom() {
		Cocktail ck = new Cocktail("cocktail");
		assertEquals("cocktail", ck.getNom());
		ck.setNom("cocktail qui tue");
		assertEquals("cocktail qui tue", ck.getNom());
	}

	@Test
	public void testGetId() {
		Cocktail ck = new Cocktail("cocktail");
		assertEquals(0, ck.getId());
	}

	@Test
	public void testSetId() {
		Cocktail ck = new Cocktail("cocktail");
		assertEquals(0, ck.getId());
		ck.setId(3);
		assertEquals(3, ck.getId());
	}

	@Test
	public void testGetListeEtapes() {
		Cocktail ck = new Cocktail("cocktail");
		assertEquals(0, ck.getListeEtapes().size());
	}

	@Test
	public void testSetListeEtapes() {
		Cocktail ck = new Cocktail("cocktail");
		Etapes e= new Etapes();
		List<Etapes> le=new ArrayList<>();
		le.add(e);
		ck.setListeEtapes(le);
		assertEquals(le.size(),ck.getListeEtapes().size());
		
	}

	@Test
	public void testGetListeIngredient() {
		Cocktail ck = new Cocktail("cocktail");
		assertEquals(0, ck.getListeIngredient().size());
	}

	@Test
	public void testSetListeIngredient() {
		Cocktail ck = new Cocktail("cocktail");
		Ingredient ind= new Ingredient();
		List<Ingredient> li = new ArrayList<>();
		li.add(ind);
		ck.setListeIngredient(li);
		assertEquals(li.size(), ck.getListeIngredient().size());
	}

}
