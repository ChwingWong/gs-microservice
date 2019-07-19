package com.chwing.gs.ms.feign.web;

import com.chwing.gs.ms.feign.service.BServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Chwing on 2019/7/17.
 */
@RestController
public class BController {

    @Autowired
    BServiceInterface bServiceInterface;

    @GetMapping(value = "/hi")
    public String hi(@RequestParam String name) {
        return bServiceInterface.sayHiFromClientOne( name );
    }
}
