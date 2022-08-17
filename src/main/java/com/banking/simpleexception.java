package com.banking;

import java.util.Scanner;
import static java.lang.System.*;

public class simpleexception {

	public static void main(String[] args) {
			
		
		Scanner bs=new Scanner(System.in);
		
		out.println("ENter one number");
		int x=bs.nextInt();
		
		out.println("Enter seconf value");
		int y=bs.nextInt();
		int a[]= {2,5,6,82,32,9};
		try {
		int z=x/y;
		System.out.println(a[7]);
		
		}
		catch(Exception e) {
			out.println(e.getMessage());
		}

	
		
	}

}
