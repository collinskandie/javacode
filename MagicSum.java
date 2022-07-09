import java.util.Scanner;

public class MagicSum {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int number = 0;
        int total= 0;
        int sentimental =-1;

        while(number != sentimental){
            System.out.println("Enter number");
            number= scan.nextInt();
            hasEight(number);
            if(hasEight(number)){
                total= total+ number;
            }
            else System.out.println("It does not have 8");
            System.out.println("The magic sum is " +total);
        }

    }
    public static boolean hasEight(int number){
        int rem;
        while (number > 0) {
            rem = number % 10;
            if (rem == 8)
                return true;
            number = number / 10;
        }
        return false;
    }
}
