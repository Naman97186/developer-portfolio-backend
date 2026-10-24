
package com.namancreativity.portfolio.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/projects")
public class ProjectController {

    @GetMapping
    public List<Map<String, Object>> getProjects() {
        return List.of(
            Map.of(
                "id", 1,
                "title", "Developer Portfolio",
                "description", "My personal developer portfolio",
                "techStack", List.of("Java", "Spring Boot", "Next.js"),
                "featured", true
            )
        );
    }
}
