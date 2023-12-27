package org.example.leastcostrouting.service;

import org.example.leastcostrouting.exception.LeastCostRouteException;
import org.example.leastcostrouting.model.LeastCostRoute;
import org.example.leastcostrouting.service.impl.LeastCostRoutingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;

import java.io.IOException;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class LeastCostRoutingServiceImplTest {

    @Mock
    private ResourceLoader resourceLoader;

    @Mock
    private Resource resource;

    @InjectMocks
    private LeastCostRoutingServiceImpl routingService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void findLeastCostRoute_ValidInput_Success() throws LeastCostRouteException, IOException {
        // Mock data for testing
        when(resourceLoader.getResource(anyString())).thenReturn(resource);
        when(resource.getInputStream()).thenReturn(getInputStream("Person.csv"), getInputStream("Route.csv"),
                getInputStream("NetworkElement.csv"), getInputStream("Link.csv"), getInputStream("Network.csv"));

        LeastCostRoute result = routingService.findLeastCostRoute("PersonA", "PersonB");

        assertNotNull(result);
        assertEquals("NE7->NE8", result.getRoute());
    }

    private InputStream getInputStream(String fileName) {
        return getClass().getClassLoader().getResourceAsStream("data/" + fileName);
    }
}
