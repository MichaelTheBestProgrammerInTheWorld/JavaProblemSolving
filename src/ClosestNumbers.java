import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ClosestNumbers {

    static int[] closestNumbers(int[] arr) {

        List<Integer> answerList = new ArrayList<>();
        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        Collections.sort(list);
        int minDifference = Math.abs(list.get(0) - list.get(1));
        for (int i=1; i< list.size()-1; i++){
            int tempDiff = Math.abs(list.get(i) - list.get(i+1));
            if (tempDiff < minDifference){
                minDifference = tempDiff;
            }
        }
        for (int i=0; i< list.size()-1; i++){
            int tempDiff = Math.abs(list.get(i) - list.get(i+1));
            if (tempDiff == minDifference){
                answerList.add(list.get(i));
                answerList.add(list.get(i+1));
            }
        }
        int[] answerArray = new int[answerList.size()];
        for(int i = 0; i < answerList.size(); i++){
            answerArray[i] = answerList.get(i);
         }
        return answerArray;
    }

    public static void main(String[] args) {

        int[] a = new int[]{-20, -3916237, -357920, -3620601, 7374819, -7330761, 30, 6246457, -6461594,
                266854};
        int[] b = new int[]{-20, -3916237, -357920, -3620601, 7374819, -7330761, 30, 6246457, -6461594, 266854,
                -520, -470 };
        int[] c = new int[]{5, 4, 3, 2};

        for (int i=0; i<closestNumbers(a).length; i++){
            System.out.println(closestNumbers(a)[i]);
        }
        System.out.println("break");
        for (int i=0; i<closestNumbers(b).length; i++){
            System.out.println(closestNumbers(b)[i]);
        }
        System.out.println("break");
        for (int i=0; i<closestNumbers(c).length; i++){
            System.out.println(closestNumbers(c)[i]);
        }

    }
}
