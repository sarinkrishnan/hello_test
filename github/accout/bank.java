package accout;

public class bank {
	 
	 private int accountnumber;
	 private int balance=100;
	 private String name;
	  
	 
	 public int getbalance() {
		 return balance;
	 }
	  
	 public void setbalance(int balance) {
		 this.balance=balance;
	 }
	 public String getname() {
		 return name;
	 }
	 public void setname(String name) {
		 this.name=name;
	 }
	  
	public void creditt(int credit) {
		balance=balance+credit;
	}
	 public  void debitt(int debit) {
		 balance=balance-debit;
		 
	 }
}
