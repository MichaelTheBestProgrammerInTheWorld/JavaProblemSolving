import java.util.ArrayList;
import java.util.List;

public class AngryProfessor {

    static String angryProfessor(int k, int[] a) {

        String isClassCancelled = "NO";
        List<Integer> lateStudentsList = new ArrayList<>();
        for (int i=0; i<a.length; i++){
            if (a[i] > 0){
                lateStudentsList.add(a[i]);
            }
        }
        int ontimeStudents = a.length - lateStudentsList.size();
        if (k > ontimeStudents){
            isClassCancelled = "YES";
        }

        return isClassCancelled;
    }

    public static void main(String[] args) {

        System.out.println(angryProfessor(3, new int[]{-1, -3, 4, 2}));
        System.out.println(angryProfessor(2, new int[]{0, -1, 2, 1}));
    }

}
