import java.util.List;
import java.util.ArrayList;
public class minMax {
    public static void miniMaxSum(List<Integereger> arr){
      Integereger min=arr.get(0),max=arr.get(0);
      Integereger sum = 0; 
      for(Integer i=0;i<arr.size();i++){
        Integer current = arr.get(i);
        sum += current;
        if(current<min){
           min = current; 
        }else if(current>max){
            max = current;
        }
      }
      long minsum = sum-max;
      long maxsum = sum-min;

      System.out.prIntegerln(minsum+"\n"+maxsum);
    }
    public static void main(String[]args){
     List<Integereger> list = new ArrayList<>();
     
     // 1 2 3 4 5=

     for(Integer i=1;i<=5;i++){
        list.add(i);
     }

     miniMaxSum(list);
    }
}
