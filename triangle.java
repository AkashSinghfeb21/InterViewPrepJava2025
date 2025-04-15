public class triangle {
    public static void printTriangle(int n){
      for(int i=n;i>=0;i--){
        for(int j=0;j<=i;j++){
            System.out.print(" ");
        }
        for(int j=0;j<=2*(n-i);j++){
            System.out.print("*");
        }
        System.out.println();
      } 
    }
    public static void main(String[]args){
      printTriangle(4);
    }
}
