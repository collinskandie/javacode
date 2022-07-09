import java.util.Scanner;

public class OddTest {
    public static void main(String[] args) {
        int number;
        System.out.println("Enter number");
        Scanner scan = new Scanner(System.in);
        number = scan.nextInt();
        isOdd(number);
    }
    public static void isOdd(int number){
        if(number%2 == 0){
            System.out.println("EVEN");
        }
        else {
            System.out.println("ODD");
        }

    }
}
