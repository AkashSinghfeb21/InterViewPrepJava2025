public class traingle {
    public static void prIntegerTriangle(Integer n){
       for(Integer i=n;i>0;i--){
        for(Integer j=0;j<=i;j++){
            System.out.prInteger(" ");
        }
        for(Integer j=0;j<=2*(n-i);j++){
            System.out.prInteger("*");
        }
        System.out.prIntegerln();
       }
    }
    public static void main(String[]args){
      prIntegerTriangle(4);
    }
}
