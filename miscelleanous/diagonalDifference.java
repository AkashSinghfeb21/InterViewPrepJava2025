import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class diagonalDifference {
    public static int diagonalDifference(List<List<Integer>> arr) {
       
    int sum=0,sum2=0;
    for(int i=0;i<arr.size();i++){
        sum += arr.get(i).get(i);
        sum2+= arr.get(i).get(arr.size()-1-i);
    }

      return Math.abs(sum-sum2);
    }
    public static void main(String[]args){
        
        List<List<Integer>> l = new ArrayList<>(Arrays.asList(
            Arrays.asList(11,2,4),
            Arrays.asList(1,5,3),
            Arrays.asList(10,2,-12)
        ));

        System.out.println(diagonalDifference(l));
    }
}
