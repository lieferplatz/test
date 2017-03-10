package de.lieferplatz.proxy.controller;

import de.lieferplatz.model.Mandant;
import de.lieferplatz.model.Product;
import de.lieferplatz.proxy.service.LieferplatzService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author n0mer
 * @since 3/10/17 at 02:26 for lieferplatz-test
 */
@RestController
public class LieferplatzController {

    @Autowired
    private LieferplatzService service;

    @RequestMapping(method = RequestMethod.GET, path = "/products/byMandantId/{mandantId}")
    public List<Product> productsByMandantId(@PathVariable Long mandantId) {
        return service.products(mandantId);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/mandants")
    public List<Mandant> mandants() {
        return service.mandants();
    }
}
