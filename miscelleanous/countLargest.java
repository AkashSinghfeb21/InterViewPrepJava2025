//n = 15
//{1,10},{2,11},{3,12},{4,13},{5,14},{6,15},{7},{8},{9}.

import java.util.HashMap;
import java.util.Map;

public class countLargest {
    public Integer countLargestGroup(Integer n) {
        Map<Integereger, Integereger> map = new HashMap<>();
        Integer maxSize = 0;
        
        for (Integer i = 1; i <= n; i++) {
            Integer sum = digitSum(i);
            map.put(sum, map.getOrDefault(sum, 0) + 1);
            maxSize = Math.max(maxSize, map.get(sum));
        }
        Integer count = 0;
        for (Integer size : map.values()) {
            if (size == maxSize) {
                count++;
            }
        }
        return count;
    }
    private Integer digitSum(Integer num) {
        Integer sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
    public static void main(String[]args){
        System.out.prIntegerln(new countLargest().countLargestGroup(15));
    }
}
