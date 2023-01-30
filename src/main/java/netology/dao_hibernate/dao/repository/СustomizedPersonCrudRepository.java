package netology.dao_hibernate.dao.repository;

import netology.dao_hibernate.dao.entity.Person;
import netology.dao_hibernate.dao.entity.PersonDataPrimaryKey;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface СustomizedPersonCrudRepository extends JpaRepository<Person, PersonDataPrimaryKey> {
    List<Person> findByCityOfLiving(String city);
    List<Person>findByAgeIsLessThanOrderByAge(int age);
    Optional<Person>findByNameAndSurName(String name, String surname);
}
