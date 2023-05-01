package may2023;

public class BeautifulBinaryString {

    public static int beautifulBinaryString(String b) {
        // Write your code here
        int moves = 0;
        char[] chars = b.toCharArray();
        for (int i=1; i<chars.length-1; i++){
            if (chars[i] == '1' && chars[i-1] == '0' && chars[i+1] == '0'){
                chars[i+1] = '1';
                moves++;
            }
        }
        return moves;
    }

    public static void main(String[] args) {
        System.out.println(beautifulBinaryString("0101010"));
        System.out.println(beautifulBinaryString("01100"));
        System.out.println(beautifulBinaryString("0100101010"));
    }
}
