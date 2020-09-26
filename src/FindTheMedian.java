import java.util.Arrays;

public class FindTheMedian {

    static int findMedian(int[] arr) {

        Arrays.sort(arr);
        int medianIndex = (arr.length/2);
        return arr[medianIndex];
    }

    public static void main(String[] args) {

        System.out.println(findMedian(new int[]{0, 1, 2, 4, 6, 5, 3}));
        System.out.println(findMedian(new int[]{ 4, 6, 5, 3, 7, 15, 2, 16, 8}));
    }
}
