package january2021;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DiskSpaceAnalysis {

    public static int segment(int x, List<Integer> space) {
        // Write your code here


        List<Integer> segments = new ArrayList<>();
        List<Integer> minList = new ArrayList<>();
        for(int i=0; i<space.size()-x+1; i++){



            segments.addAll(space.subList(i, i+x));


        }

        for(int i=0; i<segments.size(); i++){

            Collections.sort(segments);
            minList.add(segments.get(0));
        }

        Collections.sort(minList, Collections.reverseOrder());
        int maxValue = minList.get(0);


        return maxValue;

    }


}
