package caculateareaa;

import java.util.Scanner;

public abstract class shape {
   abstract void calculatearea();
   

}
   class A extends shape{
    	 void  claculatearea() {
    		 System.out.println("enter uour radious :  ");
    		 Scanner sc=new Scanner(System.in);
    		  float radious=sc.nextInt();
    		  double area=Math.PI*radious*radious;
    		  System.out.println("area :  "+area);
    		 
    	 }

		}
      
