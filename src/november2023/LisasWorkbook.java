package november2023;

/*
https://www.hackerrank.com/challenges/lisa-workbook/problem?isFullScreen=false
 */

import java.util.ArrayList;
import java.util.List;

public class LisasWorkbook {

    public static int workbook(int n, int k, List<Integer> arr) {
        // Write your code here
        int specialProblem = 0;
        int page = 1;
        int index = 0;
        int problemPerPage = 0;
        while (index < n){
            for (int p=1; p<=arr.get(index); p++){
                problemPerPage++;
                if (page == p){
                    specialProblem++;
                }
                if (p == arr.get(index)){
                    index++;
                    page++;
                    problemPerPage = 0;
                    break;
                }
                if (problemPerPage == k){
                    page++;
                    problemPerPage = 0;
                }
            }
        }

        return specialProblem;
    }

    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        list1.add(4);
        list1.add(2);
        System.out.println(workbook(list1.size(), 3, list1));
        list2.add(4);
        list2.add(2);
        list2.add(6);
        list2.add(1);
        list2.add(10);
        System.out.println(workbook(list2.size(), 3, list2));
    }
}
