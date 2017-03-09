package de.lieferplatz.model;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author n0mer
 * @since 3/9/17 at 23:53 for lieferplatz-test
 */
public interface ProductRepository extends JpaRepository<Product, Long> {

    List<Product> findByMandantId(Long mandantId);
}
