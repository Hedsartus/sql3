package ru.netology.sql3.service;

import org.springframework.stereotype.Service;
import ru.netology.sql3.model.Person;
import ru.netology.sql3.repository.AppRepository;

import java.util.List;
import java.util.Optional;

@Service
public class AppService {
    private final AppRepository repository;

    public AppService(AppRepository repository) {
        this.repository = repository;
    }

    public List<Person> findAllByCityOfLiving(String name) {
        return repository.findAllByCityOfLiving(name);
    }

    public List<Person> findAllByAgeIsLessThanOrderByAge(int age) {
        return this.repository.findAllByAgeIsLessThanOrderByAge(age);
    }

    public Optional<Person> findPersonByNameAndSurname(String name, String surname) {
        return this.repository.findPersonByNameAndSurname(name, surname);
    }
}
