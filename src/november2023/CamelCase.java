package november2023;

/*
https://www.hackerrank.com/challenges/camelcase/problem?isFullScreen=false
 */
public class CamelCase {

    public static int camelcase(String s) {
        // Write your code here
        char[] chars = s.toCharArray();
        int numOfWords = 1;
        for (char c : chars){
            if (Character.isUpperCase(c)){
                numOfWords++;
            }
        }
        return numOfWords;
    }

    public static void main(String[] args) {

        System.out.println(camelcase("oneTwoThree"));
        System.out.println(camelcase("saveChangesInTheEditor"));


    }
}
