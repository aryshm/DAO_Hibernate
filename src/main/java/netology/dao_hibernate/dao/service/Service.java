package netology.dao_hibernate.dao.service;

import netology.dao_hibernate.dao.entity.Person;
import netology.dao_hibernate.dao.repository.СustomizedPersonCrudRepository;

import java.util.List;
import java.util.Optional;

@org.springframework.stereotype.Service
public class Service {
    СustomizedPersonCrudRepository repository;

    public Service(СustomizedPersonCrudRepository repository) {
        this.repository = repository;
    }

    public List<Person> getPersonsByCity(String city) {
        return repository.findByCityOfLiving(city);
    }

    public List<Person> getPersonsByAgeLessThanOrderBy(int age) {
        return repository.findByAgeIsLessThanOrderByAge(age);
    }

    public Optional<Person> getPersonByNameAndSurname(String name, String surname) {
        return repository.findByNameAndSurName(name, surname);
    }

    public Person save(Person person) {
        return repository.save(person);
    }

    public Long count() {
        return repository.count();
    }

    public void deleteAllPersons(List<Person> personList) {
        repository.deleteAll(personList);
    }
}
