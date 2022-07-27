package com.masai;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("ENter the starting date");

       String sta=s.next();
        System.out.println("Enter the ending date");
        String end=s.next();
        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd/MM/yyyy");
      try {
          LocalDate st=LocalDate.parse(sta,dtf);
          LocalDate ed=LocalDate.parse(end,dtf);
          Period p=Period.between(st,ed);
          System.out.println(ed);
          int wag=p.getDays();
          if(wag>0){
              int wage=wag*1600;
              System.out.println("wage is "+wage);
          }else {
              Invaliddate i=new Invaliddate("future");
              throw i;
          }
          // System.out.println(wag);

      }
      catch (Invaliddate i){
          System.out.println(i.getMessage());
      }

    }
}
