package com.masai;

public class Accountdemo {
public static void main(String[] args) {
	Account d=new Account();
	d.deposit(1000);
	try {
		d.withdraw(2000);
	} catch (InsuffiecientFunds e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
