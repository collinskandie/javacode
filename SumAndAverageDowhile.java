public class SumAndAverageDowhile {
    public static void main(String[] args){
        int sum=0;
        double average;
        int lowerbound= 1;
        int upperbound =100;
        int number = lowerbound;
        //do-while
        //Modify the program to use a "do-while" loop.
        do {
            sum += number;
            ++number;
        } while (number <= upperbound);
        average= sum/upperbound;
        System.out.println("The sum is " + sum);
        System.out.println("The average is "+average);
    }
}
