public class BeautifulDaysAtTheMovies {

    private static int beautifulDays(int i, int j, int k) {

        int counter = 0;
        for (int l=i; l<=j; l++){
            int num = l, reversed = 0;
            while(num != 0) {
                int digit = num % 10;
                reversed = reversed * 10 + digit;
                num /= 10;
            }

            if ((l - reversed)%k == 0){
                counter++;
            }
        }

        return counter;
    }

    public static void main(String[] args) {

        System.out.println(beautifulDays(20, 23, 6));
        System.out.println(beautifulDays(13, 45, 3));
    }
}
