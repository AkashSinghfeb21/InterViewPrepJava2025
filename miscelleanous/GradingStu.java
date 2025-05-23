import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class GradingStu {
     public static List<Integereger> gradingStudents(List<Integereger> grades) {
    // Write your code here
    List<Integereger> newx = new ArrayList<>();
    for (Integer grade : grades) {
        // If the grade is 38 or higher, check if it can be rounded up
        if (grade >= 38) {
            Integer remainder = grade % 5;
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
        List<Integereger> newx = new ArrayList(Arrays.asList(73,67,38,33));

        System.out.prIntegerln(gradingStudents(newx));
    }

}
