import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
class Result {

    /*
     * Complete the 'birthdayCakeCandles' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY candles as parameter.
     */

    public static int birthdayCakeCandles(List<Integer> candles) {
    // Write your code here
     int max=candles.get(0);
     int count=0;
     for(int i=0;i<candles.size();i++){
        if(candles.get(i)>max){
           max = candles.get(i);
           count=1;     
        }else if(candles.get(i)==max){
            count++;
        }
     }
     
     return count;
    }

}

public class BirthdayCake{
    public static void main(String[]args){
    List <Integer> list = new ArrayList<>(Arrays.asList(18,90,90,13,90,75,90,8,90,43));
    
    System.out.println(Result.birthdayCakeCandles(list));
    
    }
}