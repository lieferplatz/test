package de.lieferplatz.mandants.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author n0mer
 * @since 3/10/17 at 01:23 for lieferplatz-test
 */
@RestController
@RequestMapping(value = "/meta")
public class MetadataController {

    @Autowired
    private DiscoveryClient discoveryClient;

    @RequestMapping("/byServiceId/{serviceId}")
    public List<ServiceInstance> serviceInstances(@PathVariable String serviceId) {

        // Get all ServiceInstances associated with a particular serviceId
        return this.discoveryClient.getInstances(serviceId);
    }

}
