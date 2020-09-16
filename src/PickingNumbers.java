import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PickingNumbers {

    //fail in 7 test cases out of 10
    public static int pickingNumbers(List<Integer> a) {
        // Write your code here
        List<Integer> subList = new ArrayList<>();
        Collections.sort(a);
            for (int i=0; i<a.size() && subList.isEmpty(); i++){
                for (int j=i+1; j<a.size(); j++){
                    if (j==a.size()-1 && !subList.isEmpty()){
                        break;
                    }
                    int first = a.get(i), second = a.get(j);
                    if (first == second){
                        if (subList.isEmpty()){
                            subList.add(first);
                        }
                        subList.add(second);
                    } else if (Math.abs(first-second) == 1){
                        if (subList.isEmpty()){
                            subList.add(first);
                        }
                        subList.add(second);
                    } else {
                        break;
                    }
                }
            }
        return subList.size();
    }

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(6);
        list.add(5);
        list.add(3);
        list.add(3);
        list.add(1);

        System.out.print(pickingNumbers2(list));
    }

    //100% correct
    public static int pickingNumbers2(List<Integer> a) {

        int frequency[] = new int[101];
        int result = Integer.MIN_VALUE;

        for (int i = 0; i < a.size(); i++) {
            int index = a.get(i);
            frequency[index]++; //frequency[index]=frequency[index]+1
        }

        for (int i = 1; i <= 100; i++) {
            result = Math.max(result, frequency[i] + frequency[i - 1]);
        }
        return result;
    }

}
