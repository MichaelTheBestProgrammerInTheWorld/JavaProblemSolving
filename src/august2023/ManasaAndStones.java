package august2023;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*
https://www.hackerrank.com/challenges/manasa-and-stones/problem?isFullScreen=false
 */
public class ManasaAndStones {

    public static List<Integer> stones(int n, int a, int b) {
        // Write your code here
        List<Integer> probabilities = new ArrayList<>();
        int iteration = 0;

        return getProbability(probabilities, iteration, 0, n, a, b)
                .stream()
                .distinct()
                .collect(Collectors.toList());
    }

    private static List<Integer> getProbability(List<Integer> l, int iteration, int node, int n, int a, int b) {
        int left = node+a;
        int right = node+b;
        iteration++;
        //while (l.size() < (int) Math.pow(2, n-1)){
            if (iteration == n-1){
                l.add(left);
                l.add(right);
                return l;
            } else {
                getProbability(l, iteration, left, n, a, b);
                getProbability(l, iteration, right, n, a, b);
            }
        //}
        return l;
    }

    public static void main(String[] args) {
//        System.out.println((int) Math.pow(2, 2));
//        System.out.println(Math.pow(2, 3));

        System.out.println(stones(3, 1, 2));
        System.out.println(stones(3, 2, 3));
        System.out.println(stones(4, 10, 100));

        System.out.println(stones(7, 9, 11));
        System.out.println(stones(4, 8, 16));
    }
}


/*
public static List<Integer> stones(int n, int a, int b) {
        int A = Math.min(a, b);
        int B = a + b - A;
        int val = A * (n - 1);

        // An - A - Ai + Bi -> A(n - 1) - i(A - B)
        return IntStream.range(0, n)
                .map(i -> val - (i * (A - B)))
                .distinct()
                .boxed()
                .collect(Collectors.toList());
}
 */