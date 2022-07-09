import java.util.Scanner;

public class ArrayAndMethod {
    public static void main(String[] args){
        Scanner scan =new Scanner(System.in);
        int number;
        System.out.println("Enter number");
        number= scan.nextInt();
        int[] array=new int[number];
        printArray(array);

    }
    public static void printArray(int[] array){
        System.out.println("Print array");
        System.out.println(array[array.length]);

    }
}
