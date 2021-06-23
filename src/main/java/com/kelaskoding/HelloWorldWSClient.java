/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kelaskoding;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;

/**
 *
 * @author jarvis
 */
public class HelloWorldWSClient {
    
    public static void main(String[] args) throws Exception{
        URL url = new URL("http://localhost:8080/ws/hello?wsdl");
        
        QName qname = new QName("http://kelaskoding.com/","HelloWorldWSImplService");
        Service service = Service.create(url, qname);
        HelloWorldWS hello = service.getPort(HelloWorldWS.class);
        System.out.println(hello.sayHello("Hendro Steven"));
    }
}
