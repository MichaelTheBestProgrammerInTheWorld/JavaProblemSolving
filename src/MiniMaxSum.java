import java.util.Arrays;

public class MiniMaxSum {

    static void miniMaxSum(int[] arr) {

        Arrays.sort(arr);
        long minSum = 0;
        long maxSum = 0;
        for (int i=0; i<4; i++){
            minSum += arr[i];
        }
        for (int i=1; i<5; i++){
            maxSum += arr[i];
        }

        System.out.print(minSum + " " + maxSum);
    }

    public static void main(String[] args) {

        miniMaxSum(new int[]{4, 5, 1, 2, 3});
    }

}
