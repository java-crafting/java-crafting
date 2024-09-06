package application.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceBController {

    @GetMapping("/process")
    public String process(@RequestParam("requestId") String requestId) {
        return "Processed request with ID: " + requestId;
    }
}
