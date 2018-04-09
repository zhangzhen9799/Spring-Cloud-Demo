package com.example.eurekaconsumerfeign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DcController {

    @Autowired
    DcClient dcClient;

    @RequestMapping(value="/dc", method = RequestMethod.GET)
    public String dc() {
        return dcClient.consumer();
    }

}
