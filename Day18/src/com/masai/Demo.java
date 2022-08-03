package com.masai;

import java.util.ArrayList;

public class Demo {

    //difference btw list and set
    // in list we can add songs and is allowed to have duplicates.inSet we are not allowed to have some duplicates a
    // list ois index based and in set we cant do index based output


    public static void main(String[] args) {
        ArrayList<String> a=new ArrayList<>();
        a.add("shameem");
        a.add("micheal");
        a.add("senan");
        for(int i=0;i<a.size();i++){
            System.out.println(a.get(i));
        }
        for(String d:a){
            System.out.println(d);
        }

    }

}
