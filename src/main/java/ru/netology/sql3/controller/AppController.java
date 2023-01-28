package ru.netology.sql3.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.sql3.model.Person;
import ru.netology.sql3.service.AppService;

import java.util.List;

@RestController
public class AppController {
    private final AppService service;

    public AppController(AppService service) {
        this.service = service;
    }

    @GetMapping("/persons/by-city")
    public List<Person> getPersonsByCity(@RequestParam("city") String city) {
        return service.getPersonsByCity(city);
    }
}
