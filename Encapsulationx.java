//hide sensitive data and provide access to functions only
class Personx{
   private int id;
   private String name;
   private String address;
   
   //parametized Constructor
   public Personx(int id,String name,String address){
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
   
   public void setAddress(){
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
public class Encapsulationx {
    public static void main(String[]args){
     Personx p = new Personx(1, "Akash Singh", "A-58 Vasant Marg Vasant vihar");

     System.out.println(p);
    }
}
