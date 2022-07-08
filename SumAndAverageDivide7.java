public class SumAndAverageDivide7 {
    public static void main(String[] args){
        //Modify the program to sum those numbers from 1 to 100 that is divisible by 7,
        //and compute the average
        int sum=0;
        double average;
        int lowerbound= 1;
        int upperbound =100;
        for (int number= lowerbound; number<=upperbound; number++){
            if(number%7 ==0){
            sum += number;
            }
        }

        //calculate average
        average= sum/upperbound;
        System.out.println("The sum is " + sum);
        System.out.println("The average is "+average);
    }
}
