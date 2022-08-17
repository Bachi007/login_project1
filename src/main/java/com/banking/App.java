package com.banking;

/**
 * Hello world!
 *
 */
import java.util.Scanner;
import static java.lang.System.*;
public class App 
{
    public static void main( String[] args )
    {
       Scanner bs=new Scanner(System.in);
       agecheck ag=new agecheck();
       out.println("Enter the age");
       int age=bs.nextInt();
       try {
    	  if( ag.check(age)) {
    		  out.println("Eligible to vote");
    	  }
       }
       catch(Exception e) {
    	   out.println(e.getMessage());
       }
       
       finally {
    	   System.out.println("Thank you");
       }
       
       
       
       
       bs.close();
    }
}
