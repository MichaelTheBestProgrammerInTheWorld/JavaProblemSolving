package november2023;

import java.util.ArrayList;
import java.util.List;

/*
https://www.hackerrank.com/challenges/fair-rations/problem?isFullScreen=false
 */
public class FairRations {


    public static String fairRations(List<Integer> B) {
        // Write your code here
        String result = "NO";
        boolean allEven = false;
        int minLoaf = 0;
        //List<Boolean> allEven = new ArrayList<>();
        int sum = 0;
        for (int i : B){
            sum += i;
        }
        if (sum%2 != 0){
            return result;
        }
        while (!allEven){
            for (int i=B.size()-1; i>0; i--){
                if (B.get(i)%2 != 0){
                    B.set(i, B.get(i)+1);
                    B.set(i-1, B.get(i-1)+1);
                    minLoaf += 2;
                }
            }
            if (B.get(0)%2 != 0){
                B.set(0, B.get(0)+1);
                B.set(1, B.get(1)+1);
                minLoaf += 2;
            }
            for (int i : B){
                if (i%2 != 0){
                    allEven = false;
                    break;
                } else {
                    allEven = true;
                }
            }
        }
        return String.valueOf(minLoaf);
    }

    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        List<Integer> list3 = new ArrayList<>();
        list1.add(4);
        list1.add(5);
        list1.add(6);
        list1.add(7);
        System.out.println(fairRations(list1));
        list2.add(2);
        list2.add(3);
        list2.add(4);
        list2.add(5);
        list2.add(6);
        System.out.println(fairRations(list2));
        list3.add(1);
        list3.add(2);
        System.out.println(fairRations(list3));
    }
}
