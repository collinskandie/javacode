public class SumAndAveragewhileDo {
    public static void main(String[] args){
        //the following code is represents modified code of the above solution
        //while-do
        //Modify the program to use a "while-do" loop instead of "for" loop.
        double average;
        int sum= 0;
        int lowerbound= 1;
        int upperbound =100;
        int number = lowerbound;
        while (number <= upperbound) {
            sum += number;
            ++number;
        }
        average= sum/upperbound;
        System.out.println("The sum is " + sum);
        System.out.println("The average is "+average);


    }
}
