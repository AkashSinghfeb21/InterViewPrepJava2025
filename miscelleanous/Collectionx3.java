//Comparator vs Comparable
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


class employee implements Comparable<employee>{
     public int id;
     public String name;

     public employee(int id,String name){
        this.id = id;
        this.name = name;
     }

     public int getId(){
        return id;
     }

     public int compareTo(employee that){
      return this.id<that.id?1:-1;
     }

     public String toString(){
        return id+" "+name;
     }
}
public class Collectionx3 {
    public static void main(String[]args){
       //descending
    //    Comparator <Integer> com = new Comparator<Integer>(){
    //        public int compare(Integer i,Integer j){
    //              return (i<j)?1:(i>j)?-1:0;
    //        }
    //    };

       //last digit compare sort in ascending in two digits no
    //    Comparator <Integer> com = new Comparator<Integer>(){
    //     public int compare(Integer i,Integer j){
    //            return (i%10>j%10)?1:-1;  
    //     }
    //    };
    

    //    ArrayList<Integer> list = new ArrayList<>();

    //    for(Integer i=11;i<21;i++){
    //     list.add(i);
    //    }

       Comparator<employee> com = new Comparator<employee>() {
          public int compare(employee i,employee j){
           return i.id<j.id?1:-1;
          }
       };

       ArrayList<employee> list = new ArrayList<>();

       list.add(new employee(1,"Akash Singh"));
       list.add(new employee(2,"Aditya Singh"));

       System.out.println(list);

    //    Collections.sort(list,com);

       Collections.sort(list);

       System.out.println(list);
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