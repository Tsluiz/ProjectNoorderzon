package functies;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.ArrayList;
import java.util.Scanner;

import entities.Artiest;
import entities.Voorstelling;

public class ToonAlleVoorstellingen implements AutoCloseable {
	private EntityManagerFactory emf = Persistence.createEntityManagerFactory("controller");

	public void close() {
		emf.close();
	}

	private Scanner reader;

	/**
	 * De verbinding om het totale programma te tonen
	 *
	 */
	public Artiest showAlleVoorstellingen() {
		EntityManager em = emf.createEntityManager();
		try {
			TypedQuery<Voorstelling> q = em.createQuery(
					"SELECT v FROM entities.Voorstelling v", Voorstelling.class);
			for (Voorstelling v : q.getResultList()) {
				return v.getId();
			}
		} finally {
			em.close();
		}
	}
}