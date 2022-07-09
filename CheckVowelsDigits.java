import java.util.Scanner;

public class CheckVowelsDigits {
    public static void main(String[] args){
        int vowels=0, digits=0;
        String string;
        System.out.println("Enter a string with vowels and digits");
        Scanner in= new Scanner(System.in);
        string= in.next();
        for(int i =0; i< string.length(); i++){
            if (string.charAt(i) >= 48 && string.charAt(i) <= 57)
                digits++;
            }
        for (int i=0 ; i<string.length(); i++){
            char ch = string.charAt(i);
        if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u'||ch == 'A'||ch == 'E'||ch == 'I'||ch == 'O'||ch == 'U'){
            vowels ++;
        }
        }
        System.out.println("digits are "+digits);
            System.out.println("vowels are "+vowels);

    }
}
