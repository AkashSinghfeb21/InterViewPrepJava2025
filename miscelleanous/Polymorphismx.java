//one can have many forms
//overloading overriding
//also known as 
//CompileTime polymorphism and Runtime Polymorphism

//overloading
class Mathematics{
    public Integer add(Integer a,Integer b){
     return a+b;
    }

    public Integer add(Integer a,Integer b,Integer c){
        return a+b+c;
    }
    
    public void ola(){
        System.out.prIntegerln("Heloo Sir");
    }
}

class B extends Mathematics{
    @Override
    public void ola(){
        System.out.prIntegerln("hello from b");
    }
}

public class Polymorphismx {
    public static void main(String[]args){
        Mathematics obj = new Mathematics();

        System.out.prIntegerln(obj.add(1, 2));

        System.out.prIntegerln(obj.add(1, 2,3));

        B obj2 = new B();

        obj2.ola();
    }
}
