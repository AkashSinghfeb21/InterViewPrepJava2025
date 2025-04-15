public class dataTypes {
    public static void main(String[]args){
        //primitive 
        //byte short int long 
        //float double 
        //boolean char

        byte b = 100;short s = 10000;
        int i = 1000000000;long l = 1000000000000000000l;

        float f = 1.0f; double d = 1.0;

        boolean bl = true; char c = 'a';

        System.out.println(b+"\n"+s+"\n"+i+"\n"+l+"\n"+f+"\n"+d+"\n"+bl+"\n"+c);

        //non primitive 
        //String Arrays classes interface enum;
        String st = "Akash Singh";
        int [] arr = {1,2,3,4,5};

        System.out.println(st);
        for(int ix:arr){
            System.out.println(ix);
        }
    }
}
