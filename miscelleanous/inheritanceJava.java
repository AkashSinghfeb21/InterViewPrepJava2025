//Single level inheritance
/*class animal{
     public void sound(){
        System.out.prIntegerln("makes Sound");
     }
}

class dog extends animal{
      
}*/

//multiLevel inheritance
/*class animal{
    public void sound(){
        System.out.prIntegerln("makes sound");
    }
}

class mammal extends animal{
    
}

class cat extends mammal{

}*/

//hierarchical 
class parent{
    public void sound(){
        System.out.prIntegerln("makes sound");
    }
}

class a extends parent{

}

class b extends parent{

}

public class inheritanceJava {
    public static void main(String[]args){
    //    dog d = new dog();

    //    cat c = new cat();
   
          a obj = new a();
          
          b obj2 = new b();

          obj.sound();
          obj2.sound();

    }
}
