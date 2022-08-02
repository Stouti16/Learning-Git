import java.util.*;
public class PascalsTriangle{
    public static void main(String[] args) {
        System.out.println("Enter the number of lines");
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int s=0;s<n-i;s++){
                System.out.print(" ");
            }
            int num =1;
            for(int j=0; j<=i;j++)
            {
                System.out.print(num+" ");
                num=num*(i-j)/(j+1);
            }
            System.out.println();
        }
    }
}