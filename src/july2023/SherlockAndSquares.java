package july2023;

/*
https://www.hackerrank.com/challenges/sherlock-and-squares/problem?h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen
 */
public class SherlockAndSquares {

    //my solution
    public static int squares(int a, int b) {
        // Write your code here
        int count = 0;
        for (double i=a; i<=b; i++){
            double sqrt = Math.sqrt(i);
            if (((int) sqrt) == sqrt){
                count++;
            }
        }

        return count;
    }

    //my optimal solution
    public static int squares2(int a, int b) {
        // Write your code here
        int sqrtA = (int) Math.sqrt(a);
        int sqrtB = (int) Math.sqrt(b);
        int result = sqrtB-sqrtA;
        if (((int) Math.sqrt(a)) == Math.sqrt(a)){
            result++;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(squares2(24, 49));
        System.out.println(squares2(3, 9));
        System.out.println(squares2(17, 24));
        System.out.println(squares2(100, 1000));
        System.out.println(squares2(35, 70));
    }
}
