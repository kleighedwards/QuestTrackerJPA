package test;

import static org.junit.Assert.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import entities.Land;

public class LandTest {
	
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
		Land land = em.find(Land.class, 1);
		
		assertEquals("Blighttown", land.getName());
	}
	
	@After
	public void tearDown() throws Exception {
		em.close();
        emf.close();
	}
}
