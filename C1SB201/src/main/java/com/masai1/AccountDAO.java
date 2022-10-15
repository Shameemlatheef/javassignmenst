package com.masai1;



public interface AccountDAO {
	Account findById(int id);
	String save(Account account);
	String deleteAccountById(int id);
	String withdraw(double amount,int accountId);
	String deposit(double amount,int accountId);
}
