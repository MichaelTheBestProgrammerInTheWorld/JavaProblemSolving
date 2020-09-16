public class CatsAndaMouse {

    static String catAndMouse(int x, int y, int z) {

        String result = "";
        int catA = 0, catB = 0;
        if (z>x){
            catA = z-x;
        } else {
            catA = x-z;
        }
        if (z>y){
            catB = z-y;
        } else {
            catB = y-z;
        }
        if (catA < catB){
            result = "Cat A";
        } else if (catA > catB){
            result = "Cat B";
        } else if (catA == catB){
            result = "Mouse C";
        }

        return result;
    }

    public static void main(String[] args) {

        System.out.println(catAndMouse(1, 2, 3));
        System.out.println(catAndMouse(1, 3, 2));
    }
}
