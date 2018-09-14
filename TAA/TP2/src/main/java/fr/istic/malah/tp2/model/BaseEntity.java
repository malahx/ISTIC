package fr.istic.malah.tp2.model;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

import static fr.istic.malah.tp2.model.ModelDataDefinition.CREATED_AT;
import static fr.istic.malah.tp2.model.ModelDataDefinition.UPDATED_AT;

@MappedSuperclass
public abstract class BaseEntity {

    @Id
    @GeneratedValue
    private Long id;

    @Temporal(TemporalType.TIMESTAMP)
    @CreationTimestamp
    @Column(name = CREATED_AT)
    private Date createAt;

    @Temporal(TemporalType.TIMESTAMP)
    @UpdateTimestamp
    @Column(name = UPDATED_AT)
    private Date updateAt;
}
