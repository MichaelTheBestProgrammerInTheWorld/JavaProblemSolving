package december2020;

public class TaumAndBday {

    public static long taumBday(int b, int w, int bc, int wc, int z) {
        // Write your code here

        long minCost = 0;

        if (bc == wc){
            minCost = (b*bc) + (w*wc);
        } else {
            int convertToBlack, convertToWhite, noConvert;
            convertToBlack = (b+w) * wc + (z*b);
            convertToWhite = (b+w) * bc + (z*w);
            noConvert = (b*bc) + (w*wc);
            minCost = convertToBlack<convertToWhite ? convertToBlack:convertToWhite;
            minCost = minCost<noConvert ? minCost:noConvert;
        }

        return minCost;
    }

    public static void main(String[] args) {

        System.out.println(taumBday(10, 10, 1, 1, 1));
        System.out.println(taumBday(5, 9, 2, 3, 4));
        System.out.println(taumBday(3, 6, 9, 1, 1));
        System.out.println(taumBday(7, 7, 4, 2, 1));
        System.out.println(taumBday(3, 3, 1, 9, 2));
        System.out.println(taumBday(3, 5, 3, 4, 1));
    }
}
