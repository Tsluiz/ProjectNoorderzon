package nl.noorderzon.controller;

import nl.noorderzon.entities.Voorstelling;
import nl.noorderzon.repositories.VoorstellingRepository;
import org.springframework.web.bind.annotation.*;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@RestController
public class ToonAlleVoorstellingen {

	@PersistenceContext
	private EntityManager em;

	@RequestMapping(path= "/toonallevoorstellingen")
	public List<Voorstelling> toonallevoorstellingen(
			@RequestParam(value = "id") int id) {

		TypedQuery<Voorstelling> q = em.createQuery(
				"SELECT v FROM Voorstelling v WHERE v.id = :id", Voorstelling.class);
		q.setParameter("id", "naam");
		return q.getResultList();
	}

	@GetMapping(path="/all")
	public @ResponseBody Iterable<Voorstelling> getAllUsers() {
		// This returns a JSON or XML with the users
		return VoorstellingRepository.findAll();
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