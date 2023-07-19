package july2023;

import java.math.BigInteger;

/*
https://www.hackerrank.com/challenges/extra-long-factorials/problem?h_r=next-challenge&h_v=zen
 */
public class ExtraLongFactorials {

    public static void extraLongFactorials(int n) {
        // Write your code here
        BigInteger bigInteger = BigInteger.valueOf(n);
        for (int i=n-1; i>0; i--){
            BigInteger bi = BigInteger.valueOf(i);
            bigInteger = bigInteger.multiply(bi);
        }
        System.out.println(bigInteger);
    }

    public static void main(String[] args) {
        extraLongFactorials(25);
    }
}
