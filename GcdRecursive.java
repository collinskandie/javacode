import java.util.Scanner;
public class GcdRecursive {
    public static void main(String[] args) {
        int my_input_1, my_input_2, my_result;
        Scanner my_scanner = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        my_input_1 = my_scanner.nextInt();
        System.out.print("Enter the second number : ");
        my_input_2 = my_scanner.nextInt();
        my_result = CommonFactor(my_input_1, my_input_2);
        System.out.printf("The G.C.D of %d and %d is %d.", my_input_1, my_input_2, my_result);
    }
    public static int CommonFactor(int my_input_1, int my_input_2){
        if (my_input_2 != 0)
            return CommonFactor(my_input_2, my_input_1 % my_input_2);
        else
            return my_input_1;
    }
}
