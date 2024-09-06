package application.controller;

import application.dto.ServiceRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service-c")
public class ServiceCController {

    @PostMapping("/process")
    public String processRequest(@RequestBody ServiceRequest request) {
        String id = request.getId();
        String requestId = request.getRequestId();
        return "Processed data from Service C with ID: " + id + " and requestId: " + requestId;
    }
}
