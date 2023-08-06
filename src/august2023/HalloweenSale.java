package august2023;

/*
https://www.hackerrank.com/challenges/halloween-sale/problem?h_r=next-challenge&h_v=zen
 */
public class HalloweenSale {

    /*

    int p: the price of the first game
    int d: the discount from the previous game price
    int m: the minimum cost of a game
    int s: the starting budget

     */
    public static int howManyGames(int p, int d, int m, int s) {
        // Return the number of games you can buy
        int numOfGames = 0;
        while (s >= p){
            s -= p;
            numOfGames++;
            if ((p-d) > m){
                p -= d;
            } else {
                p = m;
            }

        }
        return numOfGames;
    }


    public static void main(String[] args) {
        System.out.println(howManyGames(20, 3, 6, 70));
        System.out.println(howManyGames(20, 3, 6, 80));
        System.out.println(howManyGames(20, 3, 6, 85));

    }
}
