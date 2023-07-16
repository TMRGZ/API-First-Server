package com.personal.api_first_server.infrastructure.controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cloud.config.server.environment.EnvironmentController;
import org.springframework.cloud.config.server.environment.EnvironmentRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/spec")
public class ApiEnvironmentController extends EnvironmentController {

    private static final String DEFAULT_PROFILE = "default";

    public ApiEnvironmentController(@Qualifier("defaultEnvironmentRepository") EnvironmentRepository repository) {
        super(repository);
    }

    @GetMapping("/{name}")
    public ResponseEntity<String> getApi(@PathVariable String name) throws Exception {
        return super.jsonProperties(name, DEFAULT_PROFILE, true);
    }
}
