package fr.istic.malah.tp2.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

import static fr.istic.malah.tp2.config.DAODataDefinition.ACTIVITY;
import static fr.istic.malah.tp2.config.DAODataDefinition.ACTIVITY_TYPE;
import static fr.istic.malah.tp2.config.DAODataDefinition.CITIES;
import static fr.istic.malah.tp2.config.DAODataDefinition.COST;
import static fr.istic.malah.tp2.config.DAODataDefinition.NAME;
import static fr.istic.malah.tp2.config.DAODataDefinition.OUT_DOOR;

@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Entity
@Table(name = ACTIVITY)
public class Activity extends BaseEntity {

    @Column(name = NAME)
    private String name;

    @Column(name = COST)
    private Float cost;

    @Column(name = OUT_DOOR)
    private boolean outDoor;

    @Enumerated(EnumType.STRING)
    @Column(name = ACTIVITY_TYPE)
    private ActivityType activityType;

    @OneToMany
    @Column(name = CITIES)
    private List<City> cities;
}
