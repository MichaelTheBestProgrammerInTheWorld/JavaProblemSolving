import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class EqualizeTheArray {

    private static int equalizeArray(int[] arr) {

        int minDel = 0;

        Map<Integer, Integer> frequency = new HashMap<>();

        boolean visited[] = new boolean[arr.length];

        Arrays.fill(visited, false);

        // Traverse through array elements and
        // count frequencies
        for (int i = 0; i < arr.length; i++) {

            // Skip this element if already processed
            if (visited[i] == true)
                continue;

            // Count frequency
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    visited[j] = true;
                    count++;
                }
            }
            //System.out.println(arr[i] + " " + count);
            frequency.put(arr[i], count);
        }

        Map.Entry<Integer, Integer> maxEntry = null;

        for (Map.Entry<Integer, Integer> entry : frequency.entrySet())
        {
            if (maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0)
            {
                maxEntry = entry;
            }
        }

        //System.out.println(maxEntry.getKey() + "  " + maxEntry.getValue());

        for (int i=0; i<arr.length; i++){
            if (arr[i] != maxEntry.getKey()){
                minDel++;
            }
        }

        return minDel;
    }

    public static void main(String []args)
    {
        int arr[] = new int[]{ 10, 20, 20, 10, 10, 20, 5, 20, 10, 10 };
        int n = arr.length;
        System.out.println(equalizeArray(arr));
        System.out.println(equalizeArray(new int[]{3, 3, 2, 1, 3}));
    }
}
