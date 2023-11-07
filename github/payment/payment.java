package payment;

public interface payment {
      void processPayment();
       void  generateReceipt();
}
 class  CreditCardPayment implements payment {
	 public void processPayment() {
		 System.out.println("DONE");
	 }
 
	public void   generateReceipt(){
			 System.out.println("RECEIVED");
			 
		 }
	}
	 class  PayPalPayment implements payment{
		 public void processPayment() {
			 System.out.println("DONE");
		 }
		 public void generateReceipt() {
			 System.out.println("RECIEVED");
		 }
	 }
 
 
