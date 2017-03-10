package de.lieferplatz.proxy.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author n0mer
 * @since 3/10/17 at 02:53 for lieferplatz-test
 */
@RestController
@RequestMapping(path = "/debug")
public class DebugController {

    private static final Logger logger = LoggerFactory.getLogger(DebugController.class);

    @Autowired
    private DiscoveryClient discoveryClient;

    @RequestMapping(method = RequestMethod.GET, path = "/products")
    public List<ServiceInstance> products() {

        final List<ServiceInstance> serviceInstances = discoveryClient.getInstances("products");

        logger.debug("found [{}] service instances for [{}] service", serviceInstances.size(), "products");

        return serviceInstances;
    }

    @RequestMapping(method = RequestMethod.GET, path = "/mandants")
    public List<ServiceInstance> mandants() {
        final List<ServiceInstance> serviceInstances = discoveryClient.getInstances("mandants");

        logger.debug("found [{}] service instances for [{}] service", serviceInstances.size(), "mandants");

        return serviceInstances;
    }

}
