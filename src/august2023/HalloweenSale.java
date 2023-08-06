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
            if (p > m){
                p -= d;
            } else {
                p = m;
            }

        }
        return numOfGames;
    }

    //optimal solution works 100% with all test cases
    public static int howManyGames2(int p, int d, int m, int s) {
        // Return the number of games you can buy
        int qty=0;
        int sum = p;
        int cost = 0;
        int newPrice = p;
        while(sum<=s){
            qty++;
            if(newPrice-d<=m)newPrice = m;
            else{
                newPrice -= d;
            }
            cost = newPrice;
            sum += cost;
        }
        return qty;
    }

    public static void main(String[] args) {
        System.out.println(howManyGames(20, 3, 6, 70));
        System.out.println(howManyGames(20, 3, 6, 80));
        System.out.println(howManyGames(20, 3, 6, 85));

    }
}
