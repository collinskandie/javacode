import java.util.Scanner;
import static java.lang.Math.PI;

public class CircleComputationSentim {
        public static void main(String[] args){
            double radius, area, circumference;
            int terminator;
            Scanner in = new Scanner(System.in);

            System.out.print("Enter a positive integer or -1 to exit: ");
            terminator= in.nextInt();

            while(terminator != -1) {
                System.out.println("Whats is the radius?");
                radius = in.nextDouble();
                area = PI*radius*radius;
                circumference = 2 * PI * radius;
                System.out.println("The radius is " + radius);
                System.out.println("The area is " + area);
                System.out.println("The circumference " + circumference);
            }
        }
    }
