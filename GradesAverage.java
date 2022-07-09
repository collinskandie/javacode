import java.util.Scanner;

public class GradesAverage {
    public static void main(String[] args){
        int numStudents;
        System.out.println("Enter the number of students");
        Scanner scanner= new Scanner(System.in);
        numStudents= scanner.nextInt();
        int[] grades = new int[numStudents];
        float total =0;
        for( int count =1; count<=numStudents; count++ ){
            System.out.println("Enter marks for student "+count);
            int index= count-1;
            grades[index]=scanner.nextInt();
            if(grades[index] <0 || grades[index]>100){
                System.out.println("Invalid grade, try again");
                System.out.println("Enter marks for student "+count);
                grades[index]=scanner.nextInt();
            }
            total= total +grades[index];
        }
//        System.out.println("The total is "+total);
        double average= total/numStudents;
        System.out.println("The average is "+average);
    }
}
