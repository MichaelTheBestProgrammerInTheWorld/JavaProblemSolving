public class DrawingBook {

    /*
     * Complete the pageCount function below.
     */
    static int pageCountFalse(int n, int p) {

        int minPagesTurned = 0;
        if (p == n || p == 1 || p == n-1){
            return minPagesTurned;
        } else {
            minPagesTurned++;
            if (p <= (n/2)){
                for (int i=2; i<=n; i+=2){

                    if (p == i || p == i+1){
                        break;
                    } else {
                        minPagesTurned++;
                    }
                }
            } else {
//                if (n%2 ==0){
//                    for (int i=n-2; i>=2; i-=2){
//
//                        if (p == i || p == i-1){
//                            break;
//                        } else {
//                            minPagesTurned++;
//                        }
//                    }
//                } else {
//                    for (int i=n-1; i>=2; i-=2){
//
//                        if (p == i || p == i-1){
//                            break;
//                        } else {
//                            minPagesTurned++;
//                        }
//                    }
//                }
                minPagesTurned = 0;
                for (int i=n; i>=2; i-=2){

                        if (p == i || p == i-1){
                            break;
                        } else {
                            minPagesTurned++;
                        }
                    }
            }
        }

        return minPagesTurned;
    }

    //MORE ACCURATE
    static int pageCount(int n, int p) {
        int totalPageTurnCountFromFront = n / 2;
        int targetPageTurnCountFromFront = p / 2;
        int targetPageTurnCountFromBack = totalPageTurnCountFromFront - targetPageTurnCountFromFront;

        return Math.min(targetPageTurnCountFromFront, targetPageTurnCountFromBack);
    }


    public static void main(String[] args) {

//        System.out.println(pageCount(6, 2));
//        System.out.println(pageCount(5, 4));
        System.out.println(pageCount(13, 10));
    }
}
