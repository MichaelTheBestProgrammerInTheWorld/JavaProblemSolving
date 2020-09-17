public class JumpingOnTheClouds {

    private static int jumpingOnClouds(int[] c) {

        int minJumps = 0;
        int i = 0;
        while (i < c.length-2){
            if (c[i+2] == 0){
                i += 2;
            } else {
                i++;
            }
            minJumps++;
        }
        if (i == c.length-2){
            if (c[i+1] == 0){
                minJumps++;
            }
        }
        return minJumps;
    }

    public static void main(String[] args) {

        System.out.println(jumpingOnClouds(new int[]{0, 0, 1, 0, 0, 1, 0}));
        System.out.println(jumpingOnClouds(new int[]{0, 0, 0, 0, 1, 0}));
        System.out.println(jumpingOnClouds(new int[]{0, 0, 0, 1, 0, 0}));
    }
}
