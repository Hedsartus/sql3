package ru.netology.sql3.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ru.netology.sql3.model.Person;
import ru.netology.sql3.model.PersonPrimaryKey;

import java.util.List;
import java.util.Optional;

@Repository
public interface AppRepository extends JpaRepository<Person, PersonPrimaryKey> {
    @Query("SELECT p FROM Person p WHERE LOWER(p.cityOfLiving) = LOWER(:city)")
    List<Person> findAllByCityOfLiving(String city);

    @Query("SELECT p FROM Person p WHERE p.age < :age ORDER BY p.age")
    List<Person> findAllByAgeIsLessThanOrderByAge(int age);

    @Query("SELECT p FROM Person p WHERE LOWER(p.name) = LOWER(:name) AND LOWER(p.surname) = LOWER(:surname)")
    Optional<Person> findPersonByNameAndSurname(String name, String surname);


}
