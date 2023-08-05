package august2023;

import java.util.ArrayList;
import java.util.List;

/*
https://www.hackerrank.com/challenges/repeated-string/problem?h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen
 */
public class RepeatedString {

    public static long repeatedString(String s, long n) {
        // Write your code here
        long numOfA = 0;
        char[] arr = s.toCharArray();
        List<Character> repeated = new ArrayList<>();
        for (char c : arr){
            repeated.add(c);
        }
        while (repeated.size() < n){
            for (char c : arr){
                repeated.add(c);
            }
        }
        List<Character> subStringList = repeated.subList(0, (int) n);
        for (char sub : subStringList){
            if (sub == 'a'){
                numOfA++;
            }
        }

        return numOfA;
    }

    //my optimal solution working 100% with all test cases
    public static long repeatedString2(String s, long n) {
        // Write your code here
        long numOfA = 0;
        char[] arr = s.toCharArray();
        for (char c : arr){
            if (c == 'a'){
                numOfA++;
            }
        }
        long result = (n/arr.length) * numOfA;
//        if (result %2 == 0){
//            result *= numOfA;
//        } else {
//            result *= numOfA;
//            result++;
//        }
        for (int i = 0; i < n % arr.length; i++) {
            if (arr[i] == 'a') {
                result++;
            }
        }

        return result;
    }


    public static void main(String[] args) {
        System.out.println(repeatedString2("abcac", 10));  //answer is 4
        System.out.println(repeatedString2("aba", 10));    //answer is 7
        System.out.println(repeatedString2("a", 1000000000000L));    //answer is 1000000000000
        //System.out.println(Long.MAX_VALUE);
        //System.out.println(Long.MAX_VALUE - 1000000000000);
    }
}
