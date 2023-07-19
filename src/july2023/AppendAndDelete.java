package july2023;

/*
https://www.hackerrank.com/challenges/append-and-delete/problem?h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen
 */
public class AppendAndDelete {

    //my solution fails in 3 tests out of 14
    public static String appendAndDelete(String s, String t, int k) {
        // Write your code here
        String result = "No";
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        int l1 = 0;
        int l2 = 0;
        while (l2 < tArray.length && l1 < sArray.length && k > 0){
            if (sArray[l1] != tArray[l2]){
                sArray[l1] = tArray[l2];
                k -= 2;
            }
            String s2 = new String(sArray);
            String t2 = new String(tArray);
            if (s2.equals(t2)){
                result = "Yes";
                return result;
            } else {
                l1++;
                l2++;
            }
        }
        if ((sArray.length-1-l1 < k)){
            result = "Yes";
        } else if (l1 < l2 && k > l2-l1){
            result = "Yes";
        }
        return result;

    }

    public static String appendAndDeleteTest(String s, String t, int k) {
        // Write your code here
        if (s.equals(t)){
            return "Yes";
        }
        String result = "No";
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        int l1 = sArray.length-1;
        int l2 = tArray.length-1;
        if (l1 == l2){
            while (l1 >= 0 && l2 >= 0 && k > 0){
                if (sArray[l1] != tArray[l2]){
                    sArray[l1] = tArray[l2];
                    k -= 2;
                }
                String s2 = new String(sArray);
                String t2 = new String(tArray);
                if (s2.equals(t2)){
                    result = "Yes";
                    return result;
                } else {
                    l1--;
                    l2--;
                }
            }
        } else if (l1 > l2) {
            l1 = 0;
            l2 = 0;
            while (l2 < tArray.length && k > 0){
                if (sArray[l1] != tArray[l2]){
                    sArray[l1] = tArray[l2];
                    k -= 2;
                }
                String s2 = new String(sArray);
                String t2 = new String(tArray);
                if (s2.equals(t2)){
                    result = "Yes";
                    return result;
                } else {
                    l1++;
                    l2++;
                }
            }
            if ((sArray.length-1-l1 < k)){
                result = "Yes";
            }
        } else if (l1 < l2) {
            l1 = 0;
            l2 = 0;
            while (l1 < sArray.length && k > 0){
                if (sArray[l1] != tArray[l2]){
                    sArray[l1] = tArray[l2];
                    k -= 2;
                }
                String s2 = new String(sArray);
                String t2 = new String(tArray);
                if (s2.equals(t2)){
                    result = "Yes";
                    return result;
                } else {
                    l1++;
                    l2++;
                }
            }
            if ((tArray.length-1-l1 < k)){
                result = "Yes";
            }
        }

        return result;

    }

    //another solution working 100%
    public static String appendAndDelete2(String s, String t, int k){
        int count=0,lcs,lct,tot;
        int c = s.length()>=t.length()?t.length():s.length();
        for(int i=0;i<c;i++)
        {
            if(s.charAt(i)==t.charAt(i))
            {
                count++;
            }
            else{
                break;
            }
        }
        lcs=s.length()-count;
        lct=t.length()-count;
        tot=lcs+lct;
        if(s.length()+t.length()<k)
        {
            return "Yes";
        }
        else{
            if(tot%2==0 && k%2==0)
            {
                if(k<tot){
                    return "No";
                }
                else{
                    return "Yes";
                }
            }
            else if(tot%2!=0 && k%2!=0)
            {
                if(k<tot){
                    return "No";
                }
                else{
                    return "Yes";
                }
            }
            else{
                return "No";
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(appendAndDelete("abc", "def", 6));
        System.out.println(appendAndDelete("hackerhappy", "hackerrank", 9));
        System.out.println(appendAndDelete("aba", "aba", 7));
        System.out.println(appendAndDelete("ashley", "ash", 2));
        System.out.println(appendAndDelete("ashley", "ash", 3));
        System.out.println(appendAndDelete("ashley", "ash", 8));
        System.out.println(appendAndDelete("ash", "ashley", 3));

    }
}
