public class ExtractDigits {
    public static void main(String[] args){
        int number = 675;
        while (number > 0) {
            int digit = number % 10;
            number = number / 10;
            System.out.println(digit);
        }
    }
}
