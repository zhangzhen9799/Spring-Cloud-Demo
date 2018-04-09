package com.example.eurekaconsumerribbonhystrix;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DcController {

    @Autowired
    ConsumerService consumerService;

    @RequestMapping(value = "/consumer", method = RequestMethod.GET)
    public String dc() {
        return consumerService.consumer();
    }

}
