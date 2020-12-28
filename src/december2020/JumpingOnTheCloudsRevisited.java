package december2020;

public class JumpingOnTheCloudsRevisited {

    static int jumpingOnClouds(int[] c, int k) {

        int e = 100;
        for (int i=0; i<c.length; i+=k){
            if (c[i] == 1){
                e -= 2;
            }
            e--;
        }
        return e;
    }

    public static void main(String[] args) {

        int[] c = {0, 0, 1, 0};
        int[] c2 = {0, 0, 1, 0, 0, 1, 1, 0};
        int[] c3 = {1, 1, 1, 0, 1, 1, 0, 0, 0, 0};
        System.out.println(jumpingOnClouds(c, 2));
        System.out.println(jumpingOnClouds(c2, 2));
        System.out.println(jumpingOnClouds(c3, 3));
    }
}
