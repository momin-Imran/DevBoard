package com.devboard.health;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.Map;

// Simple health check controller

@RestController
public class HealthController {
    @GetMapping("/api/health") // Endpoint to check the health of the application
    public Map<String, Object> health() {
        return Map.of("status", "ok", "service", "backend-core");
    }
}
