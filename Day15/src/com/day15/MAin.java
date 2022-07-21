package com.day15;

import javax.security.sasl.SaslClient;
import java.util.Scanner;
import java.util.regex.Pattern;

public class MAin {
    public boolean validate(String name, String mobileNum, String aadharCard){
if(Pattern.matches("[6789]{1}[0-9]{9}",mobileNum)){
    if(Pattern.matches("[a-zA-Z]{7}",name)){
        if (Pattern.matches("[0-9]{12}",aadharCard)){
            return true;


        }
        else{
            return false;

        }

    }
    else return false;

}else return false;
    }
    public static void main(String[] args) {
MAin m=new MAin();
        Scanner d=new Scanner(System.in);
        System.out.println("Enter the name");
        String name=d.next();
        System.out.println("enter the mobile number");
        String num=d.next();
        System.out.println("ENter the adhar card");
        String adhar=d.next();
if(m.validate(name,num,adhar)==true){
    Citizen c=new Citizen();
    c.setName(name);
    c.setAadharNumber(adhar);
    c.setMobileNumber(num);
    c.details();
}else
    System.out.println("invalid");
    }
}
