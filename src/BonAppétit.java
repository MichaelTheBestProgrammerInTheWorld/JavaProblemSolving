import java.util.ArrayList;
import java.util.List;

public class BonAppétit {

    // Complete the bonAppetit function below.
    static void bonAppetit(List<Integer> bill, int k, int b) {

        int split = 0, brian = 0;
        for (int i=0; i< bill.size(); i++){
            if (i == k){
                brian = bill.get(i);
            } else {
                split += bill.get(i);
            }
        }
        if (split/2 == b){
            System.out.print("Bon Appetit");
        } else {
            System.out.print(b - (split/2));
        }
    }

    public static void main(String[] args) {

        List<Integer> sampleBill = new ArrayList<>();
        sampleBill.add(3);
        sampleBill.add(10);
        sampleBill.add(2);
        sampleBill.add(9);

        bonAppetit(sampleBill, 1, 7);
        bonAppetit(sampleBill, 1, 12);
    }
}
