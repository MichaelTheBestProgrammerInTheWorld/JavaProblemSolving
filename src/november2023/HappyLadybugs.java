package november2023;

public class HappyLadybugs {


    public static String happyLadybugs(String b) {
        // Write your code here
        //String result = "NO";
        char[] arr = b.toCharArray();
        int _counter = 0;
        for (char c : arr){
            if (c == '_') {
                _counter++;
            }
            String s = String.valueOf(c);
            int count = b.length() - b.replace(s, "").length();
            if (count == 1 && !s.equals("_")){
                return "NO";
            }
        }
        if (_counter == 0){
            return "NO";
        }
        /*
        this logic is not need and it's not accurate
        boolean notYet = true;
        while (notYet){
            notYet = false;

            for (int i=0; i< arr.length-1; i++){
                if (arr[i] != '_' && (arr[i+1] == '_' || arr[i-1] == '_' )){
                    for (int j=0; j< arr.length; j++){
                        if (i == j){
                            continue;
                        }
                        if (arr[i] == arr[j]){
                            if (arr[i-1] == '_'){
                                arr[i-1] = arr[j];
                                arr[j] = '_';
                                break;
                            } else {
                                arr[i+1] = arr[j];
                                arr[j] = '_';
                                break;
                            }

                        }
                    }
                }
            }
            for (int i=1; i< arr.length-1; i++){
                if (arr[i-1] != arr[i] && arr[i+1] != arr[i]){
                    //return "NO";
                    notYet = true;
                    break;
                }
            }

        }
*/
        return "YES";
    }

    public static void main(String[] args) {
        System.out.println(happyLadybugs("YYR_B_BR"));
        System.out.println(happyLadybugs("RBY_YBR"));  //w
        System.out.println(happyLadybugs("X_Y__X"));
        System.out.println(happyLadybugs("__"));
        System.out.println(happyLadybugs("B_RRBR"));

        System.out.println("Second Batch");

        System.out.println(happyLadybugs("AABBC"));   //w
        System.out.println(happyLadybugs("AABBC_C"));
        System.out.println(happyLadybugs("_"));
        System.out.println(happyLadybugs("DD__FQ_QQF"));  //w
        System.out.println(happyLadybugs("AABCBC"));
    }

}
