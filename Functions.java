import java.util.*;
public class Functions {
    public static void PrimeNumber(int a){
        
            int c=0;
            for(int i=1;i<=a;i++){
            if(a%i==0){
             c++;
            }}
             if(c==2){
                System.out.println("Prime Number");
              }
             else
             System.out.println("Not A prime Number");
            }
        
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter Number");
            int a=sc.nextInt();
            PrimeNumber(a);
        }
    }
    

