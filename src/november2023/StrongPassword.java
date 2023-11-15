package november2023;

/*
https://www.hackerrank.com/challenges/strong-password/problem?isFullScreen=false
 */
public class StrongPassword {


    public static int minimumNumber(int n, String password) {
        // Return the minimum number of characters to make the password strong
        final String  numbers = "0123456789";
        final String lower_case = "abcdefghijklmnopqrstuvwxyz";
        final String  upper_case = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        final String  special_characters = "!@#$%^&*()-+";
        boolean hasNumbers = false;
        boolean hasLowerCase = false;
        boolean hasUpperCase = false;
        boolean hasSpecialCharacter = false;
        int result = n;
        char[] arr = password.toCharArray();
        for (char c : arr){
            String s = String.valueOf(c);
            if (!hasNumbers){
                if (numbers.contains(s)){
                    hasNumbers = true;
                    continue;
                }
            }

            if (!hasLowerCase){
                if (lower_case.contains(s)){
                    hasLowerCase = true;
                    continue;
                }
            }

            if (!hasUpperCase){
                if (upper_case.contains(s)){
                    hasUpperCase = true;
                    continue;
                }
            }

            if (!hasSpecialCharacter){
                if (special_characters.contains(s)){
                    hasSpecialCharacter = true;
                }
            }
        }

        if (!hasNumbers){
            result++;
        }
        if (!hasLowerCase){
            result++;
        }
        if (!hasUpperCase){
            result++;
        }
        if (!hasSpecialCharacter){
            result++;
        }

        if (result < 6){
            result += (6-result);
        }

        return result-n;
    }


    public static void main(String[] args) {

        System.out.println(minimumNumber(5, "2bbbb"));
        System.out.println(minimumNumber(3, "Ab1"));
        System.out.println(minimumNumber(11, "#HackerRank"));
    }
}
