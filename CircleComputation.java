import java.util.Scanner;

public class CircleComputation {
    public static void main(String[] args){
        double radius, area, circumference;
        double PI =Math.PI;
        System.out.println("Whats is the radius?");
        Scanner in = new Scanner(System.in);
        radius= in.nextDouble();
        area = PI *radius*radius;
        circumference= 2 * PI * radius;
        System.out.println("The radius is "+radius);
        System.out.println("The area is "+area);
        System.out.println("The circumference "+circumference);
    }
}
