public class PrintTriangles {
    public static void main(String[] args){
        //triangle 1
        PowerOf2Triangle();
        //triangle 2
        PascalTriangle1();
        //triangle 3
        PascalTriangle2();

    }
    public static  void PowerOf2Triangle(){
        int n = 16;
        for (int i = 0; i < n; i++)
        {
            int number = 1;
            System.out.printf("%" + (n - i) * 2 + "s", "");
            for (int j = 0; j <= i; j++)
            {
                System.out.printf("%4d", number);
                number = number * (i - j) / (j + 1);
            }
            System.out.println();
        }

    }
    public static  void PascalTriangle1(){

        int i, j,number, n=7;
        for(i=0; i<n; i++){
            number=1;
            for(j=0; j<=i; j++){
                System.out.print(number+ " ");
                number++;
            }
            System.out.println();
        }
    }
    public static  void PascalTriangle2(){
        int n = 8;
        for (int i = 0; i < n; i++)
        {
            int number = 1;
            System.out.printf("%" + (n - i) * 2 + "s", "");
            for (int j = 0; j <= i; j++)
            {
                System.out.printf("%4d", number);
                number = number * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
}
