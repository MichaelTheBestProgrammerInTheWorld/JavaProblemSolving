public class Kangaroo {

    static String kangaroo(int x1, int v1, int x2, int v2) {

        String result = "NO";
        if (x1+v1 == x2+v2){
            result = "YES";
        } else {
            do {
                x1 += v1;
                x2 += v2;
                if (x1+v1 == x2+v2){
                    result = "YES";
                }
            } while (x1<10000 || x2<10000);
        }
        return result;
    }

    public static void main(String[] args) {

        System.out.print(kangaroo(0, 2, 5, 3));
    }

    static String kangaroo2(int x1, int v1, int x2, int v2) {

        String response = "NO";
        boolean canCatchUp = (v2 < v1);
        if(canCatchUp) {
            boolean willIntersectOnLand = (x1 - x2) % (v2 - v1) == 0;
            if(willIntersectOnLand) {
                response = "YES";
            }
        }
        return response;
    }
}
