package fr.istic.malah.tp2.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import static fr.istic.malah.tp2.config.DAODataDefinition.CITY;
import static fr.istic.malah.tp2.config.DAODataDefinition.LATITUDE;
import static fr.istic.malah.tp2.config.DAODataDefinition.LONGITUDE;
import static fr.istic.malah.tp2.config.DAODataDefinition.NAME;
import static fr.istic.malah.tp2.config.DAODataDefinition.POSTAL_CODE;

@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Entity
@Table(name = CITY)
public class City extends BaseEntity {

    @Column(name = NAME)
    private String name;

    @Column(name = POSTAL_CODE)
    private Integer postalCode;

    @Column(name = LONGITUDE)
    private Float longitude;

    @Column(name = LATITUDE)
    private Float latitude;

}
