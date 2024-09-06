package application.controller;

import application.client.ServiceBClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class ServiceAController {

    private final ServiceBClient serviceBClient;

    public ServiceAController(ServiceBClient serviceBClient) {
        this.serviceBClient = serviceBClient;
    }

    @GetMapping("/send")
    public String sendToServiceB() {
        String requestId = UUID.randomUUID().toString();
        return serviceBClient.process(requestId);
    }
}
