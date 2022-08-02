public class ForLoopPrime {
    public static void main(String[] args) {
        int n=10;
        for(int j=1;j<=n;j++)
        {
            int c=0;
            for(int i=1;i<=j;i++){
                if(j%i==0){
                    c++;
                }
                
            }
            if(c==2)
                System.out.println(j);
        }
    }
}
