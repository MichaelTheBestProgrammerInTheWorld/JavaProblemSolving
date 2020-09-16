
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class DesignerPDFViewer {


    // Complete the designerPdfViewer function below.
    static int designerPdfViewer(int[] h, String word) {

        Map<Character, Integer> alphabetsMap = new HashMap<>();
        alphabetsMap.put('a', h[0]);
        alphabetsMap.put('b', h[1]);
        alphabetsMap.put('c', h[2]);
        alphabetsMap.put('d', h[3]);
        alphabetsMap.put('e', h[4]);
        alphabetsMap.put('f', h[5]);
        alphabetsMap.put('g', h[6]);
        alphabetsMap.put('h', h[7]);
        alphabetsMap.put('i', h[8]);
        alphabetsMap.put('j', h[9]);
        alphabetsMap.put('k', h[10]);
        alphabetsMap.put('l', h[11]);
        alphabetsMap.put('m', h[12]);
        alphabetsMap.put('n', h[13]);
        alphabetsMap.put('o', h[14]);
        alphabetsMap.put('p', h[15]);
        alphabetsMap.put('q', h[16]);
        alphabetsMap.put('r', h[17]);
        alphabetsMap.put('s', h[18]);
        alphabetsMap.put('t', h[19]);
        alphabetsMap.put('u', h[20]);
        alphabetsMap.put('v', h[21]);
        alphabetsMap.put('w', h[22]);
        alphabetsMap.put('x', h[23]);
        alphabetsMap.put('y', h[24]);
        alphabetsMap.put('z', h[25]);

        int[] wordHeights = new int[word.length()];
        for (int i=0; i<word.length(); i++){
            wordHeights[i] = alphabetsMap.get(word.charAt(i));
        }

        int max = wordHeights[0];
        for (int i=0; i<wordHeights.length; i++){
            if(max < wordHeights[i]){
                max = wordHeights[i];
            }
        }
        return max * wordHeights.length;
    }

    public static void main(String[] args) {

        System.out.println(designerPdfViewer(new int[]{1, 3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5,
                5, 5, 5, 5, 5, 5, 5}, "abc"));
        System.out.println(designerPdfViewer(new int[]{1, 3, 1, 3, 1, 4, 1, 3, 2, 5 ,5, 5, 5, 5, 5, 5, 5, 5, 5,
                5, 5, 5, 5, 5, 5, 7}, "zaba"));
    }
}
