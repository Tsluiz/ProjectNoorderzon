package nl.noorderzon.repositories;

import nl.noorderzon.entities.Voorstelling;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;


@Repository
public interface VoorstellingRepository extends JpaRepository<Voorstelling, Integer> {

}
