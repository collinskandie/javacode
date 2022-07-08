public class SumAndAverageOdd {
    public static void main(String[] args){
       //Modify the program to sum only the odd numbers from 1 to 100,
        // and compute the average.
        // (HINTS: n is an odd number if n % 2 is not 0.)
        int sum=0;
        double average;
        int lowerbound= 1;
        int upperbound =100;
        for (int number= lowerbound; number<=upperbound; number++){
            if (number%2 !=0){
            sum += number;
            }
        }
        average= sum/upperbound;
        System.out.println("The sum is " + sum);
        System.out.println("The average is "+average);
    }
}
