import java.io.*;

class person implements Serializable{
    private int id;
    private String name;
    private String address;

    public person(int id,String name,String address){
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public void setId(int id){
        this.id = id;
    }
    
    public void setName(String name){
        this.name = name;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public String getAddress(){
        return address;
    }
    
    @Override
    public String toString(){
        return id+" "+name+" "+address;
    }
}

public class Serialization{
    public static void main(String[]args)throws IOException,ClassNotFoundException{
        person p = new person(1,"Akash Singh","A-58 vasant marg vasant vihar new delhi");

        ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream("person.txt"));
        o.writeObject(p);
        System.out.println("Person object Serialized to person.txt");

        ObjectInputStream oi = new ObjectInputStream(new FileInputStream("person.txt"));
        person po = (person) oi.readObject();
        System.out.println("Deserialized:"+po);
        // System.out.println(p);
    }
}