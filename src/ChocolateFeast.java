public class ChocolateFeast {

    //failed in 9/11 test cases
    private static int chocolateFeast(int n, int c, int m) {

        int inHandChocolate = n/c;
        int eatenChocolate = inHandChocolate;
        //int wraps = boughtChocolate;
        while (inHandChocolate >= m){
            //eatenChocolate += inHandChocolate/ m;
            int freeChocolate = inHandChocolate/ m;
            inHandChocolate -= m;
            inHandChocolate += freeChocolate;
            //wraps = boughtChocolate + freeChocolate;
            eatenChocolate += freeChocolate;
        }
        return eatenChocolate;
    }

    public static void main(String[] args) {

//        int i = 5/4;
//        System.out.println(i);
        System.out.println(chocolateFeast2(10, 2, 5));
        System.out.println(chocolateFeast2(12, 4, 4));
        System.out.println(chocolateFeast2(6, 2, 2));
    }

    //100% correct
    private static int chocolateFeast2(int n, int c, int m) {

        int chocs = n / c;  //chocolates bought with Money
        int wrapper = chocs; //wrappers from chocolate
        int ex_chocs = wrapper / m; //chocolates from wrappers
        while (wrapper >= m) {
            ex_chocs = ex_chocs + (wrapper / m + wrapper % m) / m;
            wrapper = wrapper / m;
        }
        //System.out.println(chocs + ex_chocs);
        return chocs + ex_chocs;
    }
}
