package january2022;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
A video player plays a game in which the character competes
in a hurdle race. Hurdles are of varying heights, and the
characters have a maximum height they can jump. There is a
magic potion they can take that will increase their maximum
jump height by 1 unit for each dose. How many doses of the
potion must the character take to be able to jump all of the
hurdles. If the character can already clear all of the
hurdles, return 0
 */
public class TheHurdleRace {

    public static int hurdleRace(int k, List<Integer> height) {
        // Write your code here
        int dozes = 0;
        Collections.sort(height);
        int maxHeight = height.get(height.size()-1);
        if (maxHeight > k){
            dozes = maxHeight - k;
        }

        return dozes;
    }

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(2);
        System.out.println(hurdleRace(1, list));

        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(6);
        list2.add(3);
        list2.add(5);
        list2.add(2);
        System.out.println(hurdleRace(4, list2));

        List<Integer> list3 = new ArrayList<>();
        list3.add(2);
        list3.add(5);
        list3.add(4);
        list3.add(5);
        list3.add(2);
        System.out.println(hurdleRace(7, list3));
    }
}
