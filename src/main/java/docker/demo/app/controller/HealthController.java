package docker.demo.app.controller;

import docker.demo.app.dto.rs.BasicResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

    @GetMapping("/health")
    public BasicResponse health() {
        return new BasicResponse("OK");
    }
}
