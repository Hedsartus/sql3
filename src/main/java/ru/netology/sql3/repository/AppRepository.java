package ru.netology.sql3.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.netology.sql3.model.Person;
import ru.netology.sql3.model.PersonPrimaryKey;

import java.util.List;
import java.util.Optional;

@Repository
public interface AppRepository extends JpaRepository<Person, PersonPrimaryKey> {
    List<Person> findAllByCityOfLiving(String city);

    List<Person> findAllByAgeIsLessThanOrderByAge(int age);

    Optional<Person> findPersonByNameAndSurname(String name, String surname);
//    @Override
//    <S extends Person> S saveAndFlush(S entity);
}
