package december2020;

public class GreatestCommonFactor {

    public static int MathChallenge(int num1, int num2) {
        // code goes here

        int comFactor = num1>num2 ? num2 : num1;
        while (comFactor > 0){
            if (num1%comFactor == 0 && num2%comFactor == 0){
                break;
            } else {
                comFactor--;
            }
        }

        return comFactor;
    }

    public static void main(String[] args) {

        System.out.println(MathChallenge(8, 8));
        System.out.println(MathChallenge(7, 3));
        System.out.println(MathChallenge(36, 54));
    }
}
