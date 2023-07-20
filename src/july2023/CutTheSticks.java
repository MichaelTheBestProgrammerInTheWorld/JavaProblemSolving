package july2023;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
https://www.hackerrank.com/challenges/cut-the-sticks/problem?h_r=next-challenge&h_v=zen
 */
public class CutTheSticks {

    //my solution using recursion and independent algorithms from Java Collections API
    public static List<Integer> cutTheSticks(List<Integer> arr) {
        // Write your code here
        List<Integer> result = new ArrayList<>();
        result.add(arr.size());
        List<Integer> temp = arr;
        //int shortest = Collections.min(arr);
        int shortest = temp.get(0);
        int shortestIndex = 0;
        temp.set(0, 0);
        for (int i=1; i< temp.size(); i++){
            if (temp.get(i) < shortest){
                int difference = shortest - temp.get(i);
                for (int j=0; j<i; j++){
                    temp.set(j, temp.get(j) + difference);
                }
                shortest = temp.get(i);
                shortestIndex = i;
            } else {
                temp.set(i, temp.get(i)-shortest);
            }
        }
        temp.remove(shortestIndex);
        while (arr.remove((Object) shortest) || temp.remove((Object) 0)){}
        result.add(arr.size());
        if (temp.size() > 0){     //base case
            return cutTheSticks(temp);   //call function recursively until temp length reaches 0
        } else {
            return result;
        }

//        System.out.println(temp);
//        System.out.println("shortest is " + shortest);

    }

    //my solution using independent algorithms from Java Collections API without recursion
    //working fine but fails in some test cases
    public static List<Integer> cutTheSticks3(List<Integer> arr){
        // Write your code here
        List<Integer> result = new ArrayList<>();
        result.add(arr.size());
        //List<Integer> temp = arr;  //this line is wrong because any change will
        // be done on temp will reflect on arr too
        List<Integer> temp = new ArrayList<>();
        temp.addAll(arr);
        //int shortest = Collections.min(arr);

        while (temp.size() > 0){     //base case
            int shortest = temp.get(0);
            int shortestIndex = 0;
            temp.set(0, 0);
            for (int i=1; i< temp.size(); i++){
                if (temp.get(i) < shortest){
                    int difference = shortest - temp.get(i);
                    for (int j=0; j<i; j++){
                        if (j==shortestIndex){
                            continue;
                        }
                        temp.set(j, temp.get(j) + difference);
                    }
                    shortest = temp.get(i);
                    shortestIndex = i;
                } else {
                    temp.set(i, temp.get(i)-shortest);
                }
            }
            temp.remove(shortestIndex);
            while (arr.remove((Object) shortest) || temp.remove((Object) 0)){}
            //result.add(arr.size());
            if (temp.size() > 0){
                result.add(temp.size());
            }
        }

//        System.out.println(temp);
//        System.out.println("shortest is " + shortest);
//        if (temp.size() > 0){
//            return cutTheSticks(temp);   //call function recursively until temp length reaches 0;
//        } else {
//            return result;
//        }
        return result;
    }

    //my solution using Java Collections API and recursion : not working
    public static List<Integer> cutTheSticks2(List<Integer> arr){
        List<Integer> result = new ArrayList<>();
        result.add(arr.size());
        List<Integer> temp = arr;
        int shortest = Collections.min(arr);
        while (temp.remove((Object) shortest)){}
        for (int i=0; i< temp.size(); i++){
            temp.set(i, temp.get(i)-shortest);
        }
        result.add(temp.size());
        if (temp.size() > 0){     //base case
            cutTheSticks2(temp);   //call function recursively until temp length reaches 0
        }

        return result;
    }

    //my solution using Java Collections API working 100% on all test cases
    public static List<Integer> cutTheSticks4(List<Integer> arr){
        List<Integer> result = new ArrayList<>();
        result.add(arr.size());
        List<Integer> temp = arr;
        while (temp.size() > 0){
            int shortest = Collections.min(arr);
            while (temp.remove((Object) shortest)){}
            for (int i=0; i< temp.size(); i++){
                temp.set(i, temp.get(i)-shortest);
            }
            if (temp.size() > 0){
                result.add(temp.size());
            }
        }

        return result;
    }

    public static void main(String[] args) {
        List<Integer> test1 = new ArrayList<>();
        test1.add(1);
        test1.add(2);
        test1.add(3);
        //System.out.println(cutTheSticks3(test1));
        //System.out.println(cutTheSticks(test1));
        //System.out.println(cutTheSticks2(test1));
        System.out.println(cutTheSticks4(test1));
        List<Integer> test2 = new ArrayList<>();
        test2.add(5);
        test2.add(4);
        test2.add(4);
        test2.add(2);
        test2.add(2);
        test2.add(8);
        //System.out.println(cutTheSticks3(test2));
        //System.out.println(cutTheSticks(test2));
        //System.out.println(cutTheSticks2(test2));
        System.out.println(cutTheSticks4(test2));
        List<Integer> test3 = new ArrayList<>();
        test3.add(1);
        test3.add(2);
        test3.add(3);
        test3.add(4);
        test3.add(3);
        test3.add(3);
        test3.add(2);
        test3.add(1);
        //System.out.println(cutTheSticks3(test3));
        //System.out.println(cutTheSticks(test3));
        //System.out.println(cutTheSticks2(test3));
        System.out.println(cutTheSticks4(test3));

    }
}
