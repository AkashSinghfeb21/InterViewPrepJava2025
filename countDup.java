public class countDup {
    public static void countDup(String x){
        char arr[] = x.toCharArray();

        int count=0;

        for(int i=0;i<arr.length;i++){
           count=1;
           for(int j=i+1;j<arr.length;j++){
            if(arr[i]==arr[j]){
                count++;
                arr[j]='0';
            }
           }
           if(count>=1&&arr[i]!='0'){
            System.out.print(arr[i]+""+count);
           }
        }
    }
    public static void main(String[]args){
        String a = "Aakash";

        countDup(a.toUpperCase());
    }
}
