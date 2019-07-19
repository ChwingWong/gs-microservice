package com.chwing.gs.ms.feign.service;

import org.springframework.stereotype.Component;

/**
 * Created by Chwing on 2019/7/17.
 */
@Component
public class BServiceInterfaceImpl implements BServiceInterface {
    @Override
    public String sayHiFromClientOne(String name) {
        return "Unable to provide service!";
    }
}
