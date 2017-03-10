package de.lieferplatz.proxy.feign;

import de.lieferplatz.model.Mandant;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * @author n0mer
 * @since 3/10/17 at 02:21 for lieferplatz-test
 */
@FeignClient("mandants")
public interface MandantClient {

    @RequestMapping(method = RequestMethod.GET, value = "/mandants")
    List<Mandant> mandants();

}
