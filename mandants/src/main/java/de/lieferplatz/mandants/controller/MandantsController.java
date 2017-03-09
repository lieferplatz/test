package de.lieferplatz.mandants.controller;

import de.lieferplatz.model.Mandant;
import de.lieferplatz.model.MandantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author n0mer
 * @since 3/10/17 at 00:01 for lieferplatz-test
 */
@RestController
@RequestMapping(value = {"/mandants"}, produces = MediaType.APPLICATION_JSON_VALUE)
public class MandantsController {

    @Autowired
    private MandantRepository mandantRepository;

    @GetMapping
    public List<Mandant> mandants() {
        return mandantRepository.findAll();
    }
}
