package Com.masai;

public class Prime {
    public static void main(String[] args) {
        int h=7;
        for(int j=0;j<h;j++){
            int count=0;
            for(int i=1;i<=h;i++){
                if(h%i==0){
                    count++;
                }
            }
            if(count==2){
                System.out.println("Its prime");
            }
            else {
                System.out.println("non prime");
            }
        }

    }


}
