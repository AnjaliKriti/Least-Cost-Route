package org.example.leastcostrouting.service;

import org.example.leastcostrouting.exception.LeastCostRouteException;
import org.example.leastcostrouting.model.LeastCostRoute;

import java.io.IOException;

public interface LeastCostRoutingService {
    LeastCostRoute findLeastCostRoute(String sourcePersonName, String destinationPersonName) throws IOException, LeastCostRouteException;

}
