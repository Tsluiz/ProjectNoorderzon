package nl.noorderzon.repositories;

import nl.noorderzon.entities.Voorstelling;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface VoorstellingRepository extends PagingAndSortingRepository<Voorstelling, Integer> {
    Set<Employee> findByLastName(@Param("name") String name);

	List<Voorstelling> findAll();

}

public interface EmployeeRepository extends PagingAndSortingRepository<Employee, Integer> {
    Set<Employee> findByLastName(@Param("name") String name);

    Employee findFirstByEmail(@Param("email") String email);

    List<Employee> findByJobTitleOrderByHireDate(@Param("job") String job);
}
