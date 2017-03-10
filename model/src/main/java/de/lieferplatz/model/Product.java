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
 * @since 3/9/17 at 23:23 for lieferplatz-test
 */
@ApiModel(value = "Product", description = "Product")
@Entity
@Table(name = "products")
public class Product implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "product_id")
    private Long id;

    @Column(name = "mandant_id")
    private Long mandantId;

    @Column(name = "text")
    private String text;

    public Product() {
        //empty c-tor for JPA
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getMandantId() {
        return mandantId;
    }

    public void setMandantId(Long mandantId) {
        this.mandantId = mandantId;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
