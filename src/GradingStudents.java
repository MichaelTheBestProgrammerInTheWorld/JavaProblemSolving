import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class GradingStudents {

    /*
    HackerLand University has the following grading policy:
    Every student receives a grade in the inclusive range from 0 to 100.
    Any grade less than 40 is a failing grade.
    Sam is a professor at the university and likes to round each student's grade according to these rules:
    If the difference between the grade and the next multiple of 5 is less than 3, round grade up to the next
     multiple of 5.
    If the value of grade is less than 38, no rounding occurs as the result will still be a failing grade.
     */

    public static List<Integer> gradingStudents(List<Integer> grades) {
        // Write your code here

        List<Integer> roundedGrades = new ArrayList<>(grades.size());
        for (int i=0; i<grades.size(); i++){
            int studentGrade = grades.get(i);
            if (studentGrade < 38){
                roundedGrades.add(studentGrade);
            } else if (studentGrade%5 == 0){
                roundedGrades.add(studentGrade);
            } else if (studentGrade%5 ==3){
                studentGrade += 2;
                roundedGrades.add(studentGrade);
            } else if (studentGrade%5 ==4){
                studentGrade ++;
                roundedGrades.add(studentGrade);
            } else {
                roundedGrades.add(studentGrade);
            }
        }
        return roundedGrades;
    }

    public static void main(String[] args) {
        List<Integer> grades = new ArrayList<Integer>();
        grades.add(85);
        grades.add(74);
        grades.add(63);
        grades.add(40);
        grades.add(28);
        grades.add(38);
        grades.add(52);
        grades.add(91);
        System.out.print(gradingStudents(grades));
    }
}
