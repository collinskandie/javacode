import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args){
        int number1, number2;
        String sign1;
        int sum=0;
       Scanner scan= new Scanner(System.in);
        System.out.println("Enter first number");
        number1 = scan.nextInt();
        System.out.println("Enter Second number");
        number2 = scan.nextInt();
        System.out.println("Enter operator/sign");
        sign1=scan.next();
        char sign= sign1.charAt(0);

        switch (sign) {
            case ('-') -> sum=number1 - number2;
            case ('+') -> sum=number1 + number2;
            case ('*') -> sum=number1 * number2;
            case ('/') -> sum=number1 / number2;
            default -> System.err.println("Error: invalid operator!");
        }
        System.out.println(number1 +""+sign+""+number2+" = "+sum );
    }

}
