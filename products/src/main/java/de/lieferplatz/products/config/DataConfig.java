package de.lieferplatz.products.config;

import de.lieferplatz.model.Product;
import de.lieferplatz.model.ProductRepository;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * @author n0mer
 * @since 3/10/17 at 00:07 for lieferplatz-test
 */
@Configuration
@EntityScan(basePackageClasses = {
        Product.class
})
@EnableJpaRepositories(basePackageClasses = {
        ProductRepository.class
})
public class DataConfig {
}
