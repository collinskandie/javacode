import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        String inStr;
        int inStrLen;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a String: ");
        inStr = in.next();   // use next() to read a String
        inStrLen = inStr.length();

        // Use inStr.charAt(index) in a loop to extract character at "index" from inStr
        // The String's index begins at 0 from the left.
        for (int i = inStrLen - 1; i >= 0; --i) {
            inStr.charAt(i);
        // Process the String from the right
        }
    }

}
