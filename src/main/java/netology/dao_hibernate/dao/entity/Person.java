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
@Entity
public class Person {

    @EmbeddedId
    private PersonDataPrimaryKey data;

    private int phone_number;
    private String city_of_living;

}
