package fr.istic.malah.tp2.model;

import com.sun.istack.internal.NotNull;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;

import static fr.istic.malah.tp2.model.ModelDataDefinition.CODE;
import static fr.istic.malah.tp2.model.ModelDataDefinition.NAME;

@Data
@Entity
public class Department extends BaseEntity {

    @NotNull
    @Column(name = NAME)
    private String name;

    @Column(name = CODE)
    private String code;
}
