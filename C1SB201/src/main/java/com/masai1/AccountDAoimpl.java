package com.masai1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class AccountDAoimpl  implements AccountDAO{
	
	
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("accountUnit");
	

	@Override
	public Account findById(int id) {
		// TODO Auto-generated method stub
		
		EntityManager em=emf.createEntityManager();
		Account account=em.find(Account.class, id);
		if(account!=null) {
			return account;
			
		}else {
			return null;
		}
		
		
		
	}

	@Override
	public String save(Account account) {
		
		EntityManager em2=emf.createEntityManager();
		EntityTransaction et=em2.getTransaction();
		et.begin();
		em2.persist(account);
		et.commit();
		em2.close();
		
		String message;
		if(account!=null) {
			message="record added";
		}else {
			message="Not added";
		}
		
		
		return message;
		
	}

	@Override
	public String deleteAccountById(int id) {
		EntityManager em3=emf.createEntityManager();
		Account account=em3.find(Account.class,id);
		String message;
		if(account!=null) {
			EntityTransaction et1=em3.getTransaction();
			et1.begin();
			em3.remove(account);
			et1.commit();
			 message="Removed succesfully";
			 em3.close();
		}
		else {
			message="data not found";
		}
		return message;
		
	}

	@Override
	public String withdraw(double amount, int accountId) {
		
		EntityManager em4=emf.createEntityManager();
		Account account=em4.find(Account.class, accountId);
		String message = null;
		if(account!=null) {
			if(account.getBalance()>amount) {
			EntityTransaction et5=em4.getTransaction();
			et5.begin();
				account.setBalance(accountId-amount);
				et5.commit();
				message="cash withdraw";
			em4.close();
			}
			
		}
		else {
			message="not wid=thdrawn";
		}
		
		return message;
	}

	@Override
	public String deposit(double amount, int accountId) {
		EntityManager em5=emf.createEntityManager();
		Account account=em5.find(Account.class, accountId);
		String message = null;
		
	if(account!=null){
		EntityTransaction et6=em5.getTransaction();
		et6.begin();
		account.setBalance(account.getBalance()+amount);
		et6.commit();
		em5.close();
		message="amount deposited";
	}
	else {
		message="amount not deposited";
	}
	
		return message;
	}

}
