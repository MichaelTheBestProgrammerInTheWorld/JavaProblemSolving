package january2021;

import java.util.Collections;
import java.util.List;

public class ParkingDilemma {

    public static long carParkingRoof(List<Long> cars, int k) {
        // Write your code here

        Collections.sort(cars);
        int numOfCars = cars.size();
        long result = Long.MAX_VALUE;
        for(int i=0; i<numOfCars-k+1; i++){

            long length = cars.get(i+k-1) - cars.get(i);

            result = result<length ? result : length;
        }

        return result+1;

    }
}
