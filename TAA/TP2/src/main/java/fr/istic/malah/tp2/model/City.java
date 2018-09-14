package fr.istic.malah.tp2.model;

import com.sun.istack.internal.NotNull;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import static fr.istic.malah.tp2.model.ModelDataDefinition.CITY;
import static fr.istic.malah.tp2.model.ModelDataDefinition.LATITUDE;
import static fr.istic.malah.tp2.model.ModelDataDefinition.LONGITUDE;
import static fr.istic.malah.tp2.model.ModelDataDefinition.NAME;
import static fr.istic.malah.tp2.model.ModelDataDefinition.POSTAL_CODE;

@Data
@Entity
@Table(name = CITY)
public class City extends BaseEntity {

    @NotNull
    @Column(name = NAME)
    private String name;

    @Column(name = POSTAL_CODE)
    private Integer postalCode;

    @Column(name = LONGITUDE)
    private Float longitude;

    @Column(name = LATITUDE)
    private Float latitude;

}
