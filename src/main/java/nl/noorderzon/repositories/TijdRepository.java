package nl.noorderzon.repositories;

import nl.noorderzon.entities.Tijdstip;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TijdRepository extends JpaRepository<Tijdstip, Integer> {

}
