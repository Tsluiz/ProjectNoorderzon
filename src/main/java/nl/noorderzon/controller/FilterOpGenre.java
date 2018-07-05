package nl.noorderzon.controller;

import nl.noorderzon.entities.Artiest;
import nl.noorderzon.entities.Voorstelling;
import org.springframework.web.bind.annotation.*;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@RestController
public class FilterOpGenre{

	@PersistenceContext
	private EntityManager em;

    @RequestMapping(value = "/voorstellingen")
	public List<Artiest> zoekOpGenre(
            @RequestParam(value = "artiestgenre") String genre) {
		TypedQuery<Artiest> q = em.createQuery(
				"SELECT a FROM Artiest a WHERE a.genre = :genre", Artiest.class);
		q.setParameter("genre", genre);

		return q.getResultList();
	}

}