/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kelaskoding;

import javax.jws.WebService;

/**
 *
 * @author jarvis
 */
@WebService(endpointInterface = "com.kelaskoding.HelloWorldWS")
public class HelloWorldWSImpl implements HelloWorldWS{

    @Override
    public String sayHello(String name) {
        return "Hello "+ name +" welcome to JAX-WS!";
    }
    
}
