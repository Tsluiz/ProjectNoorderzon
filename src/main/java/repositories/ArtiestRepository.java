package repositories;

import entities.Artiest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ArtiestRepository extends JpaRepository<Artiest, Integer> {

	Artiest findArtiestByNaam(String naam);
}
