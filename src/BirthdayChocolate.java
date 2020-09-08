import java.util.ArrayList;
import java.util.List;

public class BirthdayChocolate {

    // Complete the birthday function below.
    static int birthday(List<Integer> s, int d, int m) {

        int result = 0;
        int sum=0;

        int i=0;
        while (m+i <= s.size()){
            for (int j=i; j<m+i; j++){
                sum += s.get(j);
            }
            if (sum == d){
                result++;
            }
            i++;
            sum = 0;
        }


        return result;
    }

    public static void main(String[] args) {

        List<Integer> s = new ArrayList<>();
        s.add(1);
        s.add(2);
        s.add(1);
        s.add(3);
        s.add(2);
        System.out.print(birthday(s, 3, 2));
    }
}
