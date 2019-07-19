package com.chwing.gs.ms.a.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Chwing on 2019/7/17.
 */
@RestController
public class AController {

    @Value("${server.port}")
    String port;

    @GetMapping(value = "/hi")
    public String hi(@RequestParam String name) {
        return "hi " + name + " ,i am from port:" + port;
    }

}
