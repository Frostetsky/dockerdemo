package docker.demo.app.controller;

import docker.demo.app.dto.rs.BasicResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class HealthController {

    @GetMapping("/health")
    public BasicResponse health() {
        log.info("HealthCheck process...");
        return new BasicResponse("OK");
    }
}
