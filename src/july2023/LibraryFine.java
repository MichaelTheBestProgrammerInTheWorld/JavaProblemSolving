package july2023;

/*
https://www.hackerrank.com/challenges/library-fine/problem?h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen
 */
public class LibraryFine {

    public static int libraryFine(int d1, int m1, int y1, int d2, int m2, int y2) {
        // Write your code here
        int yearsLate = y1 - y2;
        int monthsLate = yearsLate < 0 ? 0 : m1 - m2;
        int daysLate = monthsLate < 0 ? 0 : d1 - d2;
        if(yearsLate < 0) return 0;
        if(yearsLate > 0) return 10000;
        if(monthsLate > 0) return 500 * monthsLate;
        if(daysLate > 0) return 15 * daysLate;
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(libraryFine(9, 6, 2015, 6, 6, 2015));
        System.out.println(libraryFine(14, 7, 2018, 5, 7, 2018));
        System.out.println(libraryFine(14, 7, 2018, 5, 3, 2018));
        System.out.println(libraryFine(14, 7, 2018, 5, 7, 2017));
        System.out.println(libraryFine(14, 7, 2007, 5, 5, 2008));
    }
}
