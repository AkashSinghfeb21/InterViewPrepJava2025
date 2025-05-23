import java.util.*;
public class Finding3EvenDigits {
    public static int[] findEven(int[]digits){
        Set<Integer> result = new TreeSet<>();

        int n = digits.length;

        for (int i = 0; i < n; i++) {
            if (digits[i] == 0) continue;  // No leading zero

            for (int j = 0; j < n; j++) {
                if (j == i) continue;

                for (int k = 0; k < n; k++) {
                    if (k == i || k == j) continue;

                    int num = digits[i] * 100 + digits[j] * 10 + digits[k];
                    if (num % 2 == 0) {  // Must be even
                        result.add(num); // Set avoids duplicates
                    }
                }
            }
        }

        // Convert to int[]
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
    public static void main(String[]args){
        int arr[]={2,1,3,0};
        System.out.println(Arrays.toString(findEven(arr)));
    }
}
