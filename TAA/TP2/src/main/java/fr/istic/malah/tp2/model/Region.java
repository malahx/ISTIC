package fr.istic.malah.tp2.model;

import com.sun.istack.internal.NotNull;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;

import static fr.istic.malah.tp2.config.ModelDataDefinition.NAME;

@Data
@Entity
public class Region extends BaseEntity {

    @NotNull
    @Column(name = NAME)
    private String name;

}
