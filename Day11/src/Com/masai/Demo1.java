package Com.masai;

import java.util.Scanner;

public class Demo1 {
    public Hotel provideFood(int amount){
        if(amount>1000){
      return new Tajhotel();
        }else {
            return new Roadsidehotel();
        }
        //return h;

    }
    public static void main(String[] args) {
        Demo1 d1=new Demo1();
        Scanner f=new Scanner(System.in);
        System.out.println("netr amount");
        int am=f.nextInt();
        if(am <200){
            System.out.println("netr valid amount");
        }
        else {
            Hotel h= d1.provideFood(am);
            if(h instanceof Tajhotel){
                h.chickenBiryani();
                h.masalaDosa();
                ((Tajhotel) h).welcomeDrink();
            }
            else {
                h.masalaDosa();
                h.chickenBiryani();
            }
        }
        }

}
