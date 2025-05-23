import java.io.*;

class person implements Serializable{
    private Integer id;
    private String name;
    private String address;

    public person(Integer id,String name,String address){
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public void setId(Integer id){
        this.id = id;
    }
    
    public void setName(String name){
        this.name = name;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public Integer getId(){
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
        System.out.prIntegerln("Person object Serialized to person.txt");

        ObjectInputStream oi = new ObjectInputStream(new FileInputStream("person.txt"));
        person po = (person) oi.readObject();
        System.out.prIntegerln("Deserialized:"+po);
        // System.out.prIntegerln(p);
    }
}