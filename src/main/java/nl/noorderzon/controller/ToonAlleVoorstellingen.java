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

	@RequestMapping(path = "/toonallevoorstellingen")
	public List<Voorstelling> toonallevoorstellingen(
			@RequestParam(value = "id") int id) {

		TypedQuery<Voorstelling> q = em.createQuery(
				"SELECT v FROM Voorstelling v WHERE v.id = :id", Voorstelling.class);
		q.setParameter("id", "naam");
		return q.getResultList();
	}
}
/*	@GetMapping(path="/all")
	public @ResponseBody Iterable<Voorstelling> getAllUsers() {
		// This returns a JSON or XML with the users
		return
	}
}
*/
/*
	@GetMapping("/add") // Map ONLY GET Requests
	public @ResponseBody String addNewArtiest (@RequestParam String name){
		// @ResponseBody means the returned String is the response, not a view name
		// @RequestParam means it is a parameter from the GET or POST request
		voorstellingen = new ArrayList<>();

		return "Saved";
	}*/