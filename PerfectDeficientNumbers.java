import java.util.Scanner;

public class PerfectDeficientNumbers {
    public static void main(String[] args) {
        int upperbound;
        System.out.println("Enter upperbound:");
        Scanner scan = new Scanner(System.in);
        upperbound = scan.nextInt();
        for (int number = 1; number <= upperbound; number++) {
            isPerfect(number);
            isDeficient(number);
        }
    }

    public static void isPerfect(int posInt) {
        int sum = 0;
        for (int count = 1; count <= posInt; count++) {
            if (posInt % count == 0) {
                sum = sum + count;
            }
            if (sum == posInt) {
                System.out.println("This number is perfect");
                System.out.println(posInt);
            }
        }

    }
    public static boolean isDeficient(int posInt){
        return (divsum(posInt) < (2 * posInt));
    }
    static int divsum(int n)
    {
        int sum = 0;
        for (int i = 1; i <= (Math.sqrt(n)); i++) {
            if (n % i == 0) {

                if (n / i == i) {
                    sum = sum + i;
                } else {
                    sum = sum + i;
                    sum = sum + (n / i);
                }
            }
        }
        return sum;
    }
}
