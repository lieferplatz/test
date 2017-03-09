package de.lieferplatz.mandants.config;

import de.lieferplatz.model.Mandant;
import de.lieferplatz.model.MandantRepository;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * @author n0mer
 * @since 3/10/17 at 00:22 for lieferplatz-test
 */
@Configuration
@EntityScan(basePackageClasses = {
        Mandant.class
})
@EnableJpaRepositories(basePackageClasses = {
        MandantRepository.class
})
public class DataConfig {
}
