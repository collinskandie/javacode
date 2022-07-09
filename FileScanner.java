import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileScanner {
    public static void main(String[] args)
            throws FileNotFoundException {
        int num1;
        double num2;
        String name;
        double sum;

        // Setup a Scanner to read from a text file
        Scanner in = new Scanner(new File("int.text"));
        num1 = in.nextInt();
        num2 = in.nextDouble();
        name = in.next();
        sum=num1+num2;
        //Display
        System.out.println("The integer read is " +num1);
        System.out.println("The floating point number read is "+num2);
        System.out.println("Hi, "+name+" the sum of "+num1+" and "+num2+" is "+sum);
        in.close();
    }

}
