package functies;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;
import java.util.Scanner;

import entities.Artiest;

public class AZoekOpArtiest {

	private EntityManagerFactory emf = Persistence.createEntityManagerFactory("controller");
	/* methode voor aanroepen zoeken in les over Spring!)*/


	/**
	 * hier moet de artiest opgehaald worden uit het webformulier
	 * daarna moeten de voorstellingen met die artiest worden teruggegeven aan de front-end
	 * mv
	 */
	public List<Artiest> aZoekOpArtiest(String naam){
		EntityManager em = emf.createEntityManager();

		try {
			TypedQuery<Artiest> q = em.createQuery(
					"SELECT a FROM entities.Artiest a WHERE a.naam = :naamvanartiest", Artiest.class);
			q.setParameter("naamvanartiest", "naam");
			return q.getResultList();
		} finally {
			em.close();
		}
	}
}

/*
	private List<Department> getDepartments() {
		EntityManager em = emf.createEntityManager();
		try {
			TypedQuery<Department> query = em.createQuery("SELECT d FROM Department d WHERE d.location.city = :city", Department.class);
			query.setParameter("city", city);
			return query.getResultList();
		} finally {
			em.close();
		}

		for(Artiest a : q.getResultList()) {
				System.out.println(a.getNaam());
	}*/