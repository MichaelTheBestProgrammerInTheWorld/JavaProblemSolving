import java.util.ArrayList;
import java.util.List;

public class SockMerchant {

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {

        int numberOfSocks = 0;
        int counter;
        List<Integer> pairedIndex = new ArrayList<>();
        for (int i=0; i< ar.length; i++){
            if (pairedIndex.contains(i))
                continue;
            counter = ar[i];
            for (int j=i+1; j< ar.length; j++){
                if (counter == ar[j]){
                    numberOfSocks++;
                    pairedIndex.add(j);
                    break;
                }
            }
        }

        return numberOfSocks;
    }

    public static void main(String[] args) {

        System.out.print(sockMerchant(9, new int[]{10, 20, 20, 10, 10, 30, 50, 10, 20}));
    }
}
