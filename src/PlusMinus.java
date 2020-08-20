import java.text.DecimalFormat;

public class PlusMinus {

    static void plusMinus(int[] arr) {

        int plus = 0;
        int minus = 0;
        int zero = 0;
        int length = arr.length;
        for(int i=0; i<length; i++){
            if(arr[i] > 0){
                plus++;
            } else if(arr[i] < 0){
                minus++;
            } else if(arr[i] == 0){
                zero++;
            }
        }
        float plusRatio = (float) plus/ length;
        float minusRatio = (float) minus/length;
        float zeroRatio = (float) zero/length;

        System.out.printf("%.6f\n", plusRatio);
        System.out.printf("%.6f\n", minusRatio);
        System.out.printf("%.6f\n", zeroRatio);

    }

    public static void main(String[] args) {

        plusMinus(new int[]{1, 2, 3, -4, -5, 0});
    }
}
