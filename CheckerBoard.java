public class CheckerBoard {
    public static void main(String[] args){
        int size = 7;
        for (int row = 1; row<=size;++row) {
            if ((row % 2) == 0) {   // row 2, 4, 6, 8
                System.out.print(" ");
            }
            for (int col = 1; col<=size; ++col) {
                System.out.print("# ");
            }
            System.out.println();
        }

    }
}
