package com.satya;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.satya.beans.Vehicle;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        ApplicationContext ctx= new FileSystemXmlApplicationContext("src/main/java/com/satya/cfgs/applicationContext.xml");
        Vehicle vehicleBean = ctx.getBean("vehicle",Vehicle.class);
        
        
        System.out.println("vehicleBean  : "+vehicleBean);
    }
    
}
