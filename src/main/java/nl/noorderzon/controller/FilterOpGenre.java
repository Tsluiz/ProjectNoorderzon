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

    @RequestMapping(value = "/voorstellingen-genre")
    public List<Voorstelling> zoekOpGenre(
            @RequestParam(value = "genre") String genre) {
        TypedQuery<Voorstelling> q = em.createQuery(
				"SELECT v FROM Voorstelling v WHERE v.artiest.genre = :genre ORDER BY v.tijdstip.id", Voorstelling.class);
		q.setParameter("genre", genre);
		return q.getResultList();
	}

}