package de.lieferplatz.model;

import io.swagger.annotations.ApiModel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * @author n0mer
 * @since 3/9/17 at 23:58 for lieferplatz-test
 */
@ApiModel(value = "Mandant", description = "Mandant")
@Entity
@Table(name = "mandants")
public class Mandant implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "mandant_id")
    private Long id;

    @Column(name = "name")
    private String name;

    public Mandant() {
        //JPA-only
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
