package fr.istic.malah.tp2.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import static fr.istic.malah.tp2.config.ModelDataDefinition.FIRST_NAME;
import static fr.istic.malah.tp2.config.ModelDataDefinition.LAST_NAME;
import static fr.istic.malah.tp2.config.ModelDataDefinition.PERSON;

@Data
@EqualsAndHashCode(callSuper = true, exclude = {"firstName", "lastName"})
@ToString(callSuper = true)
@Entity
@Table(name = PERSON)
public class Person extends BaseEntity {

    @Column(name = FIRST_NAME)
    private String firstName;

    @Column(name = LAST_NAME)
    private String lastName;

    @ManyToOne
    private City city;
}
