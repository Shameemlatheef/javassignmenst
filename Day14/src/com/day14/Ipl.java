package com.day14;

import java.util.Locale;
import java.util.Scanner;

public class Ipl {
  void  homeTeamStadium(Stadium stadium){
   switch (stadium)
   {
     case WANKHEDE_STADIUM:
       System.out.println("This is the home ground of Mumbai Indians");
     case CHIDAMBARAM_STADIUM:
       System.out.println("This is the home ground of CSK");
     case EDEN_GARDENS_STADIUM:
       System.out.println("This is the home ground of KKR");
     case M_CHINNASWAMY_STADIUM:
       System.out.println("This is the home ground of RCB");
   }
  }

  public static void main(String[] args) {
    Ipl i=new Ipl();
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the stadium");
    String g=s.next().toUpperCase();

    System.out.println(Stadium.valueOf(g));




  }
}
