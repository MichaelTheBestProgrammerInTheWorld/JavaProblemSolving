package may2023;

public class AlternatingCharacters {

    public static int alternatingCharacters(String s) {
        // Write your code here
        int delete = 0;
        char[] chars = s.toCharArray();
        for (int i=1; i<chars.length; i++){
            if (chars[i] == chars[i-1]){
                delete++;
            }
        }
        return delete;
    }

    public static void main(String[] args) {
        System.out.println(alternatingCharacters("AABAAB"));
        System.out.println(alternatingCharacters("AAAA"));
        System.out.println(alternatingCharacters("BBBBB"));
        System.out.println(alternatingCharacters("ABABABAB"));
        System.out.println(alternatingCharacters("BABABA"));
        System.out.println(alternatingCharacters("AAABBB"));
    }
}
