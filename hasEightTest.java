import java.util.Scanner;

public class hasEightTest {
    public static void main(String[] args){
        System.out.println("Enter number");
        int number;
        Scanner scan = new Scanner(System.in);
        number= scan.nextInt();
        hasEight(number);
//        System.out.println("Results: " + hasEight(number));
        if(hasEight(number)){
            System.out.println("The number has 8");
        }
        else System.out.println("It does not have 8");
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
