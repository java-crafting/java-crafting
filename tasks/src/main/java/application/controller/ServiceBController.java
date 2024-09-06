package application.controller;

import application.dto.ServiceRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service-b")
public class ServiceBController {

    @PostMapping("/data")
    public String getData(@RequestBody ServiceRequest request) {
        return "Data from Service B with ID: " + request.getId() + " and requestId: " + request.getRequestId();
    }
}
