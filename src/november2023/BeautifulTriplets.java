package november2023;

import java.util.ArrayList;
import java.util.List;

/*
https://www.hackerrank.com/challenges/beautiful-triplets/problem?isFullScreen=true
 */
public class BeautifulTriplets {

    public static int beautifulTriplets(int d, List<Integer> arr) {
        // Write your code here
        int numberOfTriplets = 0;
        int initialIndex = 0;
        //int initial = arr.get(initialIndex);
        while (initialIndex < arr.size()){
            for (int i=initialIndex+1; i< arr.size(); i++){
                if (arr.get(i) - arr.get(initialIndex) == d){
                    for (int j=i+1;  j< arr.size(); j++){
                        if (arr.get(j) - arr.get(i) == d){
                            numberOfTriplets++;
                            break;
                        }
                    }
                }
            }
            initialIndex++;
        }

        return numberOfTriplets;
    }

    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        list1.add(2);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        System.out.println(beautifulTriplets(1, list1));
        list2.add(1);
        list2.add(2);
        list2.add(4);
        list2.add(5);
        list2.add(7);
        list2.add(8);
        list2.add(10);
        System.out.println(beautifulTriplets(3, list2));
    }
}
