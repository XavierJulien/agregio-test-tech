package com.example.agregiotest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.example.agregiotest.infrastructure.adapter.api.controller.OffreController;
import com.example.agregiotest.infrastructure.adapter.api.controller.ParcController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ApplicationTests {
    
    @Autowired
    private ParcController parcController;
    @Autowired
    private OffreController offreController;
    
    @Test
    void contextLoads() {
        assertNotNull(parcController);
        assertNotNull(offreController);
    }
}

