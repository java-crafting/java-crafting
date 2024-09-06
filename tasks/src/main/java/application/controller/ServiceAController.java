package application.controller;

import application.client.ServiceBClient;
import application.dto.ServiceRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/service-a")
public class ServiceAController {

    @Autowired
    private ServiceBClient serviceBClient;

    @GetMapping("/call-service-b/{id}")
    public String callServiceB(@PathVariable String id) {
        String requestId = UUID.randomUUID().toString();
        ServiceRequest request = new ServiceRequest(id, requestId);
        return serviceBClient.getDataFromServiceB(request);
    }
}
