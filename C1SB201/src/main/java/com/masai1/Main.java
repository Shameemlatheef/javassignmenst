package com.masai1;

public class Main {
public static void main(String[] args) {
	AccountDAO da=new AccountDAoimpl();
	da.save(new Account(20,"shaemme@hmail","inchivila",2000));
	da.save(new Account(10,"shaeme@hmail","chivila",2040));
	da.findById(20);
	da.deleteAccountById(10);
	da.deposit(200, 10);
	
}
}
