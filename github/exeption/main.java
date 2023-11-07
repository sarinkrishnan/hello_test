package exeption;

import java.time.DateTimeException;
import java.util.Scanner;

public class main {
  public static void main(String[] args) {
	System.out.println("enter date :  ");
	int da=0;
	
	try {
		Scanner sc=new Scanner(System.in);
		int date=sc.nextInt();
		if(date>34) {
			throw new DateTimeException   ("invaliad");
			
		}else {
			da=date;
			dairyentry dc=new dairyentry();
			
			dc.dispaly(date, null);
			dc.text("null");
			
			
		}
	}
	catch(DateTimeException e) {
		System.out.println("invalid date");
		
	}
	catch(Exception e) {
		System.out.println("enter date formate");
		
	}
}
}
