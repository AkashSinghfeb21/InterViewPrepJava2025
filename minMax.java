import java.util.List;
import java.util.ArrayList;
public class minMax {
    public static void miniMaxSum(List<Integer> arr){
      Integer min=arr.get(0),max=arr.get(0);
      Integer sum = 0; 
      for(int i=0;i<arr.size();i++){
        int current = arr.get(i);
        sum += current;
        if(current<min){
           min = current; 
        }else if(current>max){
            max = current;
        }
      }
      long minsum = sum-max;
      long maxsum = sum-min;

      System.out.println(minsum+"\n"+maxsum);
    }
    public static void main(String[]args){
     List<Integer> list = new ArrayList<>();
     
     // 1 2 3 4 5=

     for(int i=1;i<=5;i++){
        list.add(i);
     }

     miniMaxSum(list);
    }
}
