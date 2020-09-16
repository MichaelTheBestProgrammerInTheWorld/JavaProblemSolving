public class CountingValleys {

    public static int countingValleys(int steps, String path) {
        // Write your code here
        int seaLevel = 0, valleySteps = 0, valleys = 0;
        for (int i=0; i<steps; i++){
            if (seaLevel==0 && valleySteps==0 && path.charAt(i)=='D'){
                seaLevel--;
                valleySteps--;
            } else if (valleySteps!=0 && path.charAt(i)=='D'){
                seaLevel--;
                valleySteps--;
            } else if (valleySteps!=0 && path.charAt(i)=='U'){
                seaLevel++;
                valleySteps++;
                if (valleySteps == 0){
                    valleys++;
                }
            } else if (seaLevel==0 && valleySteps==0 && path.charAt(i)=='U'){
                seaLevel++;
            } else if (seaLevel!=0 && valleySteps==0 && path.charAt(i)=='D'){
                seaLevel--;
            } else if (seaLevel!=0 && valleySteps==0 && path.charAt(i)=='U'){
                seaLevel++;
            }
        }

        return valleys;
    }

    public static void main(String[] args) {

        System.out.println(countingValleys(8, "UDDDUDUU"));
        System.out.print(countingValleys(12, "DDUUDDUDUUUD"));

    }
}
