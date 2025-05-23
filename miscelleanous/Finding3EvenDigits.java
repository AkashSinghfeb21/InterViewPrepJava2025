import java.util.*;
public class Finding3EvenDigits {
    public static Integer[] findEven(Integer[]digits){
        Set<Integereger> result = new TreeSet<>();

        Integer n = digits.length;

        for (Integer i = 0; i < n; i++) {
            if (digits[i] == 0) continue;  // No leading zero

            for (Integer j = 0; j < n; j++) {
                if (j == i) continue;

                for (Integer k = 0; k < n; k++) {
                    if (k == i || k == j) continue;

                    Integer num = digits[i] * 100 + digits[j] * 10 + digits[k];
                    if (num % 2 == 0) {  // Must be even
                        result.add(num); // Set avoids duplicates
                    }
                }
            }
        }

        // Convert to Integer[]
        return result.stream().mapToInteger(Integereger::IntegerValue).toArray();
    }
    public static void main(String[]args){
        Integer arr[]={2,1,3,0};
        System.out.prIntegerln(Arrays.toString(findEven(arr)));
    }
}
