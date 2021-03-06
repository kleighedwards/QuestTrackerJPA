package test;

import static org.junit.Assert.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import entities.Conquest;

public class ConquestTest {

	private EntityManagerFactory emf;
    private EntityManager em;
	
	@Before
	public void setUp() throws Exception {
		emf = Persistence.
	            createEntityManagerFactory("JPAQuest");
	    em = emf.createEntityManager();
	}

	@Test
	public void test() {
		Conquest conquest = em.find(Conquest.class, 1);
		
		assertEquals("Chaos Witch Quelaag", conquest.getFoe());
		assertEquals(20000, conquest.getGold());
//		assertEquals("Description", conquest.getTale()); //Passes
		assertEquals(1, conquest.getLoot().size());
		assertEquals("Blighttown", conquest.getLand().getName());
		
		Conquest anotherConquest = em.find(Conquest.class, 7);
		
//		assertEquals("Gwyn Lord of Cinder", anotherConquest.getFoe());
		assertEquals(2, anotherConquest.getLoot().size());
		
	}
	
	@After
	public void tearDown() throws Exception {
		em.close();
        emf.close();
	}


}
