package august2023;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
https://www.hackerrank.com/challenges/minimum-distances/problem?isFullScreen=false
 */
public class MinimumDistances {

    public static int minimumDistances(List<Integer> a) {
        // Write your code here
        int minDistance = Integer.MAX_VALUE;
        boolean isValidInput = false;
        for (int i=0; i<a.size(); i++){
            for (int j=a.size()-1; j>i; j--){
                if (a.get(i) == a.get(j)){
                    if (j-i < minDistance){
                        minDistance = j-i;
                        isValidInput = true;
                    }
                }
            }
        }
        return isValidInput ? minDistance : -1;
    }

    //optimal solution works 100% with all test cases
    public static int minimumDistances2(List<Integer> a) {
        // Write your code here
        Map<Integer, Integer> indexMap = new HashMap<>();
        int minDistance = Integer.MAX_VALUE;

        for (int i = 0; i < a.size(); i++) {
            int element = a.get(i);
            if (indexMap.containsKey(element)) {
                int prevIndex = indexMap.get(element);
                int distance = i - prevIndex;
                minDistance = Math.min(minDistance, distance);
            }
            indexMap.put(element, i);
        }

        return minDistance == Integer.MAX_VALUE ? -1 : minDistance;
    }

    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>();
        l1.add(3);
        l1.add(2);
        l1.add(1);
        l1.add(2);
        l1.add(3);
        System.out.println(minimumDistances2(l1));
        List<Integer> l2 = new ArrayList<>();
        l2.add(7);
        l2.add(1);
        l2.add(3);
        l2.add(4);
        l2.add(1);
        l2.add(7);
        System.out.println(minimumDistances2(l2));
        List<Integer> l3 = new ArrayList<>();
        l3.add(1);
        l3.add(2);
        l3.add(3);
        l3.add(5);
        l3.add(10);
        System.out.println(minimumDistances2(l3));
        List<Integer> l4 = new ArrayList<>();
        l4.add(1);
        l4.add(1);
        l4.add(3);
        l4.add(5);
        l4.add(3);
        System.out.println(minimumDistances2(l4));
    }
}
