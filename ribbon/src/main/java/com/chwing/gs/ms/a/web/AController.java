package com.chwing.gs.ms.a.web;

import com.chwing.gs.ms.a.service.AService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Chwing on 2019/7/17.
 */
@RestController
public class AController {

    @Autowired
    private AService aService;



    @GetMapping(value = "/hi")
    public String hi(@RequestParam String name) {
        return aService.hiService( name );
    }

}
