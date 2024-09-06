package application.client;

import application.dto.ServiceRequest;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "service-a")
public interface ServiceAClient {

    @PostMapping("/service-a/data")
    String getDataFromServiceA(@RequestBody ServiceRequest request);

}