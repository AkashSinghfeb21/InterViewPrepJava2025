public class countFreq {
    public static void countFrequencies(String x){
        int count=0;
        for(int i=0;i<x.length();i++){
            count=1;
           
              while(i+1<x.length() && x.charAt(i)==x.charAt(i+1) ){
                i++;
                count++;
              } 
            System.out.print(x.charAt(i)+""+count);
        }
    }
    public static void main(String[]args){
      String a = "Aakaash";  

      countFrequencies(a.toUpperCase());
    }
}
