package Com.masai;

import javafx.scene.transform.Scale;

import java.util.Arrays;
import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Mian1 m=new Mian1();
        Scanner s=new Scanner(System.in);
        System.out.println("enter amount");
        int amou=s.nextInt();
    int[]arr= m.display(amou);
    StringBuilder c=new StringBuilder();
    for(int i=0;i<arr.length;i++){
        c.append(arr[i]);
        c.append(" ");

    }
        System.out.println(c.toString());

    }
}
