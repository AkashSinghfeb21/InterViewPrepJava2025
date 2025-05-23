import java.util.Objects;
import java.util.HashSet;

class personxoxo{
   private Integer id;
   private String name;
   private String city;

   public personxoxo(Integer id,String name,String city){
   this.id = id;
   this.name = name;
   this.city = city;
   }

   public Integer getId(){
    return id;
   }

   public String getName(){
    return name;
   }
   
   public String getCity(){
    return city;
   }

   @Override
   public boolean equals(Object o){
    personxoxo p = (personxoxo) o;

    return this.id==p.id?true:false;
   }

   @Override
   public Integer hashCode(){
    return Objects.hash(id);
   }

   @Override
   public String toString(){
    return id+" "+name+" "+city;
   }
}
public class Collectionx2 {
    public static void main(String[]args){
        personxoxo p = new personxoxo(1, "Akash", "Delhi");

        personxoxo p2 = new personxoxo(1, "Aditya", "Delhi");

        HashSet<personxoxo> h = new HashSet<>();

        h.add(p);
        h.add(p2);

        System.out.prIntegerln(h);
    }
}
