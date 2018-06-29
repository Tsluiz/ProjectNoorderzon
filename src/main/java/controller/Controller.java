package controller;

import entities.Artiest;
import entities.Voorstelling;
import functies.*;
import org.springframework.web.bind.annotation.*;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@RestController
public class Controller {

	@PersistenceContext
	private EntityManager em;

	@RequestMapping(value = "/aZoekOpArtiest")
	public List<Voorstelling> aZoekOpArtiest(
			@RequestParam(value = "naamvanartiest") String naam) {

		TypedQuery<Voorstelling> q = em.createQuery(
				"SELECT v FROM Voorstelling v WHERE v.id.naam = :naamvanartiest", Voorstelling.class);
		q.setParameter("naamvanartiest", "naam");
		return q.getResultList();
	}
}

/*	@RequestMapping("/controller")
	public Controller database(@RequestParam(value = "ZoekOpArtiest") int a, @RequestParam("b") int b) {
		return new Controller(a, b);
	}

	@RequestMapping(value = "/toonAlleVoorstellingen")
	public Controller toon(@RequestParam(value = "") String naam) {
		return new Controller(naam);
	}*/