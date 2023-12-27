package org.example.leastcostrouting.controller.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class FindRouteRequest {
        private String sourcePersonName;
        private String destinationPersonName;

    }
