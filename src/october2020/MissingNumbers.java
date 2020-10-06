package october2020;

import java.util.*;

public class MissingNumbers {

    static int[] missingNumbers(int[] arr, int[] brr) {


        List<Integer> missingList = new ArrayList<>();

//        countFreq(arr, arr.length);
//        System.out.println("-----------------------------------------------------------");
//        countFreq(brr, brr.length);

        Map<Integer, Integer> incompleteHashMap = new HashMap();
        Map<Integer, Integer> originalHashMap = new HashMap();

        incompleteHashMap.putAll(countFreq(arr, arr.length));
        originalHashMap.putAll(countFreq(brr, brr.length));

        for (Map.Entry<Integer, Integer> entry : originalHashMap.entrySet()) {
            //System.out.println(entry.getKey() + "/" + entry.getValue());

            if (incompleteHashMap.containsKey(entry.getKey())){
                if (incompleteHashMap.get(entry.getKey()) < entry.getValue()){
                    missingList.add(entry.getKey());
                }

            } else {
                missingList.add(entry.getKey());
            }
        }

        Collections.sort(missingList);
        int [] missingArr = new int[missingList.size()];
        for(int i = 0; i < missingList.size(); i++) missingArr[i] = missingList.get(i);

        return missingArr;
    }

    public static Map<Integer, Integer> countFreq(int arr[], int n)
    {
        Map<Integer, Integer> frequencyHashMap = new HashMap();
        boolean visited[] = new boolean[n];

        Arrays.fill(visited, false);

        // Traverse through array elements and
        // count frequencies
        for (int i = 0; i < n; i++) {

            // Skip this element if already processed
            if (visited[i] == true)
                continue;

            // Count frequency
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    visited[j] = true;
                    count++;
                }
            }
            //System.out.println(arr[i] + " " + count);
            frequencyHashMap.put(arr[i], count);
        }
        return frequencyHashMap;
    }

    public static void main(String[] args) {

        int[] arr = new int[]{203, 204, 205, 206, 207, 208, 203, 204, 205, 206
        };
        int[] brr = new int[]{203, 204, 204, 205, 206, 207, 205, 208, 203, 206, 205, 206, 204};

        int[] result = missingNumbers(arr, brr);
        for (int i=0; i< result.length; i++){
            System.out.println(result[i]);
        }
    }
}
