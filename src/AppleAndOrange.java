import org.w3c.dom.ranges.Range;

import java.time.temporal.ValueRange;

public class AppleAndOrange {

    // Complete the countApplesAndOranges function below.
    static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {

        ValueRange samHouse = java.time.temporal.ValueRange.of(s, t);
        int numApples = 0, numOranges = 0;
        for (int i=0; i< apples.length; i++){
            apples[i] += a;
            if (samHouse.isValidIntValue(apples[i])){
                numApples++;
            }
        }
        for (int i=0; i< oranges.length; i++){
            oranges[i] += b;
            if (samHouse.isValidIntValue(oranges[i])){
                numOranges++;
            }
        }
        System.out.println(numApples);
        System.out.println(numOranges);
    }

    public static void main(String[] args) {

        countApplesAndOranges(7, 10, 4, 12, new int[]{2, 3, -4}, new int[]{3, -2, -4});
    }
}
