package com.Day5;

import java.util.Scanner;

public class Find {
   String c="shameem";

//int x;
void show(int x){
    char a= c.charAt(x);
    System.out.println(a);

}

//char a=c.charAt(x);
    public static void main(String[] args) {
        Find f=new Find();
        Scanner s=new Scanner(System.in);

        System.out.println("nter char");
        int v=s.nextInt();
        f.show(v);


    }
}
