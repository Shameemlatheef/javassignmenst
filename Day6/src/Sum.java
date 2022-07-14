public class Sum {
    int[][] a={
        {1,2,3},
        {4,5,6},
        {7,8,9}
    };
    public void find(){
        int m=0;
        for(int i=0;i<a.length;i++){
            for (int j=0;j<a[i].length;j++){
if(a[j][i]%2==0){
    m=m + a[j][i];

}
            }
            System.out.println(m);
        }
    }

    public static void main(String[] args) {
        Sum s=new Sum();
        s.find();

    }

}
