import java.util.HashMap;
import java.util.Scanner;

class Hex2Bin {

    String hexToBinary(String hex)
    {
        String binary = "";
        hex = hex.toUpperCase();
        HashMap<Character, String> hashMap
                = new HashMap<Character, String>();
        hashMap.put('0', "0000");
        hashMap.put('1', "0001");
        hashMap.put('2', "0010");
        hashMap.put('3', "0011");
        hashMap.put('4', "0100");
        hashMap.put('5', "0101");
        hashMap.put('6', "0110");
        hashMap.put('7', "0111");
        hashMap.put('8', "1000");
        hashMap.put('9', "1001");
        hashMap.put('A', "1010");
        hashMap.put('B', "1011");
        hashMap.put('C', "1100");
        hashMap.put('D', "1101");
        hashMap.put('E', "1110");
        hashMap.put('F', "1111");
        int i;
        char ch;
        for (i = 0; i < hex.length(); i++) {

            ch = hex.charAt(i);
            if (hashMap.containsKey(ch))
                binary += hashMap.get(ch);
            else {
                binary = "Invalid Hexadecimal String";
                return binary;
            }
        }
        return binary;
    }
    public static void main(String[] args)
    {

        // instantiating the class
        Hex2Bin ob = new Hex2Bin();
        String hex = "";
        System.out.println("Enter a Hexadecimal string:  ");
        Scanner scan = new Scanner(System.in);
        hex= scan.next();
//        System.out.println(hex.toUpperCase());
        System.out.println("The equivalent binary for hexadecimal "+hex+" is: "+ob.hexToBinary(hex));
    }
}
