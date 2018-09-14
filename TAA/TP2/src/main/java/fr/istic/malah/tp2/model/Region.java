package fr.istic.malah.tp2.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import static fr.istic.malah.tp2.config.ModelDataDefinition.NAME;
import static fr.istic.malah.tp2.config.ModelDataDefinition.REGION;

@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Entity
@Table(name = REGION)
public class Region extends BaseEntity {

    @Column(name = NAME)
    private String name;

}
