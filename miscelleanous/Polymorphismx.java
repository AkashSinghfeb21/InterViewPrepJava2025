//one can have many forms
//overloading overriding
//also known as 
//CompileTime polymorphism and Runtime Polymorphism

//overloading
class Mathematics{
    public int add(int a,int b){
     return a+b;
    }

    public int add(int a,int b,int c){
        return a+b+c;
    }
    
    public void ola(){
        System.out.println("Heloo Sir");
    }
}

class B extends Mathematics{
    @Override
    public void ola(){
        System.out.println("hello from b");
    }
}

public class Polymorphismx {
    public static void main(String[]args){
        Mathematics obj = new Mathematics();

        System.out.println(obj.add(1, 2));

        System.out.println(obj.add(1, 2,3));

        B obj2 = new B();

        obj2.ola();
    }
}
