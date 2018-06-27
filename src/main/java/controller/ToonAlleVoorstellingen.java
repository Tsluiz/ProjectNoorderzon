package controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.Scanner;
import application.*;

public class Database implements AutoCloseable {
	private EntityManagerFactory emf = Persistence.createEntityManagerFactory("controller");

	public void close() {
		emf.close();
	}

	private Scanner reader;

	/**
	 * De verbinding om het totale programma te tonen
	 *
	 */
	public Voorstelling showAlleVoorstellingen() {
		EntityManager em = emf.createEntityManager();
		try {
			TypedQuery<Voorstelling> q = em.createQuery(
					"SELECT v FROM Entities.Voorstelling v WHERE v.genre = :genre", Voorstelling.class);
			Voorstelling.class);
			q.setParameter("naamvanartiest", artiest.getNaam());
			for (Voorstelling v : q.getResultList()) {
				return v.getDetails(); // uitzoeken hoe die methode heet
			}
		} finally {
			em.close();
		}
	}

}