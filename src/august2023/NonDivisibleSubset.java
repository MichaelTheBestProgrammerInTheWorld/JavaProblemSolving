package august2023;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
https://www.hackerrank.com/challenges/non-divisible-subset/problem?h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen
 */
public class NonDivisibleSubset {

    public static int nonDivisibleSubset(int k, List<Integer> s) {
        // Write your code here
        int maxLength = 0;
        Set<Integer> spare = new HashSet<>();
        spare.addAll(s);
        do {
            Set<Integer> result = new HashSet<>();
            Set<Integer> temp = new HashSet<>();
            temp.addAll(spare);
            List<Integer> list = new ArrayList<>(temp);
            spare.clear();
            //for (int i=0; i< list.size(); i++){
                for (int j=1; j< list.size(); j++){
                    if ((list.get(0) + list.get(j)) % k != 0 && (!result.contains(list.get(j)))){
                        boolean isDivisible = false;
                        for (int num : result){
                            if ((num  + list.get(j)) % k == 0){
                                isDivisible = true;
                                break;
                            }
                        }
                        //if (result.contains(list.get(j))){ //wrong condition we should loop on result and check if sum is divisble by k
                        if (isDivisible){
                            spare.add(list.get(j));
                            spare.add(list.get(0));
                        } else {
                            result.add(list.get(j));
                            result.add(list.get(0));
                        }
                    }
                }
            //}
            maxLength = result.size();
        } while (spare.size() > maxLength);

        return maxLength;
    }

    public static void main(String[] args) {
        List<Integer> test1 = new ArrayList<>();
        test1.add(19);
        test1.add(10);
        test1.add(12);
        test1.add(10);
        test1.add(24);
        test1.add(25);
        test1.add(22);
        System.out.println(nonDivisibleSubset(4, test1));
        List<Integer> test2 = new ArrayList<>();
        test2.add(1);
        test2.add(7);
        test2.add(2);
        test2.add(4);
        System.out.println(nonDivisibleSubset(3, test2));
        List<Integer> test3 = new ArrayList<>();
        test3.add(278);
        test3.add(576);
        test3.add(496);
        test3.add(727);
        test3.add(410);
        test3.add(124);
        test3.add(338);
        test3.add(149);
        test3.add(209);
        test3.add(702);
        test3.add(282);
        test3.add(718);
        test3.add(771);
        test3.add(575);
        test3.add(436);
        //this case fails
        System.out.println(nonDivisibleSubset(7, test3));
    }
}
