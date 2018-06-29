package nl.noorderzon.controller;

import nl.noorderzon.entities.Voorstelling;
import org.springframework.web.bind.annotation.*;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@RestController
public class Controller {

	@PersistenceContext
	private EntityManager em;

	@RequestMapping(value = "/zoekArtiest")
	public List<Voorstelling> zoekOpArtiest(
			@RequestParam(value = "naamvanartiest") String naam) {
		TypedQuery<Voorstelling> q = em.createQuery(
				"SELECT v FROM Voorstelling v WHERE v.id = :naamvanartiest", Voorstelling.class);
		q.setParameter("naamvanartiest", "naam");

		return q.getResultList();

	}

	@RequestMapping(path = "/json")
	public List<Voorstelling> json() {
		return ;
	}

}
