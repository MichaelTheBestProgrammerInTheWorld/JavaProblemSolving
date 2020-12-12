package december2020;

public class ReversedStringChallenge {

    public static String StringChallenge(String str) {
        // code goes here

        int revIndex = 0;
        char[] revArray = new char[str.length()];
        for (int i=str.length()-1; i>=0; i--){
            revArray[revIndex++] = str.charAt(i);
        }

        return String.valueOf(revArray);
    }

    public static void main(String[] args) {

        System.out.println(StringChallenge("Hello String"));
        System.out.println(StringChallenge("Welcome to Coderbyte"));
    }
}
