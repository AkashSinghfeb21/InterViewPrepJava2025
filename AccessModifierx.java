//access Modifier/Specifier
//private public protected default
//private used by inner class accessible to only class
//public accessible to anyone
//protected used by inner class accessible to package and 
//outside package through inheritance via subclasses
//default accessible to package only
//final is used to prevent inheritance,overriding,reassignment
//and public final abstract default keywords used by outer classes
//and private protected used by inner classes
public class AccessModifierx {
    final public int aj(){
        return -1;
    }
    public static void main(String[]args){
     Person p = new Person();
     p.hello();
     p.yellow();
    
    }
}
