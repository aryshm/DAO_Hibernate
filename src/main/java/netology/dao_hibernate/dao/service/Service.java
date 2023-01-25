package netology.dao_hibernate.dao.service;

import netology.dao_hibernate.dao.repository.Repository;

import java.util.List;
@org.springframework.stereotype.Service
public class Service {
    Repository repository;

    public Service(Repository repository) {
        this.repository = repository;
    }

    public List<String> getPersonsByCity(String city) {
        return repository.getPersonsByCity(city);
    }
}
