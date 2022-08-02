public class PascalsTriangle{
    public static void main(String[] args) {
        for(int i=0;i<=5;i++){
            for(int s=0;s<5-i;s++){
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