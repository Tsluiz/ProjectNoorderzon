package nl.noorderzon.controller;

import nl.noorderzon.entities.Voorstelling;
import nl.noorderzon.repositories.VoorstellingRepository;
import org.springframework.web.bind.annotation.*;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

// Concept code;  combinatie van code van Controller en gevonden op internet

@RestController
public class ToonAlleVoorstellingen {

	@PersistenceContext
	private EntityManager em;

	@RequestMapping(path = "/voorstellingen")
    public List<Voorstelling> allevoorstellingen() {

		TypedQuery<Voorstelling> q = em.createQuery(
                "SELECT v FROM Voorstelling v ORDER BY v.tijdstip.id", Voorstelling.class);
		return q.getResultList();
	}
}
