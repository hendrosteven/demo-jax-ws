/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kelaskoding;

import javax.xml.ws.Endpoint;

/**
 *
 * @author jarvis
 */
public class HelloWorldWSPublisher {
    
    public static void main(String[] args){
        Endpoint.publish("http://localhost:8080/ws/hello", new HelloWorldWSImpl());
    }
}
