package december2020;

import java.util.ArrayList;
import java.util.Collections;

public class StringSplit {

    //some test cases failed

    static String[] finalSplitedTwoWords;

    public static String ArrayChallenge(String[] strArr) {
        // code goes here

        constructResult(strArr[0], getWordsInDictionary(strArr));
        String[] splitedTwoWords = finalSplitedTwoWords;

        String result;
        if (splitedTwoWords[0] != null && splitedTwoWords[1] != null) {
            result = splitedTwoWords[0] + "," + splitedTwoWords[1];
            for (int i = 0; i < splitedTwoWords[0].length(); i++) {
                if (splitedTwoWords[0].charAt(i) != strArr[0].charAt(i)) {
                    result = splitedTwoWords[1] + "," + splitedTwoWords[0];
                    break;
                }
            }
        } else {
            result = "not possible";
        }

        return result;
    }

    static void constructResult(String base, ArrayList<String> dict) {

        String[] splitedTwoWords = new String[2];

        int index = 0;
        loop:
        for (String word : dict) {
            if (index == 2) {
                String testing = splitedTwoWords[0].trim() + splitedTwoWords[1].trim();
                if (base.length() == testing.length()) {
//                    if (base.equals(testing) || base.equals(splitedTwoWords[1].trim() + splitedTwoWords[0].trim())){
//                        finalSplitedTwoWords = splitedTwoWords;
//                        break loop;
//                    } else {
//                        Collections.sort(dict);
//                        constructResult(base, dict);
//                    }
                    finalSplitedTwoWords = splitedTwoWords;
                    break loop;

                } else {
                    ArrayList<String> modifiedDict = new ArrayList<>(dict);
                    if (splitedTwoWords[0].trim().length() > splitedTwoWords[1].trim().length()) {
                        modifiedDict.remove(splitedTwoWords[1]);
                    } else {
                        modifiedDict.remove(splitedTwoWords[0]);
                    }
                    constructResult(base, modifiedDict);
                    break loop;
                }
            }

            if (base.contains(word.trim())) {
                splitedTwoWords[index++] = word;
            }
        }

    }


    static ArrayList<String> getWordsInDictionary(String[] strArr) {

        ArrayList<String> dictionary = new ArrayList<>();
        char[] singleWordArr = new char[strArr[1].length()];
        int index = 0;
        for (int i = 0; i < strArr[1].length(); i++) {
            if (strArr[1].charAt(i) == ',') {
                String singleWord = String.valueOf(singleWordArr).trim();
                dictionary.add(singleWord);
                index = 0;
                singleWordArr = new char[0];
                singleWordArr = new char[strArr[1].length()];
            } else {
                singleWordArr[index++] = strArr[1].charAt(i);
            }
        }

        if (singleWordArr.length != 0) {
            dictionary.add(String.valueOf(singleWordArr).trim());
        }

        return dictionary;
    }

    public static void main(String[] args) {

        String[] dummy = {"programminga7a",
                "hello,world,java,programming,lang"};
        String[] dummy2 = new String[]{"baseball", "a,all,b,ball,bas,base,cat,code,d,e,quit,z"};
//        for (String word : getWordsInDictionary(dummy)){
//            System.out.println(word);
//        }
        String[] dummy3 = new String[] {"abcgefd", "a,ab,abc,abcg,b,c,dog,e,efd,zzzz"};
        String[] dummy4 = new String[] {"abc", "a,b,c,d,e,f,g,h,i,j,k,l,m,n,o"};
        String[] dummy5 = new String[] {"abbbbcd","a,ab,b,bbbc,c,d,dog,elf,f,farm,go,goal,hello"};
        String[] dummy6 = new String[] {"coding", "a,b,c,cc,ccc,ccccc,cod,code,i,in,innnnnn,j,k,x,y,z,zebra"};

        System.out.println(ArrayChallenge(dummy3));
    }
}
