package de.lieferplatz.proxy.config;

import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

/**
 * @author n0mer
 * @since 3/10/17 at 02:13 for lieferplatz-test
 */
@Configuration
@EnableFeignClients(basePackages = {"de.lieferplatz.proxy.feign"})
public class FeignConfig {
}
