public class Fibonacc {
    public static void main (String args[]) {
        int number = 3;
        int fNumber;
        int fnMinus1 = 1;
        int fnMinus2 = 1;
        int nMax = 20;
        int sum = fnMinus1 + fnMinus2;
        double average;

        System.out.println("The first " + nMax + " Fibonacci numbers are:");

        while (number <= nMax) {
            System.out.print(number+" ");
            fNumber= fnMinus1+fnMinus2;
            sum=sum+number;
            number++;
        }
        average=sum/nMax;
        System.out.println(sum +"\r\n");
        System.out.println(average);

    }
}
