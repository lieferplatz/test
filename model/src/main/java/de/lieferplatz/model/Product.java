package de.lieferplatz.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Version;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @author n0mer
 * @since 3/9/17 at 23:23 for lieferplatz-test
 */
@ApiModel(value = "Product", description = "Product")
@Entity
@Table(name = "products")
@EntityListeners(AuditingEntityListener.class)
public class Product implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "product_id")
    private Long id;

    @ApiModelProperty(readOnly = true)
    @Version
    private Integer version;

    @ApiModelProperty(readOnly = true)
    @CreatedDate
    @Column(name = "created_at", length = 3)
    private LocalDateTime createdAt;

    @ApiModelProperty(readOnly = true)
    @LastModifiedDate
    @Column(name = "last_modified_at", length = 3)
    private LocalDateTime lastModifiedAt;

    @Column(name = "mandant_id")
    private Long mandantId;

    private String text;

    public Product() {
        //empty c-tor for JPA
    }


}
