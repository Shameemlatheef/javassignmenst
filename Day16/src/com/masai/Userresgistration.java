package com.masai;

import javafx.scene.transform.Scale;

import java.util.Objects;
import java.util.Scanner;

public class Userresgistration {
    public void register(String username,String userCountry) throws InvalidCountryException {
        if(!Objects.equals(userCountry, "India")){
            InvalidCountryException ie=new InvalidCountryException("user not from india");
            throw ie;
        }
        else {
            System.out.println(username);
            System.out.println(userCountry);
        }
    }

    public static void main(String[] args) {
        Userresgistration u=new Userresgistration();
        Scanner s=new Scanner(System.in);
        System.out.println("enter user name");

        String user=s.next();
        System.out.println("enter country");
        String con=s.next();
        try {
            u.register(user,con);
        } catch (InvalidCountryException ie) {
            System.out.println(ie.getMessage());
        }
    }
}
