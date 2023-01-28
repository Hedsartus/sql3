package ru.netology.sql3.model;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name = "persons", schema = "netology")
@Getter
@Setter
public class Person {
    @EmbeddedId
    PersonPrimaryKey personPrimaryKey;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "city_of_living")
    private String cityOfLiving;
}
