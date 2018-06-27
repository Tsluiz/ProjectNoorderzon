package repositories;

import entities.Tijd;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TijdRepository extends JpaRepository<Tijd, Integer> {

}
