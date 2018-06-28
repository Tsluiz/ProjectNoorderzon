package repositories;

import entities.Locatie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface LocatieRepository extends JpaRepository<Locatie, Integer> {

}
