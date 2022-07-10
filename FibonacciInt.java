public class FibonacciInt {
    public static void main(String[] args)
    {
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE + 1);

        FibonacciInt aFibonacciInt = new FibonacciInt();
        aFibonacciInt.printFibonacci();
    }

    private void printFibonacci()
    {
        int fb1 = 1;
        int fb2 = 1;
        int fbn = 0;
        int i   = 1;

        System.out.printf("F(%1$d) = %2$d\n", 0, fb2);
        System.out.printf("F(%1$d) = %2$d\n", 1, fb1);
        while (true)
        {
            i++;
            fbn = fb1 + fb2;
            if (Integer.MAX_VALUE - fb1 > fb2) {
                System.out.printf("F(%1$d) = %2$d\n", i, fbn);
            }
            else {
                System.out.printf("F(%1$d) is out of the range of int\n", i);
                break;
            }
            fb2 = fb1;
            fb1 = fbn;
        }
    }
}
