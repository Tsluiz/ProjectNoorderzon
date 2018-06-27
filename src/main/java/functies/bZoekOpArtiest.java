package functies;

import org.springframework.web.bind.annotation.*;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@RestController
@CrossOrigin
public class bZoekOpArtiest{

	@PersistenceContext
	private EntityManager em;

	@RequestMapping(value = "/aZoekOpArtiest")
	public bZoekOpArtiest aZoekArtiest(
			@RequestParam(value = "naam") String naam) {
		return new aZoekOpArtiest(naam);
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
