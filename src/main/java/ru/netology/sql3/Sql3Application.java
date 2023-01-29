package ru.netology.sql3;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.netology.sql3.model.Person;
import ru.netology.sql3.repository.AppRepository;

@SpringBootApplication
public class Sql3Application implements CommandLineRunner {
    private final AppRepository repository;

    public Sql3Application(AppRepository repository) {
        this.repository = repository;
    }

    public static void main(String[] args) {
        SpringApplication.run(Sql3Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        this.repository.saveAndFlush(
                new Person("Кристина", "Маркова", 17,
                        "312342", "Москва"));

        this.repository.saveAndFlush(
                new Person("Данил", "Сергеев", 25,
                        "1123656", "Тула"));

        this.repository.saveAndFlush(
                new Person("Елизавета", "Абрамова", 55,
                        "67788789", "Москва"));
    }
}
