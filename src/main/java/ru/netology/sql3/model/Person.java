package ru.netology.sql3.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;



@Entity
@Table(name = "persons", schema = "netology")
@Getter
@Setter
@RequiredArgsConstructor
@AllArgsConstructor
@IdClass(PersonPrimaryKey.class)
public class Person {
    @Id
    @Column(name = "name", nullable = false, length = 50)
    private String name;

    @Id
    @Column(name = "surname", nullable = false, length = 50)
    private String surname;

    @Id
    @Column(name = "age", nullable = false)
    private int age;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "city_of_living")
    private String cityOfLiving;
}
