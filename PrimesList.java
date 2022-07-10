import java.util.Scanner;

public class PrimesList {
    public static void main(String[] args){
        int upperbound;
        System.out.println("Enter upperbound number");
        Scanner scan = new Scanner(System.in);
        upperbound = scan.nextInt();
        isPrime(upperbound);
    }
    public static void isPrime(int posInt){
        int i, j, isPrime, n =0;
        double percentage;

        System.out.println("All Prime Numbers Between 1 to "+ posInt);

        for (i = 2; i <= posInt; i++) {
            isPrime = 0;
            // Check whether i is prime or not
            for (j = 2; j <= i / 2; j++) {

                if (i % j == 0) {
                    isPrime = 1;
                    n= n+1;
                    break;
                }
            }
            if (isPrime == 0)
                System.out.println(i + " ");

        }
        percentage = n/posInt*100;
        System.out.println();
        System.out.println("The percentage is"+percentage);

    }

}

