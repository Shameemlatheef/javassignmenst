package Com.masai;

public class Mian1 implements intr {

    @Override
    public int[] display(int p) {
        int[] k = new int[p];
        int count = 0;
        for (int i = 1; i <= p; i++) {

            if (p % i == 0) {
                count++;
            }

            }
        if (count == 2) {
            for(int j=0;j<k.length;j++){
                k[j]=p;
            }

        }
        return k;
    }
}
