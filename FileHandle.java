// (serialization)Object->byteStream->txt->byteStream->Object (deserialization)
//                                   \   /
//                                    db  
import java.io.Serializable;
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.FileInputStream;
class human implements Serializable{
      private int id;
      private String name;
      private String city;

      public human(int id,String name,String city){
        this.id = id;
        this.name = name;
        this.city = city;
      }

      public int getId(){
        return id;
      }

      public String getName(){
        return name;
      }

      public String getCity(){
        return city;
      }

      @Override
      public String toString(){
        return id+":"+name+":"+city;
      }
}
public class FileHandle {
    public static void main(String[]args)throws Exception{
        
        human h = new human(1, "Aditya Singh", "Delhi");
        
        ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream("human.txt"));

        o.writeObject(h);

        ObjectInputStream oi = new ObjectInputStream(new FileInputStream("human.txt"));
        
        human hi = (human) oi.readObject();

        System.out.println(hi);

    }
}
