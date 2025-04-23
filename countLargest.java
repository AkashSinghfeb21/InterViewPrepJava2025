//n = 15
//{1,10},{2,11},{3,12},{4,13},{5,14},{6,15},{7},{8},{9}.

import java.util.HashMap;
import java.util.Map;

public class countLargest {
    public int countLargestGroup(int n) {
        Map<Integer, Integer> map = new HashMap<>();
        int maxSize = 0;
        
        for (int i = 1; i <= n; i++) {
            int sum = digitSum(i);
            map.put(sum, map.getOrDefault(sum, 0) + 1);
            maxSize = Math.max(maxSize, map.get(sum));
        }
        int count = 0;
        for (int size : map.values()) {
            if (size == maxSize) {
                count++;
            }
        }
        return count;
    }
    private int digitSum(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
    public static void main(String[]args){
        System.out.println(new countLargest().countLargestGroup(15));
    }
}
