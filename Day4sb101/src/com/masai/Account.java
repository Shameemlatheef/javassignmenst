package com.masai;

public class Account {
String Accountno;
double balance;

 public double withdraw( int amount) throws InsuffiecientFunds {
	if(amount>balance) {
		InsuffiecientFunds a=new InsuffiecientFunds("insuffienct fund");
		throw a;
		
	}
	else {
		return balance-amount;
	}
}
void deposit( int amount) {
	balance=balance+amount;
	System.out.println("cash deposited succesfully");
}


}
