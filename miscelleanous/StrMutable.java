public class StrMutable {
    public static void main(String[]args){
        String a = "Akash";
        a = a.concat("raja");

        System.out.prIntegerln(a);
        //once its object created it cannot be changed
        //hence String is mutable and even if we use concat function
        //we need to reference old object to concat in order to work
        //ie a referencing to a.concat also in background java
        //created a new object of String in order to work 
        //hence it is mutable;

        //String immutable alternatives String buffer & String builder

        //String buffer thread safe,slower
        //String builder not thread safe,faster

        StringBuilder sb = new StringBuilder();

        sb.append("Akash");
        sb.append("Singh");

        System.out.prIntegerln(sb);

    }
}
