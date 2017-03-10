package de.lieferplatz.proxy.service;

import de.lieferplatz.model.Mandant;
import de.lieferplatz.model.Product;
import de.lieferplatz.proxy.feign.MandantClient;
import de.lieferplatz.proxy.feign.ProductClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author n0mer
 * @since 3/10/17 at 02:24 for lieferplatz-test
 */
@Service
public class LieferplatzService {

    @Autowired
    private MandantClient mandantClient;

    @Autowired
    private ProductClient productClient;

    public List<Product> products(Long mandantId) {
        return productClient.productsByMandantId(mandantId);
    }

    public List<Mandant> mandants() {
        return mandantClient.mandants();
    }

}
