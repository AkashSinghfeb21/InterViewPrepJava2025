public class ExceptionHandling {
  public static void main(String[]args)throws Exception{
    // try{
    //   //  System.out.println(1/0);
    //   throw new Exception();
    // }catch(Exception e){
    //   System.out.println("Exception "+e);
    // }finally{
    //   System.out.println("this will print anyway");
    // }

    System.out.println("this will not print");

    throw new Exception();
  }     
}
