package july2023;

/*
https://www.hackerrank.com/challenges/jumping-on-the-clouds-revisited/problem?isFullScreen=true
 */
public class JumpingOnTheCloudsRevisited {

    // Complete the jumpingOnClouds function below.
    static int jumpingOnClouds(int[] c, int k) {
        int energy = 100;
        int cloudsLength = c.length;
        int cloudOn = 0;
        do{
            cloudOn = (cloudOn + k) % cloudsLength;
            if(c[cloudOn] == 1) energy -= 3;
            else energy -= 1;

        }while(cloudOn != 0);

        return energy;
    }

    public static void main(String[] args) {
        System.out.println(jumpingOnClouds(new int[]{0, 0, 1, 0}, 2));
        System.out.println(jumpingOnClouds(new int[]{0, 0, 1, 0,  0, 1, 1, 0}, 2));
    }
}
