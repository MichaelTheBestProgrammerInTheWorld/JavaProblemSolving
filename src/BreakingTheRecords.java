public class BreakingTheRecords {

    // Complete the breakingRecords function below.
    static int[] breakingRecords(int[] scores) {

        int countMax = 0, countMin = 0;
        int currentMax = scores[0];
        int currentMin = scores[0];
        for (int i=0; i< scores.length; i++){
            if (scores[i] > currentMax){
                countMax++;
                currentMax = scores[i];
            } else if (scores[i] < currentMin){
                countMin++;
                currentMin = scores[i];
            }
        }
        return new int[]{countMax, countMin};
    }

    public static void main(String[] args) {

        int[] results = breakingRecords(new int[]{10, 5, 20, 20, 4, 5, 2, 25, 1});
        System.out.print(results[0] + " , " +  results[1]);
    }
}
