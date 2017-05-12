package test;

import static org.junit.Assert.*;

import org.junit.Test;

import entities.Alcool;
import entities.Ingredient;

public class TestAlcool {

	@Test
	public void testAlcool() {
		Alcool al = new Alcool();
		assertNotNull(al);
	}

	@Test
	public void testAlcoolString() {
		Alcool al = new Alcool("alcool qui tue");
		assertNotNull(al);
		
	}

	@Test
	public void testGetNom() {
		Alcool al = new Alcool("alcool qui tue");
		assertEquals("alcool qui tue", al.getNom());
	}

	@Test
	public void testSetNom() {
		Alcool al = new Alcool("alcool qui tue");
		al.setNom("alcool de patate");
		assertNotEquals("alcool qui tue", al.getNom());
		assertEquals("alcool de patate", al.getNom());
	}

	@Test
	public void testIngredient() {
		Ingredient ind =new Ingredient();
		assertNotNull(ind);
	}

	@Test
	public void testGetId() {
		Ingredient ind =new Ingredient();
		assertEquals(0, ind.getId());
	}

	@Test
	public void testSetId() {
		Ingredient ind =new Ingredient();
		ind.setId(3);
		assertNotNull(ind.getId());
		assertEquals(3, ind.getId());
	}

	@Test
	public void testGetDescription() {
		Ingredient ind =new Ingredient();
		assertNull(ind.getDescription());
	}

	@Test
	public void testSetDescription() {
		Ingredient ind =new Ingredient();
		ind.setId(2);
		assertEquals(2, ind.getId());
	}

}
