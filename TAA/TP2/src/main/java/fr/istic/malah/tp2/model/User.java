package fr.istic.malah.tp2.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import static fr.istic.malah.tp2.config.DAODataDefinition.FIRST_NAME;
import static fr.istic.malah.tp2.config.DAODataDefinition.LAST_NAME;
import static fr.istic.malah.tp2.config.DAODataDefinition.USER;

@Data
@EqualsAndHashCode(callSuper = true, exclude = {"firstName", "lastName"})
@ToString(callSuper = true)
@Entity
@Table(name = USER)
public class User extends BaseEntity {

    @Column(name = FIRST_NAME)
    private String firstName;

    @Column(name = LAST_NAME)
    private String lastName;

    @ManyToOne
    private City city;
}
