package application.client;

import application.dto.ServiceRequest;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "service-b")
public interface ServiceBClient {

    @PostMapping("/service-b/data")
    String getDataFromServiceB(@RequestBody ServiceRequest request);

}
