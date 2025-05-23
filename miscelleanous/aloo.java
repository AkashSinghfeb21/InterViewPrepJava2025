import java.sql.*;
public class aloo {
    public static void main(String[]args)throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
        
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","Wrestlemania35");

        Statement st = con.createStatement();

        ResultSet rs = st.executeQuery("select*from human");

        while(rs.next()){
            System.out.println(rs.getInt(1)+":"+
            rs.getString(2)+":"+rs.getString(3));
        }

        st.close();
        con.close();
    }
}
