package de.lieferplatz.products.controller;

import de.lieferplatz.model.Product;
import de.lieferplatz.model.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author n0mer
 * @since 3/10/17 at 00:01 for lieferplatz-test
 */
@RestController
@RequestMapping(value = {"/products"}, produces = MediaType.APPLICATION_JSON_VALUE)
public class ProductsController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping(value = "/byMandantId/{mandantId}")
    public List<Product> productsByMandant(@PathVariable Long mandantId) {
        return productRepository.findByMandantId(mandantId);
    }
}
