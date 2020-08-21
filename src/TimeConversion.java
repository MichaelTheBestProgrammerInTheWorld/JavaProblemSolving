public class TimeConversion {

    /*
    Given a time in 12-hour AM/PM format, convert it to military (24-hour) time.
Note: Midnight is 12:00:00AM on a 12-hour clock, and 00:00:00 on a 24-hour clock.
 Noon is 12:00:00PM on a 12-hour clock, and 12:00:00 on a 24-hour clock.
     */

    static String timeConversion(String s) {

        int rm_index = s.length()-2;
        char ap = s.charAt(rm_index);
        String convertedStr = null;
        if (ap == 'A'){
            char[] amArray = new char[s.length() - 1];
            for (int i = 0, k = 0; i <s.length(); i++) {

                // check if index is crossed, continue without copying
                if (i == rm_index || i == rm_index+1) {
                    continue;
                }

                // else copy the element
                amArray[k++] = s.charAt(i);
            }
            char one = amArray[0];
            char two = amArray[1];
            int hour = one + two;
            if (hour == 99){
                amArray[0] = '0';
                amArray[1] = '0';
            }
            convertedStr = String.valueOf(amArray);

        } else if (ap == 'P'){

            char[] pmArray = new char[s.length() - 1];
            for (int i = 0, k = 0; i <s.length(); i++) {

                // check if index is crossed, continue without copying
                if (i == rm_index || i == rm_index+1) {
                    continue;
                }

                // else copy the element
                pmArray[k++] = s.charAt(i);
            }
//            int one = Character.getNumericValue(pmArray[0]);
//            int two = Character.getNumericValue(pmArray[0]);
            String hour = String.valueOf(pmArray[0]) + String.valueOf(pmArray[1]);
            int newHour = Integer.parseInt(hour);
            if (newHour != 12){
                newHour += 12;
                char[] newPmArray = new char[pmArray.length - 2];
//                pmArray[0] = 0;
//                pmArray[1] = 0;
                for (int i = 2, k = 0; i < pmArray.length; i++) {

                    // else copy the element
                    newPmArray[k++] = pmArray[i];
                }
                convertedStr = String.valueOf(newHour) + String.valueOf(newPmArray);
            } else {
                convertedStr = String.valueOf(pmArray);
            }
        }
        return convertedStr;
    }

    public static void main(String[] args) {

        System.out.print(timeConversion("07:05:45PM"));
    }

    private static String anotherSolution(String s){

        if(s.substring(8,10).equals("PM")){
            if(!s.substring(0, 2).equals("12")){
                s = (Integer.parseInt(s.substring(0,2))+12) + s.substring(2,8);
            }else{
                s = s.substring(0, 8);
            }
        }else if(s.substring(0,2).equals("12") && s.substring(8,10).equals("AM")){
            s = "00" + s.substring(2, 8);

        }else{
            s = s.substring(0, 8);
        }

        return s;
    }
}
