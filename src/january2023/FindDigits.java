package january2023;

public class FindDigits {

    public static int findDigits(int n) {
        // Write your code here

        int num =n;
        int c=0;
        while(num!=0){
            int rem = num%10;
            if(rem!=0 && n%rem ==0)
                c++;
            num= num/10;
        }
        return c;
    }

    public static void main(String[] args) {

        System.out.println(findDigits(12));
        System.out.println(findDigits(1012));
    }
}
