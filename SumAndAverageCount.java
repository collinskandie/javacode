public class SumAndAverageCount {
    public static void main(String[] args){
        //Modify the program to sum from 111 to 8899, and compute the average.
        //Introduce an int variable called count to count the numbers in the specified range
        int sum1=0;
        double average1;
        int count= 0;
        int lowerbound1= 111;
        int upperbound1 =8899;
        for (int number1= lowerbound1; number1<=upperbound1; number1++){
            sum1 += number1;
            count++;
        }

        //calculate average
        average1= sum1/upperbound1;
        System.out.println("The sum is " + sum1);
        System.out.println("The average is "+average1);
        System.out.println("Numbers are " +count);
    }
}
