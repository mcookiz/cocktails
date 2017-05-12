package test;

import static org.junit.Assert.*;

import org.junit.Test;

import entities.Divers;

public class TestDivers {

	@Test
	public void testDivers() {
		Divers d = new Divers();
		assertNotNull(d);
	}

	@Test
	public void testDiversString() {
		Divers d = new Divers("bouyaaaah");
		assertNotNull(d);
	}

	@Test
	public void testGetNom() {
		Divers d = new Divers("bouyaaaah");
		assertEquals("bouyaaaah", d.getNom());
	}

	@Test
	public void testSetNom() {
		Divers d = new Divers("bouyaaaah");
		d.setNom("bh");
		assertNotEquals("bouyaaaah", d.getNom());
		assertEquals("bh", d.getNom());
	}

}
