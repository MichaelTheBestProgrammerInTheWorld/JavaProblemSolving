package november2023;

import java.util.ArrayList;
import java.util.List;

/*
https://www.hackerrank.com/challenges/strange-code/problem
 */
public class StrangeCounter {


    //working
    public static long strangeCounter(long t){
        // Write your code here
        long time = 1;
        long value = 3;
        int initialValue = 3;
        for (long i=time; i<t; i++){
            if (value > 1){
                value--;
            } else {
                initialValue *= 2;
                value = initialValue;
            }
        }

        return value;
    }

    //working with optimized time complexity
    public static long strangeCounter2(long t) {
        // Write your code here
        long time = 1;
        long value = 3;
        List<Long> peak = new ArrayList<>();
        while (time < t){
            time += value;
            value = time + 2;
            peak.add(time);
        }
        while (time > t){
            if (peak.contains(time)){
                value = value - time-1;
            } else {
                value++;
            }
            time--;
        }
        return value;
    }


    public static void main(String[] args) {
        System.out.println(strangeCounter(1));
        System.out.println(strangeCounter(2));
        System.out.println(strangeCounter(3));
        System.out.println(strangeCounter(4));
        System.out.println(strangeCounter(5));
        System.out.println(strangeCounter(6));
        System.out.println(strangeCounter(7));
        System.out.println(strangeCounter(8));
        System.out.println(strangeCounter(9));
        System.out.println(strangeCounter(10));
        System.out.println(strangeCounter(11));
        System.out.println(strangeCounter(12));
        System.out.println(strangeCounter(13));
        System.out.println(strangeCounter(14));
        System.out.println(strangeCounter(15));
        System.out.println(strangeCounter(16));
        System.out.println(strangeCounter(17));
        System.out.println(strangeCounter(18));
        System.out.println(strangeCounter(19));
        System.out.println(strangeCounter(20));
        System.out.println(strangeCounter(21));
        System.out.println("Edge cases");
        System.out.println(strangeCounter2(99999997668L));
    }

}
