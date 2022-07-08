public class SumAndAverageSumSquare {
    public static void main(String[] args){
        //Modify the program to find the "sum of the squares" of all the numbers from 1 to 100,
        //i.e. 1*1 + 2*2 + 3*3 + ... + 100*100.
        int sum=0;
        double average;
        int lowerbound= 1;
        int upperbound =100;
        for (int number= lowerbound; number<=upperbound; number++){
            int square = number*number;
            sum +=square;
        }

        //calculate average
        average= sum/upperbound;
        System.out.println("The sum is " + sum);
        System.out.println("The average is "+average);
    }
}
