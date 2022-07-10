public class PrintPatterns {
    public static void main(String[] args){
        ///pattern (a)
        patternA();
        //pattern (b)
        patternB();
        //pattern (c)
        pattenC();

    }
    public static void patternA(){
        System.out.println("a");
        int rows=8;
        for (int i= 0; i<= rows-1; i++)
        {
            for (int j=0; j<=i; j++)
            {
                System.out.print(" ");
            }
            for (int k=0; k<=rows-1-i; k++)
            {
                System.out.print("*" + " ");
            }
            System.out.println();
        }

    }
    public static void patternB(){
        System.out.println("b");
        int i, j, row = 10;
        for (i=0; i<row; i++)
        {
            for (j=row-i; j>1; j--)
            {
                System.out.print(" ");
            }
            for (j=0; j<=i; j++ )
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pattenC(){
        System.out.println("c");

        int row =10, i, j, space = 1;
        space = row - 1;
        for (j = 1; j<= row; j++)
        {
            for (i = 1; i<= space; i++)
            {
                System.out.print(" ");
            }
            space--;
            for (i = 1; i <= 2 * j - 1; i++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
        space = 1;
        for (j = 1; j<= row - 1; j++)
        {
            for (i = 1; i<= space; i++)
            {
                System.out.print(" ");
            }
            space++;
            for (i = 1; i<= 2 * (row - j) - 1; i++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
