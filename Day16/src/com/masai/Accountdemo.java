package com.masai;

public class Accountdemo {
    public static void main(String[] args)  {
        Account a=new Account();
        a.accountNumber="12345";
       a.deposit(300);

        try {
            System.out.println(a.withdraw(500));
        } catch (Insufficientfund o) {
            System.out.println(o.getMessage());
        }
        finally {
            System.out.println("end");
        }
    }
}
