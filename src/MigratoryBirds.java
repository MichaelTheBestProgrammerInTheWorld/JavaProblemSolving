import java.util.*;

public class MigratoryBirds {

    // Complete the migratoryBirds function below.
    static int migratoryBirds(List<Integer> arr) {
/*
        int bird = 0;
        Map<Integer, Integer> sightsMap = new HashMap<>();
        for (int i=0; i< arr.size(); i++){

        }
*/
        Map<Integer, Integer> birdSights = new HashMap<>();
        Set<Integer> birds = new HashSet<>(arr);
        for (int bird : birds){
            birdSights.put(bird, Collections.frequency(arr, bird));
        }
        int max = Collections.max(birdSights.values());
        List<Integer> keys = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : birdSights.entrySet()) {
            if (entry.getValue()==max) {
                keys.add(entry.getKey());
            }
        }
        Collections.sort(keys);

        return keys.get(0);
    }

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(4);
        list.add(4);
        list.add(4);
        list.add(5);
        list.add(3);
        System.out.print(migratoryBirds(list));
    }
}
