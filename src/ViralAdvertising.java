public class ViralAdvertising {

    private static int viralAdvertising(int n) {

        int day = 1, shared = 5, liked = 2, cumulative = 2;
        for (int i=day+1; i<=n; i++){
            shared = liked * 3;
            liked = shared / 2;
            cumulative += liked;
        }

        return cumulative;
    }

    public static void main(String[] args) {

        System.out.println(viralAdvertising(5));
        System.out.println(viralAdvertising(3));
    }
}
