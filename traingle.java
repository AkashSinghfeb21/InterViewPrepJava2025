public class traingle {
    public static void printTriangle(Integer n,String a){
        
        for(Integer i=n;i>0;i--){
        for(Integer j=0;j<=i;j++){
            System.out.print(" ");
        }
        for(Integer j=0;j<=2*(n-i);j++){
            System.out.print(a.charAt(j));
        }
        System.out.println();
       }
    }
    public static void main(String[]args){
      printTriangle(3,"Akash");
    }
}

 