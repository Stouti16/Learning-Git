import java.util.*;
public class FloydsTriangle {
    public static void main(String[] args) {
        System.out.println("Enter the number of lines");
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int num =1;
        for(int i=1;i<=n;i++){
            for(int s=1;s<=n-i;s++){
                System.out.print(" ");
            }
            for(int j=1; j<=i;j++)
            {
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }
}  
