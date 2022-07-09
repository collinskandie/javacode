public class TimeTable {
    public static void main(String[] args){
        int size = 9;
        System.out.println("*|1 2 3 4 5 6 7 8  9");
        for (int row = 1; row <= size; ++row) {
            System.out.print(row + "|");
            for (int col = 1; col<=size; ++col) {
                System.out.print(row*col +" ");
            }
            System.out.println();
        }
    }
}
