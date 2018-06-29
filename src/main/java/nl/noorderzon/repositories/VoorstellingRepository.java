package nl.noorderzon.repositories;


import nl.noorderzon.entities.Voorstelling;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface VoorstellingRepository extends JpaRepository<Voorstelling, Long> {


	List<Voorstelling> findAll();

}


