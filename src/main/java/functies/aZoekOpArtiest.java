package functies;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.Scanner;

import entities.Artiest;

public class aZoekOpArtiest implements AutoCloseable {

	private EntityManagerFactory emf = Persistence.createEntityManagerFactory("controller");

	public void close() {
		emf.close();
	}

	private Scanner reader;

	/**
	 * hier moet de artiest opgehaald worden uit het webformulier
	 * daarna moeten de voorstellingen met die artiest worden teruggegeven aan de front-end
	 * mv
	 */
	public Artiest zoekOpArtiest(){
		EntityManager em = emf.createEntityManager();
		try {
			TypedQuery<Artiest> q = em.createQuery(
					"SELECT a FROM entities.Artiest a WHERE a.naam = :naamvanartiest", Artiest.class);
			q.setParameter("naamvanartiest", "naam");
			for(Artiest a : q.getResultList()) {
				System.out.println(a.getNaam());
			}

		} finally {
			em.close();
		}
	}
}

