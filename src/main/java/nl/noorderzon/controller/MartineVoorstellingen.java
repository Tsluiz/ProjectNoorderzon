package nl.noorderzon.controller;

import nl.noorderzon.entities.Voorstelling;
import nl.noorderzon.repositories.VoorstellingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Set;


// CODE VAN TOM: Alternief poging, gevonden op internet. Gebruikt /path ipv /value

@RestController    // This means that this class is a Controller
@RequestMapping("/voorstellingen") // This means URL's start with /demo (after Application path)
public class MartineVoorstellingen{
/*
	@Autowired
	VoorstellingRepository voorstellingRepository;

	private List<Voorstelling> voorstellingen;

	@GetMapping //("/allevoorstellingen") // Map ONLY GET Requests
    public Set<Voorstelling> toonAlleVoorstellingen() {
		return voorstellingRepository.findAll();
	}*/
}

/*@GetMapping("/voorstellingen") // Map ONLY GET Requests
	public List<Voorstelling> toonAlleVoorstellingen(){
		// @ResponseBody means the returned String is the response, not a view name
		// @RequestParam means it is a parameter from the GET or POST request
		voorstellingen = voorstellingRepository.toonAlleVoorstellingen();

		return voorstellingen;
	}*/