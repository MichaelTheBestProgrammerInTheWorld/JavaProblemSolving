public class UtopianTree {

    // Complete the utopianTree function below.
    static int utopianTree(int n) {

        int treeHeight = 1;
        for (int i=1; i<=n; i++){
            if (i%2 == 0){
                treeHeight++;
            } else {
                treeHeight *= 2;
            }
        }
        return treeHeight;
    }

    public static void main(String[] args) {

        System.out.println(utopianTree(0));
        System.out.println(utopianTree(1));
        System.out.println(utopianTree(4));
    }
}
