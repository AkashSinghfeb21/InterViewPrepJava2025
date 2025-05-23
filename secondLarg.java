import java.util.*;
public class secondLarg {

    public static void sort(Integer arr[]){
        for(Integer i=0;i<arr.length;i++){
            for(Integer j=i+1;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    Integer temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    public static void main(String[]args){
        Integer arr[]={1,1,2,2,3,3,3,4,4,4,4,5,5,5,5};

        Set<Integer> set = new HashSet<>(Arrays.asList(arr));

        Integer arrx[] = new Integer[set.size()];

        set.toArray(arrx);

        sort(arrx);
        
        System.out.println("Second Highest Value:"+""+arrx[1]);
    }
}
