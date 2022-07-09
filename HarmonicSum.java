import java.io.*;
public class HarmonicSum {
    public static void main(String[] args){
        int maxDenominator = 50000;
        double sumL2R = 0.0;
        double sumR2L = 0.0;

        for (int denominator = 1; denominator <= maxDenominator; ++denominator) {
            sumL2R = sumL2R + 1/denominator;
        }
        System.out.println("The sum from left-to-right is: " + sumL2R);
        for (int denominator = maxDenominator; denominator >= 1; --denominator) {
            sumR2L += 1/denominator;
        }
        System.out.println("The sum from left-to-right is: " + sumR2L);
    }
}
