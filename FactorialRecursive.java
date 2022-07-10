public class FactorialRecursive {
    public static void main(){
        int a,b, remainder;
        a=1;
        b=1;
        gcd(a,b);

    }
    public static int gcd(int a, int b){
        // or one liner
        // return (n == 0) ? 1 : n*factorial(n-1);

        return a;
    }
    public static int factorial(int n) {
        if (n == 0) {
            return 1;   // base case
        } else {
            return n * factorial(n-1);  // call itself
        }

    }


}
