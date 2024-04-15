package com.satya;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Hello world!
 *
 */
@Configuration
@ComponentScan(basePackages = "com.satya")
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }
}
