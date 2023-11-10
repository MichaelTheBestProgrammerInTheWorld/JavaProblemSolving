package november2023;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
https://www.hackerrank.com/challenges/flatland-space-stations/problem?isFullScreen=false
 */
public class FlatlandSpaceStations {


    static int flatlandSpaceStations(int n, int[] c) {


        List<Integer> minDistsList = new ArrayList<>();
        if (n == c.length){
            return 0;
        }

        for (int i=0; i<n; i++){
            int minDistance = n;
            for (int j=0; j<c.length; j++){
                int temp = 0;
                if (i>c[j]){
                    temp = i-c[j];
                } else {
                    temp = c[j]-i;
                }
                if (temp < minDistance){
                    minDistance = temp;
                }
            }
            minDistsList.add(minDistance);
        }

        return Collections.max(minDistsList);
    }

    public static void main(String[] args) {

        System.out.println(flatlandSpaceStations(3, new int[]{1}));
        System.out.println(flatlandSpaceStations(5, new int[]{0, 4}));
        System.out.println(flatlandSpaceStations(6, new int[]{0, 1, 2, 3, 4, 5}));
    }
}
