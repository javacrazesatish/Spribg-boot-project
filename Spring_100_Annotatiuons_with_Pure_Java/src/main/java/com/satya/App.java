package com.satya;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.satya.service.WishMsg;

/**
 * Hello world!
 *
 */

@SpringBootApplication
@ComponentScan(basePackages = "com.satya.service")
public class App 
{
    public static void main( String[] args )
    {

    	ApplicationContext ctx=null;
    	WishMsg service=null;
    	
    	//get IOC Containter
    	ctx=SpringApplication.run(App.class, args);
    	
    	//get bean
    	service=ctx.getBean("wish",WishMsg.class);
    	System.out.println(service.generateWishMsh("Satya")); 
    	
    			
    	
    }
}
