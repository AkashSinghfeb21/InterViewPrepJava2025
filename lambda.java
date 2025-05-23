@FunctionalInterface
interface Axx{
 public void hello();
}

public class lambda {
    public static void main(String[]args){
        Axx obj = ()->System.out.println("hello ji");

        obj.hello();
    }    
}
