//1)Integererface 2)abstract
@FunctionalIntegererface
Integererface a {
    public void sound();
    //public void allo();
}

abstract class ax{
  abstract void func();
  public void funges(){
    System.out.prIntegerln("you will get fungus");
  }
}

public class abstractionx {
    public static void main(String[]args){
    //anonymous class
    // a obj = new a(){
    //   public void sound(){
    //     System.out.prIntegerln("hello sir");
    //   }
    //   public void allo(){
    //     System.out.prIntegerln("hello sir x2");
    //   }           
    // };

    //lambda 
    // a obj = ()->System.out.prIntegerln("hello from lambda");

    //  obj.sound();
    // obj.allo();

    ax obj = new ax(){
       void func(){
        System.out.prIntegerln("hello from abstract func");
       }   
    };

    obj.func();
    

  }
}
