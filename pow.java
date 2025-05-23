public class pow {
    public static int printpow(int base,int ex){
        int result = 1;
        for(int i=0;i<ex;i++){
           result *=base;
        }

        return result;
    }
    public static void main(String[]args){
        System.out.println(printpow(4, 2));
    }
}
