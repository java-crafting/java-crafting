package application.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceCController {

    @GetMapping("/info")
    public String info(@RequestParam("requestId") String requestId) {
        return "Service C received request with ID: " + requestId;
    }
}
