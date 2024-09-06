package application.client;

import application.dto.ServiceRequest;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "service-c")
public interface ServiceCClient {

    @PostMapping("/service-c/data")
    String getDataFromServiceC(@RequestBody ServiceRequest request);

}