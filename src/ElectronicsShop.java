import java.util.Arrays;

public class ElectronicsShop {

    //this fails in 3 test cases out of 16
    static int getMoneySpent(int[] keyboards, int[] drives, int b) {

        int price = -1;
        for (int i=0; i< keyboards.length; i++){
            for (int j=0; j< drives.length; j++){
                int local = keyboards[i] + drives[j];
                if (local>price && local<b){
                    price = local;
                }
            }
        }
        return price;
    }

    public static void main(String[] args) {

        System.out.println(getMoneySpent2(new int[]{3, 1}, new int[]{5, 2, 8}, 10));
        System.out.println(getMoneySpent2(new int[]{4}, new int[]{5}, 5));
    }

    //that is the one correct in all test cases
    static int getMoneySpent2(int[] keyboards, int[] drives, int b) {

        Arrays.sort(keyboards);
        Arrays.sort(drives);
        int min;
        if(keyboards[0] + drives[0] > b){
            return -1;
        }else{
            int smallestBoard = 0;
            int largestDrive = drives.length-1;
            while(keyboards[smallestBoard] + drives[largestDrive] > b && largestDrive >=0){
                largestDrive--;
            }
            min = b - keyboards[smallestBoard] - drives[largestDrive];
            int diff;
            while(smallestBoard <keyboards.length && largestDrive>=0){
                diff = b - keyboards[smallestBoard] - drives[largestDrive];
                if(diff>=0){
                    if(diff<min){
                        min = diff;
                    }
                    smallestBoard++;
                }else{
                    largestDrive--;
                }
            }
        }
        return b-min;
    }
}
