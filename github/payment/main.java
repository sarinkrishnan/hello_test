package payment;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
    	System.out.println("enter your choice"+"   1 for creditcard"+"     2 for paypalpayment");
    	Scanner sd=new Scanner(System.in);
    	int choice=sd.nextInt();
    	
   if (choice==1){
    CreditCardPayment sc=new CreditCardPayment();
    sc.processPayment();
    sc.generateReceipt();
    
    }else if(choice==2) {
    	PayPalPayment sc=new PayPalPayment();
    		sc.processPayment();
    	    sc.generateReceipt();
    	}else {
    		System.out.println("invalied ");
    	}
    
		
        		
	}
}
