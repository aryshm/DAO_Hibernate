package netology.dao_hibernate.dao.controller;

import netology.dao_hibernate.dao.service.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class Controller {

    Service service;

    public Controller(Service service) {
        this.service = service;
    }

    @GetMapping("/persons/by-city")
    @ResponseBody
    public List<String> getPersonsByCity(@RequestParam String city) {
        return service.getPersonsByCity(city);
    }
}
