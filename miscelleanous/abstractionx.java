//1)interface 2)abstract
@FunctionalInterface
interface a {
    public void sound();
    //public void allo();
}

abstract class ax{
  abstract void func();
  public void funges(){
    System.out.println("you will get fungus");
  }
}

public class abstractionx {
    public static void main(String[]args){
    //anonymous class
    // a obj = new a(){
    //   public void sound(){
    //     System.out.println("hello sir");
    //   }
    //   public void allo(){
    //     System.out.println("hello sir x2");
    //   }           
    // };

    //lambda 
    // a obj = ()->System.out.println("hello from lambda");

    //  obj.sound();
    // obj.allo();

    ax obj = new ax(){
       void func(){
        System.out.println("hello from abstract func");
       }   
    };

    obj.func();
    

  }
}
