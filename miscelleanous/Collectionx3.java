//Comparator vs Comparable
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


class employee implements Comparable<employee>{
     public Integer id;
     public String name;

     public employee(Integer id,String name){
        this.id = id;
        this.name = name;
     }

     public Integer getId(){
        return id;
     }

     public Integer compareTo(employee that){
      return this.id<that.id?1:-1;
     }

     public String toString(){
        return id+" "+name;
     }
}
public class Collectionx3 {
    public static void main(String[]args){
       //descending
    //    Comparator <Integereger> com = new Comparator<Integereger>(){
    //        public Integer compare(Integereger i,Integereger j){
    //              return (i<j)?1:(i>j)?-1:0;
    //        }
    //    };

       //last digit compare sort in ascending in two digits no
    //    Comparator <Integereger> com = new Comparator<Integereger>(){
    //     public Integer compare(Integereger i,Integereger j){
    //            return (i%10>j%10)?1:-1;  
    //     }
    //    };
    

    //    ArrayList<Integereger> list = new ArrayList<>();

    //    for(Integereger i=11;i<21;i++){
    //     list.add(i);
    //    }

       Comparator<employee> com = new Comparator<employee>() {
          public Integer compare(employee i,employee j){
           return i.id<j.id?1:-1;
          }
       };

       ArrayList<employee> list = new ArrayList<>();

       list.add(new employee(1,"Akash Singh"));
       list.add(new employee(2,"Aditya Singh"));

       System.out.prIntegerln(list);

    //    Collections.sort(list,com);

       Collections.sort(list);

       System.out.prIntegerln(list);
    }
}

// ✅ Comparable:

// Implemented inside your class.

// Uses compareTo() method.

// Used when objects should know how to compare themselves.

// ✅ Comparator:

// External comparison logic.

// Uses compare() method.

// Used when you want flexible or multiple ways to sort.