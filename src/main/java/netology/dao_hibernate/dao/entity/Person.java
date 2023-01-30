package netology.dao_hibernate.dao.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "persons")
@IdClass(PersonDataPrimaryKey.class)
@Entity
public class Person {

    @Id
    @Column(name="name")
    private String name;

    @Id
    @Column(name="surname")
    private String surName;

    @Id
    @Column(name="age")
    private int age;

    @Column(name="phone_number")
    private String phoneNumber;

    @Column(name="city_of_living")
    private String cityOfLiving;

}
