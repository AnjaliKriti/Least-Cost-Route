package org.example.leastcostrouting.controller;

import io.micrometer.common.util.StringUtils;
import org.example.leastcostrouting.controller.request.FindRouteRequest;
import org.example.leastcostrouting.exception.LeastCostRouteException;
import org.example.leastcostrouting.model.ErrorResponse;
import org.example.leastcostrouting.model.LeastCostRoute;
import org.example.leastcostrouting.model.Route;
import org.example.leastcostrouting.service.LeastCostRoutingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequestMapping("/least-cost-routing")
public class LeastCostRoutingController {

    @Autowired
    private LeastCostRoutingService leastCostRoutingService;


    @PostMapping("/find-route")
    public ResponseEntity<?> findLeastCostRoute(@RequestBody FindRouteRequest request) {
        try {
            if (StringUtils.isEmpty(request.getSourcePersonName()) || StringUtils.isEmpty(request.getDestinationPersonName())) {
                return new ResponseEntity<>(new ErrorResponse("Both sourcePersonName and destinationPersonName are required."), HttpStatus.BAD_REQUEST);
            }

            LeastCostRoute leastCostRoute = leastCostRoutingService.findLeastCostRoute(request.getSourcePersonName(), request.getDestinationPersonName());
            return new ResponseEntity<>(leastCostRoute, HttpStatus.OK);
        } catch (LeastCostRouteException e) {
            return new ResponseEntity<>(new ErrorResponse(e.getMessage()), HttpStatus.BAD_REQUEST);
        } catch (IOException e) {
            return new ResponseEntity<>(new ErrorResponse("Error reading data."), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}