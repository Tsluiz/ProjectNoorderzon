package repositories;

import entities.Voorstelling;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface VoorstellingRepository extends CrudRepository<Voorstelling, Integer> {
}
