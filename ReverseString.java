import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        String inStr;
        int inStrLen;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a String: ");
        inStr = in.next();   // use next() to read a String
        inStrLen = inStr.length();
        String rev="";
        for (int i = inStrLen - 1; i >= 0; --i) {
            rev = rev + inStrLen;
        }
        System.out.println(rev);
    }

}
