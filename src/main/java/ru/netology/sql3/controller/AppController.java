package ru.netology.sql3.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.sql3.model.Person;
import ru.netology.sql3.service.AppService;

import java.util.List;
import java.util.Optional;

@RestController
public class AppController {
    private final AppService service;

    public AppController(AppService service) {
        this.service = service;
    }

    @GetMapping("/")
    public String getMain() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("<a href='http://localhost:8080/persons/by-city?city=Москва'>");
        stringBuilder.append("метод, который будет принимать название города(city) и возвращать " +
                "Entity из базы данных, которые соответствуют этому city.");
        stringBuilder.append("</a></br>");

        stringBuilder.append("<a href='http://localhost:8080/persons/by-age-less?age=27'>");
        stringBuilder.append("метод, который будет принимать возраст(age) и возвращать Entity из " +
                "базы данных, которые меньше переданного age и отсортированы по возрастанию.");
        stringBuilder.append("</a></br>");

        stringBuilder.append("<a href='http://localhost:8080/persons/by-name-and-surname?name=Данил&surname=Сергеев'>");
        stringBuilder.append("метод, который будет принимать имя и фамилию(name и surname) " +
                "и возвращать Entity из базы данных, которые соответствуют сочетанию name и " +
                "surname и является Optional.");
        stringBuilder.append("</a></br>");

        return stringBuilder.toString();
    }

    @GetMapping("/persons/by-city")
    public List<Person> getPersonsByCity(@RequestParam("city") String city) {
        return service.findAllByCityOfLiving(city);
    }

    @GetMapping("/persons/by-age-less")
    public List<Person> findAllByAgeIsLessThanOrderByAge(@RequestParam("age") int age) {
        return service.findAllByAgeIsLessThanOrderByAge(age);
    }

    @GetMapping("/persons/by-name-and-surname")
    public Optional<Person> findPersonByNameAndSurname(@RequestParam("name") String name,
                                                       @RequestParam("surname") String surname) {
        return service.findPersonByNameAndSurname(name, surname);
    }
}
