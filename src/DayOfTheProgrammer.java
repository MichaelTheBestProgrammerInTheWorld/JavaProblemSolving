public class DayOfTheProgrammer {

    // Complete the dayOfProgrammer function below.
    static String dayOfProgrammer(int year) {

        //this is the sum of days of months from Jan to Aug except of Feb
        final int sumDays = 31 + 31 + 30 + 31 + 30 + 31 + 31;
        int programmersDay = 0;
        int febDays = 28;

        if (year == 1918){
            febDays -= 13;

        } else if (year < 1918){
            if (year%4 == 0){
                febDays = 29;
            }
        } else if (year > 1918){
            if (year%400 == 0 || (year%4 == 0 && year%100 != 0)){
                febDays = 29;
            }
        }

        programmersDay = 256 - (sumDays + febDays);
        String programmersDayDate = String.valueOf(programmersDay) + ".09." + String.valueOf(year);

        return programmersDayDate;
    }

    public static void main(String[] args) {

        System.out.print(dayOfProgrammer(2016));
    }
}
