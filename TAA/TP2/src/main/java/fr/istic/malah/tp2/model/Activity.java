package fr.istic.malah.tp2.model;

import com.sun.istack.internal.NotNull;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.OneToMany;
import java.util.List;

import static fr.istic.malah.tp2.model.ModelDataDefinition.ACTIVITY_TYPE;
import static fr.istic.malah.tp2.model.ModelDataDefinition.CITIES;
import static fr.istic.malah.tp2.model.ModelDataDefinition.COST;
import static fr.istic.malah.tp2.model.ModelDataDefinition.NAME;

@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Entity
public class Activity extends BaseEntity {

    @NotNull
    @Column(name = NAME)
    private String name;

    @Column(name = COST)
    private Float cost;

    @Enumerated(EnumType.STRING)
    @Column(name = ACTIVITY_TYPE)
    private ActivityType activityType;

    @OneToMany
    @Column(name = CITIES)
    private List<City> cities;
}
