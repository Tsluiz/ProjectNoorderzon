package nl.noorderzon.controller;

import nl.noorderzon.entities.Voorstelling;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@RestController
public class ZoekOpVoorstellingNaam {

    @PersistenceContext
    private EntityManager em;

    @RequestMapping(value = "/voorstellingen")
    public List<Voorstelling> zoekOpArtiest(
            @RequestParam(value = "naam") String naam) {
        TypedQuery<Voorstelling> q = em.createQuery(
                "SELECT v FROM Voorstelling v WHERE v.artiest.naamVoorstelling LIKE :voorstellingnaam", Voorstelling.class);
        q.setParameter("voorstellingnaam", naam);

        return q.getResultList();
    }

}
