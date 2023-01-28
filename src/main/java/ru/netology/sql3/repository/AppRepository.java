package ru.netology.sql3.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import ru.netology.sql3.model.Person;

import java.util.List;

@Repository
public class AppRepository {
    @PersistenceContext
    private EntityManager manager;

    public List<Person> getPersonsByCity(String city) {
        return manager.createQuery(
                        "SELECT p FROM Person p " +
                                "WHERE LOWER(p.cityOfLiving) = LOWER(:city)",
                        Person.class)
                .setParameter("city", city)
                .getResultList();
    }

}
