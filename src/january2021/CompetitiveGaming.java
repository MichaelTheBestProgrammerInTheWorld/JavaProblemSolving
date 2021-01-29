package january2021;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CompetitiveGaming {

    public static int numPlayers(int k, List<Integer> scores) {
        // Write your code here
        scores.sort(Collections.reverseOrder());
        int number = 0,counter = 1;
        int[] mark = new int[scores.size()],rank = new int[scores.size()];
        Map<Integer,Integer> map  = new HashMap<Integer,Integer>();
        for (int i = 0; i < scores.size(); i++) {
            map.put(scores.get(i), (map.get(scores.get(i)) != null) ? map.get(scores.get(i)) : counter);
            mark[i] = scores.get(i);
            rank[i] = (int) map.get(scores.get(i));
            counter++;
            if(mark[i] > 0 && k >= rank[i]){
                number++;
            }
        }
        return number;

    }
}
