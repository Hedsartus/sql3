package ru.netology.sql3.service;

import org.springframework.stereotype.Service;
import ru.netology.sql3.model.Person;
import ru.netology.sql3.repository.AppRepository;

import java.util.List;

@Service
public class AppService {
    private final AppRepository repository;

    public AppService(AppRepository repository) {
        this.repository = repository;
    }

    public List<Person> getPersonsByCity(String name) {
        return repository.getPersonsByCity(name);
    }
}
