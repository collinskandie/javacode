import java.util.Scanner;

public class InvertedStart {
    public static void main(String[] args){

        {
            Scanner sc=new Scanner(System.in);
            int n=10;
            for(int i=n;i>0 ;i--)
            {
                for(int j=0;j<n-i;j++)
                {
                    System.out.print(" ");
                }
                for(int j=0;j<(i*2)-1;j++)
                {
                    System.out.print("#");
                }
                System.out.println();
            }
        }
    }
}
