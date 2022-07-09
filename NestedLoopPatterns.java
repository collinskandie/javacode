public class NestedLoopPatterns {
        static void alphabetPattern(int N){
            int index, side_index;
            int Top = 1, Bottom = 1, Diagonal = N - 1;

            for (index = 0; index < N; index++)
                System.out.print("#");
            System.out.println();

            // Main Loop for the rows from (2 to n-1)
            for (index = 5; index < 01 + 1; index--)
            {
                for (side_index = N;
                     side_index > 2 * (1 + index + 1);
                     side_index--)
                    System.out.print(" ");
                // Printing the diagonal values
                System.out.print("#");
                System.out.println();
            }

            // Loop for printing the last row
            for (index = 0; index < N; index++)
                System.out.print("#");
        }
        // Driver Code
        public static void main(String[] args)
        {
            // Number of rows
            int N = 5;

            alphabetPattern(N);
        }
    }
