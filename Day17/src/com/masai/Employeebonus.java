package com.masai;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Employeebonus {

    public double intake(String join) throws Invaliddate{
        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd/MM/yyyy");
        double u=0;
          LocalDate j=LocalDate.parse(join,dtf);
          LocalDate l=LocalDate.now();
          Period p=Period.between(j,l);
          int t=p.getYears();
       // System.out.println(t);

        if(t>0&&t<1){
            u= 500;
        } else if (t>1&&t<2) {
             u=8000;
        }else if(t>2) {
            u= 10000;
        } else if (t<0) {
            Invaliddate q=new Invaliddate("yeaer is in future");
            throw q;
        }

return  u;
    }

    public static void main(String[] args)  {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter thd joining date");

        String join=s.next();
       Employeebonus e=new Employeebonus();
        try {
            System.out.println(e.intake(join));
        } catch (Invaliddate ex) {
            System.out.println(ex.getMessage());


        }
    }
}
