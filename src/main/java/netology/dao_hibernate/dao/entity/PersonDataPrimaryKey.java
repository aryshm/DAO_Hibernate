package netology.dao_hibernate.dao.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;

import java.io.Serializable;
@Data
@Embeddable
public class PersonDataPrimaryKey implements Serializable {

    private String name;
    private String surname;
    private int age;
}
