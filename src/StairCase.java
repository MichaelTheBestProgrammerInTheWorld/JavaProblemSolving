public class StairCase {

/*

   #
  ##
 ###
####
Observe that its base and height are both equal to , and the image is drawn using # symbols and spaces. The last line is not preceded by any spaces.

Write a program that prints a staircase of size .

Function Description

Complete the staircase function in the editor below. It should print a staircase as described above.

staircase has the following parameter(s):

n: an integer
 */

    static void staircase(int n) {

        String hash = "#";
        int k = 0;
        for (int i=1; i<=n; i++){

            if (k != 0){
                System.out.print("\n");
            }
            //System.out.print("\n ");
            for (int j=0; j<=n-i-1; j++){
                System.out.print(" ");
            }
            k = 0;
             while (k<i){
                System.out.print(hash);
                k++;
            }

        }
    }

    public static void main(String[] args) {

        staircase(8);
    }
}
