package nl.noorderzon.repositories;

import nl.noorderzon.entities.Artiest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface ArtiestRepository extends CrudRepository<Artiest, Integer> {

	Artiest zoekArtiest(String naam);
	Artiest getVoorstellingenVanArtiest();

}
