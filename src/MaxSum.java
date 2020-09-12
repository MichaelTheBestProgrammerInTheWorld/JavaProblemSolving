import java.util.Arrays;
import java.util.List;

public class MaxSum {

    public static int findMaxSum(List<Integer> list) {
        //throw new UnsupportedOperationException("Waiting to be implemented.");

        int maxSum = list.get(0) + list.get(1);
        for (int i=0; i< list.size(); i++){
            for (int j=i+1; j< list.size(); j++){
                if (list.get(i) + list.get(j) > maxSum){
                    maxSum = list.get(i) + list.get(j);
                }
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5, 9, 7, 11);
        System.out.println(findMaxSum(list));
    }
}
