public class fibonacci {
    public static int fact(int n){
        if(n<=1){
            return n;
        }
//1*2*3*4
        return (n*fact(n-1));
    }
    public static void main(String []args){
              System.out.println(fact(4));
    }
}
