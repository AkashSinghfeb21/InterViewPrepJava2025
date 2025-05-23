import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class GradingStu {
     public static List<Integer> gradingStudents(List<Integer> grades) {
    // Write your code here
    List<Integer> newx = new ArrayList<>();
    for (int grade : grades) {
        // If the grade is 38 or higher, check if it can be rounded up
        if (grade >= 38) {
            int remainder = grade % 5;
            if (remainder >= 3) {
                newx.add(grade + (5 - remainder)); // Round up to the nearest multiple of 5
            } else {
                newx.add(grade); // No rounding needed
            }
        } else {
            newx.add(grade); // No change for grades below 38
        }
    }
    return newx;
    }

    public static void main(String[]args){
        List<Integer> newx = new ArrayList(Arrays.asList(73,67,38,33));

        System.out.println(gradingStudents(newx));
    }

}
