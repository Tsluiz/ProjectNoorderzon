package nl.noorderzon.controller;

import nl.noorderzon.entities.Artiest;
import nl.noorderzon.repositories.ArtiestRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller    // This means that this class is a Controller
@RequestMapping(path="/demo") // This means URL's start with /demo (after Application path)
public class ControllerArtiest{

	private ArtiestRepository artiestRepository;

	@GetMapping(path="/add") // Map ONLY GET Requests
	public @ResponseBody String addNewArtiest (@RequestParam String name){
		// @ResponseBody means the returned String is the response, not a view name
		// @RequestParam means it is a parameter from the GET or POST request

		Artiest n = new Artiest();
		n.setNaam(name);
		artiestRepository.save(n);
		return "Saved";
	}

}