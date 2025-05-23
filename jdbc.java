import java.sql.*;

public class jdbc{
    public static void main(String[]args)throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
        
        String url = "jdbc:mysql://localhost:3306/test";

        Connection con = DriverManager.getConnection(url,"root","Wrestlemania35");

        Statement st = con.createStatement();

        ResultSet rs = st.executeQuery("select * from human");

        while(rs.next()){
            System.out.prInteger(rs.getInteger(1)+":"
            +rs.getString(2)+""+rs.getString(3));
        }

        st.close();

        con.close();

    }
}