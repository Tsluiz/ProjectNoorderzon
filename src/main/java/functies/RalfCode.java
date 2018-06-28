package functies;

import controller.Controller;
import entities.Artiest;
import entities.Voorstelling;
import org.springframework.web.bind.annotation.*;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@RestController
@CrossOrigin
public class RalfCode {

	@PersistenceContext
	private EntityManager em;

	@RequestMapping("/controller")
	public Controller database(@RequestParam(value = "ZoekOpArtiest") int a, @RequestParam("b") int b) {
		return new Controller(a, b);
	}

	@RequestMapping(value = "/toonAlleVoorstellingen")
	public Voorstelling zoekVoorstellingBijNaam(
			@RequestParam(value = "voorstelling") String naam) {
		return zoekVoorstellingBijNaam(naam);
	}

	@RequestMapping(value = "/zoekOpArtiest")
	public Artiest zoekOpArtiest(
			@RequestParam(value = "artiest") String naam) {
	return zoekOpArtiest(naam);
	}

}

	/*
	private final voorstellingService voorstellingService;

	@Autowired
	public Controller( VoorstellingService userService) {
		this.programService = programService;
	}


	@RequestMapping(value = "/hello")
	public User hello(
			@RequestParam(value = "name") String name) {
		List<Program> programList = programService.findAll();
		String password;
		for (Program program:programList) {
			if (user.getProgramName().toLowerCase().equals(name)) {
				return user;
			}
		}

		return null;
	}



	@PostMapping(value = "/add", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<Program> add(
			@Valid @RequestBody Program program) {
		return new ResponseEntity<Program>(programService.save(program),HttpStatus.CREATED);
	}

	@DeleteMapping("/program/{id}")
	@ResponseBody
	public ResponseEntity<String> del(@PathVariable("id") int id) {

		try {
			programService.deleteById(id);
			return ResponseEntity.status(HttpStatus.OK).body("DELETE Success!");
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
		}
	}

}
