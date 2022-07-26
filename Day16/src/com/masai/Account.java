package com.masai;

public class Account {
    String  accountNumber;
   double balance;
  void  deposit(int amount){

     balance=balance+amount;
      System.out.println(balance);

  }
   public double withdraw(int amount) throws Insufficientfund {
      if(amount>balance){
          Insufficientfund o=new Insufficientfund("insufficient funds");
          throw o;
      }else
        balance=balance-amount;
       //System.out.println(balance)
       return balance;
   }
}
