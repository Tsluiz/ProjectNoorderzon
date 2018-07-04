package nl.noorderzon.controller;

import nl.noorderzon.entities.Voorstelling;
import org.springframework.web.bind.annotation.*;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@RestController
public class ZoekOpArtiestController {

	@PersistenceContext
	private EntityManager em;

	@RequestMapping(value = "/zoekArtiest")
	public List<Voorstelling> zoekOpArtiest(
			@RequestParam(value = "zoekopartiestnaam") String naam) {
		TypedQuery<Voorstelling> q = em.createQuery(
                "SELECT v FROM Voorstelling v WHERE v.artiest.naam LIKE :naamvanartiest", Voorstelling.class);
        q.setParameter("naamvanartiest", naam);

		return q.getResultList();
	}

}