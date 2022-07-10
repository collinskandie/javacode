public class GreatestCommonDivisor {
    public static void main(){
        int a = 98, b = 56;
        System.out.print("GCD of " + a + " and " + b + " is " + gcd(a, b));
    }
    public static int gcd(int a, int b){
        int result = Math.min(a, b); // Find Minimum of a nd b
        while (result > 0) {
            if (a % result == 0 && b % result == 0) {
                break;
            }
            result--;
        }
        return result; // return gcd of a nd b
    }
}
