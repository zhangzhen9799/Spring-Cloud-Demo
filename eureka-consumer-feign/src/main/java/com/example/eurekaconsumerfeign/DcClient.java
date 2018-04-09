package com.example.eurekaconsumerfeign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Service
@FeignClient("eureka-client")
public interface DcClient {

    @RequestMapping(value="/dc", method = RequestMethod.GET)
    String consumer();

}
