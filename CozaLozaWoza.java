public class CozaLozaWoza {
    public static  void main(String[] args){
        int lowerbound = 1, upperbound = 110;
        for (int number = lowerbound; number <= upperbound; ++number) {
            // Print "Coza" if number is divisible by 3
            if ( number%3 ==0) {
                System.out.print("Coza");
            }
            else if ( number%5 == 0) {
                System.out.print("Loza");
            } else if (number%7 == 0) {
                System.out.println("Woza");
            } else {
                System.out.println(number);
                if ( number%11 ==0 ) {
                    System.out.println("New line");

                }  else {
                    System.out.print("..........");  // print a space
                }
            }

        }

    }
}
