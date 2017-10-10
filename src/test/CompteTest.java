package test;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.time.Month;

import org.junit.Before;
import org.junit.Test;

import kata.Client;
import kata.Compte;

public class CompteTest {

	private Compte c;
	
	@Before
	public void setUp() throws Exception {
		Client client = new Client("katia", "test",
				LocalDate.of(1998, Month.AUGUST, 18));
		c = new Compte(client);
	}

	@Test(expected=Exception.class)
	public void retirerImpossibleTest() throws Exception {
		c.retirer(100, "Assurance");
	}
	
	@Test
	public void depotTest() {
		c.deposer(1000, "Bourse");
		assertEquals(c.getSolde(), 1000, 1);
	}
	
	@Test
	public void test() {
		c.deposer(1000, "Bourse");
		c.deposer(500, "Paye");
		
		try {
			c.retirer(100, "Banque Mairie");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		assertEquals(1400, c.getSolde(), 1);
		System.out.println(c.relevé());
	}
	
	

}
