// Sample Input 
// 07:05:45PM
// Sample Output 
// 19:05:45
public class TimeConvert {
    public static String timeConversion(String n){

        String arr[] = n.substring(0,8).split(":");

        int hour = Integer.parseInt(arr[0]); 

        if(n.contains("AM")){
          if(hour==12){
            hour=0;
          }
        }else if(n.contains("PM")){
            if(hour!=12){
                hour+=12;
            }
        }

        return String.format("%02d:%s:%s",hour,arr[1],arr[2]);
    }
    public static void main(String[]args){
      System.out.println(timeConversion("12:00:00AM"));
    }
}
