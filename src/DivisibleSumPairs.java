public class DivisibleSumPairs {

    // Complete the divisibleSumPairs function below.
    static int divisibleSumPairs(int n, int k, int[] ar) {

        int result = 0;
        for (int i=0; i<n; i++){
            for (int j=1; j<n; j++){
                if (i<j && (ar[i] + ar[j])%k == 0){
                    result++;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {

        System.out.print(divisibleSumPairs(6, 3, new int[]{1, 3, 2, 6, 1, 2}));
    }
}
