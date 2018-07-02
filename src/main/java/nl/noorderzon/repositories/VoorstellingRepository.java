package nl.noorderzon.repositories;

import nl.noorderzon.entities.Voorstelling;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;


@Repository
public interface VoorstellingRepository extends JpaRepository<Voorstelling, Integer> {
    Set<Voorstelling> findVoorstellingByArtiest_Naam(@Param("artiest") String naam);
    //(@Param("artiestNaam") String artiestNaam);

    Set<Voorstelling> findVoorstellingByArtiest_NaamVoorstelling(@Param("naam") String name);

    Set<Voorstelling> findVoorstellingByArtiest_Genre(@Param("genre") String genre);

    //   List<Voorstelling> findAll();

}
